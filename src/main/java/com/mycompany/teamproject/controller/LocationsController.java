package com.mycompany.teamproject.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.LocationPager;
import com.mycompany.teamproject.dto.OfferDto;
import com.mycompany.teamproject.service.LocationService;
import com.mycompany.teamproject.service.OfferService;




@Controller
@RequestMapping("/locations")
public class LocationsController {
		private static final Logger logger=
				LoggerFactory.getLogger(LocationsController.class);
		
		@Resource
		private LocationService locationService;
		/*private	NationService nationService;*/
		
		@Resource
		OfferService offerService;

	
		// 메인 -> 도시별 눌렀을때  리스트 나오는 화면. 서비스로 요청
		/*		@GetMapping("/locationlist")
				public String locationlist(Model model) {
					logger.info("실행");
					List<LocationDto> list = locationService.getLocationList();			
					model.addAttribute("list",list);
					return "locations/locationlist3";
				}*/
		
		//----------------------------------------------------------------
		@GetMapping("/locationlist")
		public String locationlist2(@RequestParam(defaultValue="1") int pageNo, Model model) {
			int totalRows = locationService.getTotalRows();
			LocationPager pager = new LocationPager(6,5, totalRows, pageNo);
			List<LocationDto> list = locationService.getLocationList(pager);
			model.addAttribute("list",list);
			model.addAttribute("pager",pager);
			return "locations/locationlist";
		}
		
		//----------------------------------------------------------------
		/*@GetMapping("/nation")
		public String nation(Model model, int nation_id) {
			logger.info("실행");
			NationDto nation = nationService.getNation(nation_id);
			model.addAttribute("nation1", nation);
			return "nations/nationlist3";
		}*/
		
		
		
		@GetMapping("/locationread")
		public String locationread(int location_id, Model model) {
			logger.info("실행");
			LocationDto location = locationService.getLocation(location_id);
			List<OfferDto> list = offerService.getOfferList(location_id);
			model.addAttribute("list",list);
			model.addAttribute("location", location);
			return "locations/location";
		}
		
		@GetMapping("/limage")
		public void limage(int location_id, HttpSession session, HttpServletResponse response) throws Exception{
			logger.info("실행");
			
			LocationDto location = locationService.getLocation(location_id);

			String filePath=null;
			if(location.getLimagesname() !=null) {   //첨부파일이 있을때
				String limagesname = location.getLimagesname();
				String lname = location.getLname();
				filePath = "D:/MyWorkspace/teamfiles/locations/" + lname + "/" + limagesname; // 도시별 다른 폴더 이미지 가져오기.
				//주소맞나모르껬음
			} else {							// 첨부파일이 없을때
				filePath = "D:/MyWorkspace/teamfiles/locations/defaultnimage.jpg";
			}
			OutputStream os= response.getOutputStream();
			InputStream is = new FileInputStream(filePath);
			
			FileCopyUtils.copy(is, os);
			os.flush();
			os.close();
			is.close();
			}
		
		//오퍼리드
			/*@GetMapping("offerread")
			public String offerread() {
				return "offers/offer3";
			}*/
		
		
		
}
