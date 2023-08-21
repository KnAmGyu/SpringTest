package com.uilangage.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class Board {

	private String title;
	private String user;
	private String content;
	
	public Board(String title, String user, String content) {
		Map<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("title", title);
		boardMap.put("user", user);
		boardMap.put("content", content);
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