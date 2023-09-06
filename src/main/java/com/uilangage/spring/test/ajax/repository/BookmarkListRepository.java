package com.uilangage.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.ajax.domain.BookmarkList;

@Repository
public interface BookmarkListRepository {

	
	public List<BookmarkList> selectBookmarkList();
	
	public int insertBookmark(@Param("name")String name,@Param("url") String url);
	
	public int selectCountUrl(@Param("url") String url);
	
	
}
