package com.uilangage.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

	private String title;
	private String user;
	private String content;
	
	public Board(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;
	}
	public List<Map<String, Object>> boardmap(){
	
		List<Map<String, Object>> boardList = new ArrayList<Map<String, Object>>();
		Map<String, Object> boardMap = new HashMap<String, Object>();
		boardMap.put("title", title);
		boardMap.put("user", user);
		boardMap.put("content", content);
	
		boardList.add(boardMap);
	
		return boardList;
	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
