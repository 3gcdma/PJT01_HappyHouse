package com.ssafy.happyhouse.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.EnvironmentInfo;

public class EnvironmentImpl implements EnvironmentDAO {

	List<EnvironmentInfo> list = new ArrayList<>();

	private static EnvironmentImpl instance;

	private EnvironmentImpl() {

	}

	public static EnvironmentImpl getInstance() {
		if (instance == null)
			instance = new EnvironmentImpl();
		return instance;
	}

	@Override
	public void create() {
		String csvFileName = "." + File.separator + "res" + File.separator + "JongRoEnvironmentMap.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
			String line;

			while ((line = br.readLine()) != null) {
				EnvironmentInfo tmp = new EnvironmentInfo();

				String[] values = line.split(",");

				tmp.setName(values[0]);
				tmp.setType(values[3]);
				tmp.setCheckAgency(values[6]);
				tmp.setAddress(values[12]);
				list.add(tmp);
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<EnvironmentInfo> search() {
		return list;
	}

}
