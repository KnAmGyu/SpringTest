package com.uilangage.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.test.ajax.domain.BookmarkList;
import com.uilangage.spring.test.ajax.service.BookmarkListService;

@RequestMapping("/ajax/bookmark")
@Controller
public class BookmarkListController {
	
	@Autowired
	private BookmarkListService bookmarkListService;
	
	@GetMapping("/list")
	public String bookMarkList(Model model){
		
		List<BookmarkList> bookmark = bookmarkListService.getBookmarkList();
		
		model.addAttribute("markList", bookmark);
		
		return "ajax/bookmark/list";
		
	}
	
	@GetMapping("/create")
	@ResponseBody
	public Map<String, String> createBookmark(@RequestParam("name") String name,@RequestParam("url") String url) {
		
		int count = bookmarkListService.addBookmark(name, url);
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) { 
			resultMap.put("result", "success");
		} else { 
			resultMap.put("result", "fail");
		}
		
		
		return resultMap;
		
	}
	
	
	@GetMapping("/input")
	public String bookmarkInput() {
		return "ajax/bookmark/input";
	}
	
	
	@GetMapping("/duplicate-url")
	@ResponseBody
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		
//		boolean isDuplicate = bookmarkListService.isDuplicateUrl(url);
		
		Map<String, Boolean> duplicateMap = new HashMap<>();
		
//		if(isDuplicate){
//			duplicateMap.put("isDuplicate", true);
//		}else {
//			duplicateMap.put("isDuplicate", false);
//		}
		if(bookmarkListService.isDuplicateUrl(url)){
			duplicateMap.put("isDuplicate", true);
		}else {
			duplicateMap.put("isDuplicate", false);
		}
		
		return duplicateMap;
	}
	
	@GetMapping("/delete-list")
	public int deleteList(@RequestParam("id") int id)){
		
		
		return 0;
	}
	
	
}
