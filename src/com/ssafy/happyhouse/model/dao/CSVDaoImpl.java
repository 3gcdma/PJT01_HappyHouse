package com.ssafy.happyhouse.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ssafy.happyhouse.model.dto.EnvironmentMap;
import com.ssafy.happyhouse.model.dto.HouseInfo;
import com.ssafy.happyhouse.model.dto.Store;

public class CSVDaoImpl implements CSVDao {

	private Map<String, EnvironmentMap> envInfo;
	
	@Override
	public List<EnvironmentMap> searchEnv() throws FileNotFoundException, IOException {
		
		List<EnvironmentMap> envAreaList = new ArrayList<>();
		String csvFileName = "res/JongRoEnvironmentMap.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");

				System.out.println(Arrays.toString(values));
				envAreaList.add((EnvironmentMap) Arrays.asList(values));
			}
		}
		
		return envAreaList;
	}

	@Override
	public List<Store> searchStore() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
