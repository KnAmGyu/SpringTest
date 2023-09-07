package com.uilangage.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.test.ajax.domain.BookmarkList;
import com.uilangage.spring.test.ajax.repository.BookmarkListRepository;

@Service
public class BookmarkListService {
	
	@Autowired
	private BookmarkListRepository bookmarkListRepository;
	
	public List<BookmarkList> getBookmarkList(){
		
		List<BookmarkList> bookmark = bookmarkListRepository.selectBookmarkList();
		
		return bookmark;
	}	
	
	public int addBookmark(String name, String url){
		
		int count = bookmarkListRepository.insertBookmark(name, url);
		return count;
	}
	
	
	public boolean isDuplicateUrl(String url) {
		int count = bookmarkListRepository.selectCountUrl(url);
		
//		if(count == 0) {
//			//중복 안됨
//			return false;
//		}else {
//			//중복됨
//			return true;
//		}
		
		return count != 0;
		
	}
	
	public int deleteList(int id) {
		int count = bookmarkListRepository.deleteBookmark(id);
		return count;
	}
	
}
