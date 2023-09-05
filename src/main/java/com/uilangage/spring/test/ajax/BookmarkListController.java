package com.uilangage.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajax/bookmark")
@Controller
public class BookmarkListController {
	
	@GetMapping("/list")
	public String bookMarkList(){
		
		return "ajax/bookmark/list";
		
	}
}
