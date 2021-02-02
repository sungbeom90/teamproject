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
@RequestMapping("/nations")
public class NationsController {
		private static final Logger logger=
				LoggerFactory.getLogger(NationsController.class);
		
		@Resource
		private NationService nationService;
		
		@Resource
		private LocationService locationService;

		// 메인 -> 나라별 눌렀을때  리스트 나오는 화면. 서비스로 요청
		@GetMapping("/nationlist")
		public String nationlist(Model model) {
			logger.info("실행");
			List<NationDto> list = nationService.getNationList();			
			model.addAttribute("list",list);
			return "nations/nationlist";
		}
		
		@GetMapping("/nation")
		public String nation(Model model, int nation_id) {
			logger.info("실행");
			NationDto nation = nationService.getNation(nation_id);
			model.addAttribute("nation1", nation);
			return "nations/nationlist";
		}
		
		@GetMapping("/nationread")
		public String nationread(int nation_id, Model model) {
			logger.info("실행");
			NationDto nation = nationService.getNation(nation_id);
			List<LocationDto> list = locationService.getLocations(nation_id);
			model.addAttribute("nation", nation);
			model.addAttribute("list",list);
			return "nations/nation";
		}
		
		@GetMapping("/nimage")
		public void nimage(int nation_id, HttpSession session, HttpServletResponse response) throws Exception{
			
			NationDto nation = nationService.getNation(nation_id);
			String filePath=null;
			if(nation.getNimagesname() !=null) {   ///첨부파일이 있을때
				String nimagesname = nation.getNimagesname();
				String nname = nation.getNname();
				filePath = "D:/MyWorkspace/teamfiles/nations/" + nname + "/" + nimagesname; // 나라별 다른 폴더 이미지 가져오기.
				
			} else {							// 첨부파일이 없을때
				filePath = "D:/MyWorkspace/teamfiles/nations/defaultnimage.jpg";
			}
			OutputStream os= response.getOutputStream();
			InputStream is = new FileInputStream(filePath);
			
			FileCopyUtils.copy(is, os);
			os.flush();
			os.close();
			is.close();
			}
		

}
