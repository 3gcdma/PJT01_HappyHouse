import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestReadCSV {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<List<String>> envAreaList = new ArrayList<>();
		String csvFileName = "res/JongRoEnvironmentMap.csv";
//		String csvFileName = "c:" + File.separator + "SSAFY" + File.separator + "JongRoEnvironmentMap.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");

				System.out.println(Arrays.toString(values));
				envAreaList.add(Arrays.asList(values));
			}
		}
	}
}

//"업체(시설)명","인허가번호","업종코드","업종명","지도점검일자","점검기관","점검기관명","지도점검구분","처분대상여부","점검사항","점검결과","소재지도로명주소","소재지주소"
