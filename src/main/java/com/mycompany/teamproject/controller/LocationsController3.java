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

import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.service.LocationService;
import com.mycompany.teamproject.service.NationService;



@Controller
@RequestMapping("/locations3")
public class LocationsController3 {
		private static final Logger logger=
				LoggerFactory.getLogger(LocationsController3.class);
		
		@Resource
		private LocationService locationService;
		/*private	NationService nationService;*/


		// http://.../teamproject/nations 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "nations/content";
		}
		// 메인 -> 도시별 눌렀을때  리스트 나오는 화면. 서비스로 요청
		@GetMapping("/locationlist")
		public String locationlist(Model model) {
			logger.info("실행");
			List<LocationDto> list = locationService.getLocationList();			
			model.addAttribute("list",list);
			return "locations/locationlist3";
		}
		
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
			model.addAttribute("location", location);
			return "locations/location3";
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
