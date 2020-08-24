package com.ssafy.happyhouse.model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.ssafy.happyhouse.model.dto.EnvironmentMap;
import com.ssafy.happyhouse.model.dto.Store;

public interface CSVDao {
	
	public List<EnvironmentMap> searchEnv() throws FileNotFoundException, IOException; 
	
	public List<Store> searchStore();
}
