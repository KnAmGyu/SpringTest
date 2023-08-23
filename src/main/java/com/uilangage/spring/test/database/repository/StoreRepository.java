package com.uilangage.spring.test.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.database.domain.Store;

@Repository
public interface StoreRepository {

	public List<Store> selectStoreList();
}
