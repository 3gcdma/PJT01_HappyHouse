package com.ssafy.happyhouse.model.dao;

import java.util.List;
import com.ssafy.happyhouse.model.dto.EnvironmentInfo;

public interface EnvironmentDAO {

	void create();

	List<EnvironmentInfo> search();
}
