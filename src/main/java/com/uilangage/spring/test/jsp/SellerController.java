package com.uilangage.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.test.jsp.domain.Seller;
import com.uilangage.spring.test.jsp.service.SellerService;

@RequestMapping("/jsp/seller")
@Controller
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/create")
	@ResponseBody
	public String createSeller(
			@RequestParam("nickName") String nickName
			,@RequestParam("profileImage") String profileImage
			,@RequestParam("temperature") double temperature) {
		int count = sellerService.addSeller(nickName, profileImage, temperature);
		
		return "수행결과 : " + count; 
	}
	
	@GetMapping("/input")
	public String inputSeller() {
		return "jsp/sellerInput";
	}
	
	@GetMapping("/last")
	public String lastSeller(Model model) {
		
		Seller seller = sellerService.getLastSeller();
		model.addAttribute("result", seller);
		
		return "jsp/sellerInfo";
	}
	
	
}
