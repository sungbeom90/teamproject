package com.mycompany.teamproject.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferDto;
import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.MemberService;
import com.mycompany.teamproject.service.OfferService;
import com.mycompany.teamproject.service.PartnerService;

@Controller
@RequestMapping("/offer")
public class OfferController {
		private static final Logger logger=
				LoggerFactory.getLogger(OfferController.class);
		
		@Resource
		private OfferService offerService;		
		@Resource
		private MemberService memberService;		
		@Resource
		private PartnerService partnerService;
		
		@Value("${database.offers}")
		private String offerDirPath;
		
		
				
		@GetMapping("/offerupload")
		public String offerUploadForm() {
			return "offers/offerupload";
		}
		@Transactional
		@PostMapping("/offerupload")
		public String offerUpload(OfferDto offer, HttpSession session) throws Exception {
			logger.info("실행");
			int mid = (int) session.getAttribute("sessionMid");
			
			PartnerDto pdto= partnerService.getPartner(mid);
			offer.setPartner_id(pdto.getPartner_id());
			offerService.offerRegister(offer);
			
			MultipartFile[] oimage_array = offer.getOfferImage();
			ImageDto imageDto = new ImageDto();
			for (MultipartFile oimage : oimage_array) {
				logger.info("파일전송 for문실행");
				if(!oimage.isEmpty()) {
					imageDto.setOffer_id(offer.getOffer_id());
					String oName = oimage.getOriginalFilename();
					imageDto.setIimageoname(oName);
					imageDto.setIimagetype(oimage.getContentType());
					File saveFile = new File(offerDirPath+offer.getOffer_id()+"/"+oName); 
					oimage.transferTo(saveFile);
					logger.info(""+imageDto.getOffer_id());
					offerService.imageRegister(imageDto);
					}
			}			
			session.setAttribute("sessionOffer_id",offer.getOffer_id());
			session.removeAttribute("sessionNo");
			return "redirect:/offer/courseupload";
		}
		@GetMapping("/courseupload")
		public String courseuploadForm() {
			return "offers/courseupload";
		}
		@PostMapping("/courseupload")
		public String courseupload(CourseDto course, HttpSession session) throws Exception {
			logger.info("실행");
			int[] course_no_array = course.getCourse_no_array();
			String[] cplace_array = course.getCplace_array();
			String[] cdetail_array = course.getCdetail_array();
			String[] ctime_array = course.getCtime_array();
			MultipartFile[] cimage_array = course.getCimage_array();			
			
			for(int i=1; i<course_no_array.length; i++) {
				if(course_no_array[i]!=0) {
					course.setCourse_no(course_no_array[i]);
					course.setCplace(cplace_array[i]);
					course.setCdetail(cdetail_array[i]);
					course.setCtime(ctime_array[i]);
				
					if(!cimage_array[i].isEmpty()) {
						String oName = cimage_array[i].getOriginalFilename();
						course.setCimageoname(oName);
						course.setCimagetype(cimage_array[i].getContentType());
						File saveFile = new File(offerDirPath+ course.getOffer_id()+"/courses/"+oName); 
						cimage_array[i].transferTo(saveFile);
						logger.info(""+course.getOffer_id());
						offerService.courseRegister(course);
						}
				}
			}
			session.removeAttribute("sessionOffer_id");
			session.removeAttribute("sessionNo");
			return "redirect:/main/content";	
		}
		@GetMapping("/courseplus")
		public String courseplus(HttpSession session) {
			logger.info("실행");
			if(session.getAttribute("sessionNo")==null) {
				logger.info("no null 실행");
				int number=1;
				session.setAttribute("sessionNo", number);
			} else if(session.getAttribute("sessionNo")!=null) {
				logger.info("no not null 실행");
				int number=(int) session.getAttribute("sessionNo");
				number++;
				session.setAttribute("sessionNo", number);
			}
			return "offers/course";	
		}		
		@GetMapping("/offerread")
		public String offerread(int offer_id, Model model) {
			logger.info("실행");
			OfferDto offer = offerService.getOffer(offer_id);
			int partner_id = offer.getPartner_id();
			int member_id = partnerService.getMid(partner_id);
			offer.setMember_id(member_id);
			List<ImageDto> imageList = offerService.getImageList(offer_id);
			List<CourseDto> courseList = offerService.getCourseList(offer_id);
			//PartnerDto pdto= partnerService.getPartner(offer_id);
			model.addAttribute("offer", offer);
			model.addAttribute("imageList", imageList);
			model.addAttribute("courseList", courseList);
			return "offers/offer";
		}
		@GetMapping("/oimage")
		public void oimage(int offer_id, String iimageoname, HttpServletResponse response)  throws Exception {
			logger.info("실행");
			String filePath = offerDirPath + offer_id + "/" + iimageoname;			
			OutputStream os= response.getOutputStream();
			InputStream is = new FileInputStream(filePath);			
			FileCopyUtils.copy(is, os);
			os.flush();
			os.close();
			is.close();
		}
		@GetMapping("/oimagehead")
		public void oimagehead(int offer_id, HttpServletResponse response)  throws Exception {
			logger.info("실행");
			String iimageonameHead = offerService.getImageonameHead(offer_id);
			String filePath = offerDirPath + offer_id + "/" + iimageonameHead;
			OutputStream os= response.getOutputStream();
			InputStream is = new FileInputStream(filePath);			
			FileCopyUtils.copy(is, os);
			os.flush();
			os.close();
			is.close();
		}
		@GetMapping("/cimage")
		public void cimage(int offer_id, String cimageoname, HttpServletResponse response)  throws Exception {
			logger.info("실행");
			String filePath = offerDirPath + offer_id + "/courses/" + cimageoname;			
			OutputStream os= response.getOutputStream();
			InputStream is = new FileInputStream(filePath);			
			FileCopyUtils.copy(is, os);
			os.flush();
			os.close();
			is.close();
		}
		@GetMapping("/offerupdate")
		public String offerupdateform(int offer_id, Model model) {
			logger.info("실행");
			OfferDto offer = offerService.getOffer(offer_id);
			List<ImageDto> imageList = offerService.getImageList(offer_id);
			//PartnerDto pdto= partnerService.getPartner(offer_id);
			model.addAttribute("offer", offer);
			model.addAttribute("imageList", imageList);
			return "offers/offerupdate";
		}
		@PostMapping("/offerupdate")
		public String offerupdate(OfferDto offer, HttpSession session) throws Exception {
			logger.info("실행");
			offerService.offerUpdate(offer);			
			MultipartFile[] oimage_array = offer.getOfferImage();
			ImageDto imageDto = new ImageDto();
			imageDto.setOffer_id(offer.getOffer_id());
			for (MultipartFile oimage : oimage_array) {
				logger.info("파일전송 for문실행");
				if(!oimage.isEmpty()) {
					String oName = oimage.getOriginalFilename();
					imageDto.setIimageoname(oName);
					imageDto.setIimagetype(oimage.getContentType());
					File saveFile = new File(offerDirPath+ offer.getOffer_id()+"/"+oName); 
					oimage.transferTo(saveFile);
					logger.info(""+imageDto.getOffer_id());
					offerService.imageRegister(imageDto);
					}
			}			
			session.setAttribute("sessionOffer_id",offer.getOffer_id());
			session.removeAttribute("sessionNo");
			return "redirect:/offer/courseupdate";
		}
		@GetMapping("/oimagedelete")
		public void oimagedelete(int offer_id, String iimageoname, HttpServletResponse response) {
			logger.info("실행");
			ImageDto image = new ImageDto();
			image.setOffer_id(offer_id);
			image.setIimageoname(iimageoname);			
			offerService.deleteImage(image);			
		}
		
		@GetMapping("/courseupdate")
		public String courseupdateform(Model model, HttpSession session) {
			logger.info("실행");
			int offer_id = (int) session.getAttribute("sessionOffer_id");
			List<CourseDto> courseList = offerService.getCourseList(offer_id);
			int number=courseList.size();
			session.setAttribute("sessionNo", number);			
			model.addAttribute("courseList", courseList);			
			return "offers/courseupdate";			
		}
		@PostMapping("/courseupdate")
		public String courseupdate(CourseDto course, HttpSession session) throws Exception {
			logger.info("실행");			
			int[] course_no_array = course.getCourse_no_array();
			String[] cplace_array = course.getCplace_array();
			String[] cdetail_array = course.getCdetail_array();
			String[] ctime_array = course.getCtime_array();
			MultipartFile[] cimage_array = course.getCimage_array();			
			
			for(int i=0; i<course_no_array.length; i++) {
				if(course_no_array[i]!=0) {
					course.setCourse_no(course_no_array[i]);
					course.setCplace(cplace_array[i]);
					course.setCdetail(cdetail_array[i]);
					course.setCtime(ctime_array[i]);
					offerService.courseUpdateText(course);
								
					if(!cimage_array[i].isEmpty()) {
						String oName = cimage_array[i].getOriginalFilename();
						course.setCimageoname(oName);
						course.setCimagetype(cimage_array[i].getContentType());
						File saveFile = new File(offerDirPath+ course.getOffer_id()+"/courses/"+oName); 
						cimage_array[i].transferTo(saveFile);
						logger.info(""+course.getOffer_id());
						offerService.courseUpdateImage(course);
						}
				}
			}
			session.removeAttribute("sessionOffer_id");
			session.removeAttribute("sessionNo");
			return "redirect:/main/content";
		}
		
		@GetMapping("/cimagedelete")
		public void cimagedelete(int offer_id, String cimageoname, HttpServletResponse response) {
			logger.info("실행");
			CourseDto course = new CourseDto();
			course.setOffer_id(offer_id);
			course.setCimageoname(cimageoname);			
			offerService.courseDeleteImage(course);			
		}
		@GetMapping("/offerdelete")
		public String offerdelete(int offer_id) {
			logger.info("실행");
			offerService.setOfferDelete(offer_id);
			return "redirect:/main/content";
		}
		
}
