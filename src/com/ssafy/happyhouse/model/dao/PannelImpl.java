package com.ssafy.happyhouse.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.PannelInfo;

public class PannelImpl implements PannelDAO{
	List<PannelInfo> list = new ArrayList<>();
	
	private static PannelImpl instance;
	private PannelImpl(){
		
	}
	
	public static PannelImpl getInstance() {
		if(instance == null) instance = new PannelImpl();
		return instance;
	}

	@Override
	public void create() {
		String csvFileName = "." + File.separator + "res" + File.separator + "Pannel.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
		    String line;

		    while ((line = br.readLine()) != null) {
		    	PannelInfo tmp = new PannelInfo();
		    	
		    	String[] values = line.split("\\|");
		    	
		    	tmp.setName(values[1]);
		    	tmp.setSelection(values[6]);
		    	tmp.setAddress(values[31]);
<<<<<<< HEAD
		    	tmp.setHard(Integer.parseInt(values[37]));
		    	tmp.setLati(Integer.parseInt(values[38]));
=======
		    	tmp.setHard(values[37]);
		    	tmp.setLati(values[38]);
>>>>>>> prepare
		    	list.add(tmp);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<PannelInfo> search() {
		return list;
	}

}
