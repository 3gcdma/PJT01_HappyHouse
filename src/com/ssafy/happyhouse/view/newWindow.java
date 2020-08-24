package com.ssafy.happyhouse.view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.ssafy.happyhouse.model.dao.EnvironmentImpl;
import com.ssafy.happyhouse.model.dao.PannelImpl;
import com.ssafy.happyhouse.model.dto.EnvironmentInfo;
import com.ssafy.happyhouse.model.dto.HouseDeal;
import com.ssafy.happyhouse.model.dto.HousePageBean;
import com.ssafy.happyhouse.model.dto.PannelInfo;

public class newWindow extends JFrame {
	// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스

	String[] frameTitles = { "주변 환경 지도", "주변 상가 정보" };

	/** 조회 내용 표시할 table */
	private DefaultTableModel model;
	private JTable Table;
	private JScrollPane Pan;
	private String[][] tableTitles = { { "업체명", "업종명", "점검기관명", "소재지주소" }, { "상호명", "상권업종중분류명", "도로명주소" , "경도" ,"위도" } };
	
	private String curDong;
	newWindow(int value, String dong) {

		setTitle(frameTitles[value]);

		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);

		JPanel panel = new JPanel(new BorderLayout());
		model = new DefaultTableModel(tableTitles[value], 20);
		Table = new JTable(model);
		Pan = new JScrollPane(Table);
		Table.setColumnSelectionAllowed(true);
		panel.add(new JLabel(frameTitles[value], JLabel.CENTER), "North");
		panel.add(Pan, "Center");

		NewWindowContainer.add(panel);
		curDong = dong;

		setSize(800, 550);
		setResizable(false);
		setVisible(true);

		
		
		// 데이터 불러서 넣어주는 함수만 있으면 된당!

		switch(value) {
		case 0:
			showEnv();
			break;
		case 1:
			showPannel();
			break;
		}
	}
	// 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
	// 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다

	public void showPannel() {

		PannelImpl pannelImpl = PannelImpl.getInstance();
		pannelImpl.create();
		
		
		List<PannelInfo> pannels = pannelImpl.search(curDong);
		if (pannels != null) {
			int i = 0;
			String[][] data = new String[pannels.size()][5];
			for (PannelInfo pannel : pannels) {
				data[i][0] = "" + pannel.getName();
				data[i][1] = pannel.getSelection();
				data[i][2] = pannel.getAddress();
				data[i][3] = pannel.getHard();
				data[i++][4] = pannel.getLati();
			}
			model.setDataVector(data, tableTitles[1]);
		}
	}

	public void showEnv() {

		EnvironmentImpl environmentImpl = EnvironmentImpl.getInstance();
		environmentImpl.create();
		
		
		List<EnvironmentInfo> envs = environmentImpl.search();
		if (envs != null) {
			int i = 0;
			String[][] data = new String[envs.size()][4];
			for (EnvironmentInfo env : envs) {
				data[i][0] = "" + env.getName();
				data[i][1] = env.getType();
				data[i][2] = env.getCheckAgency();
				data[i++][3] = env.getAddress();
			}
			model.setDataVector(data, tableTitles[0]);
		}
		
		
	}
}