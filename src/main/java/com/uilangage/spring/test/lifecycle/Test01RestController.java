package com.uilangage.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test01RestController {
	
	@RequestMapping("/1")
	public List<Map<String,Object>> mapResponse(){
		
		List<Map<String, Object>> movieListMap = new ArrayList<Map<String, Object>>();
		
		
		Map<String, Object> movieMap = new HashMap<String, Object>();
		movieMap.put("rate",15);
		movieMap.put("director","봉준호");
		movieMap.put("time", 131);
		movieMap.put("title","기생충");
		
		movieListMap.add(movieMap);
		
		Map<String, Object> movieMap1 = new HashMap<String, Object>();
		movieMap1.put("rate",0);
		movieMap1.put("director","로베르토 베니니");
		movieMap1.put("time", 116);
		movieMap1.put("title","인생은 아름다워");
		
		movieListMap.add(movieMap1);
		
		Map<String, Object> movieMap2 = new HashMap<String, Object>();
		movieMap2.put("rate",12);
		movieMap2.put("director","크리스토퍼 놀란");
		movieMap2.put("time", 147);
		movieMap2.put("title","인셉션");
		
		movieListMap.add(movieMap2);
		
		Map<String, Object> movieMap3 = new HashMap<String, Object>();
		movieMap3.put("rate",19);
		movieMap3.put("director","윤종빈");
		movieMap3.put("time", 133);
		movieMap3.put("title","범죄와의 전쟁 : 나쁜놈들 전성시대");
		
		movieListMap.add(movieMap3);
		
		Map<String, Object> movieMap4 = new HashMap<String, Object>();
		movieMap4.put("rate",15);
		movieMap4.put("director","프란시스 로렌스");
		movieMap4.put("time", 137);
		movieMap4.put("title","헝거게임");
		
		movieListMap.add(movieMap4);
		
		return movieListMap;
	}
	@RequestMapping("/2")
	public Board objectResponse(){
		
		
		Board one = new Board ("안녕하세요 가입인사 드립니다.","hagulu","안녕하세요 가입했어요. 앞으로 잘부탁드립니다."),;
		
		
		
		return one;
		
		
	}
	
	
	
	
}
