package kr.co.sist.log.evt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

import kr.co.sist.log.view.GetLogMainView;

/**
 * @author owner
 *
 */
@SuppressWarnings("serial")
public class GetLogMainViewEvt extends GetLogMainView {

	private GetLogMainView glmv;

	private String filePath, fileName;
	File file;

	private List<String> resList;
	private Map<String, Integer> pkMap;
	private Map<String, Integer> responseMap;
	private Set<String> responseSet;

	public GetLogMainViewEvt() {
	}// GetLogMainViewEvt

	public GetLogMainViewEvt(GetLogMainView glmv, String filePath, String fileName) {
		this.glmv = glmv;
		this.filePath = filePath;
		this.fileName = fileName;
		file = new File(filePath + fileName);

		if (filePath != null) {
			try {
//				addToList();
				// 1. 최다 사용 키의 이름과 횟수
				getMaxUseKeyInfo();
				// 2. 브라우저별 접속 횟수, 비율
				getBrowseConnInfo();
				// 3. 서비스를 성공적으로 수행한 횟수, 실패 횟수
				successServiceInfo();
				// 4. 요청이 가장 많은 시간
				getHugeRequestTime();
				// 5.
				abnormalRequestInfo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(glmv, "파일을 읽어들일 수 없습니다.", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(glmv, "파일을 읽고 출력하는 데 문제가 발생했습니다.", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} // end catch

		} // end if

	}// GetLogMainViewEvt

	/**
	 * 1. 가장 많이 사용된 키워드를 찾는 일.
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void getMaxUseKeyInfo() throws IOException, FileNotFoundException {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 파일 다이얼로그를 통해 불러온 파일을 한 줄씩 16bit stream을 사용하여 읽어들일 것이므로
		// BufferedReader(이하 br)를 선언 및 초기화 한다.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = "";
			String keyValue = "";
			while ((temp = br.readLine()) != null) {
				if (temp.contains("key=")) {
					// 키워드만 추출하여 keyValue 변수에 저장한다.
					keyValue = temp.substring(temp.indexOf("key=") + 4, temp.indexOf("&"));
					// pkMap에 키값으로 키워드가 없다면 키값을 추가한 뒤 1의 값을 할당하고,
					// 이미 해당 키워드가 키값으로 있다면, 현재의 값에서 1을 더한다.
					if (!map.containsKey(keyValue)) {
						map.put(keyValue, 1);
					} else {
						map.put(keyValue, map.get(keyValue) + 1);
					} // end else
				} // end if

			} // end while

			ArrayList<String> list = new ArrayList<String>(map.keySet());
			String tempSpace;
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < i; j++) {
					if (map.get(list.get(j)) < map.get(list.get(i))) {
						tempSpace = list.get(i);
						list.set(i, list.get(j));
						list.set(j, tempSpace);
					} // end if
				} // end for
			} // end for
			glmv.getJtaView1().setText(list.get(0) + " " + map.get(list.get(0)) + "회");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally

	}// getMaxUseKeyInfo

	/**
	 * 브라우저 별 접속횟수와 비율을 구하는 일
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void getBrowseConnInfo() throws FileNotFoundException, IOException {
		pkMap = new HashMap<String, Integer>();

		String temp = "";
		String browser = "";

		// 16bit stream 사용
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			int total = 0;

			while ((temp = br.readLine()) != null) {

				if (temp.contains("key=")) {
					// String class의 replaceAll method는 특수문자를 사용하여 치환할 경우 문자열 전체가 치환되므로
					// 특수문자를 치환할 수 있는 replace method를 활용한다.
					browser = temp.replace("[", "").split("]")[2];

					// pkMap에 키값으로 키워드가 없다면 키값을 추가한 뒤 1의 값을 할당하고,
					// 이미 해당 키워드가 키값으로 있다면, 현재의 값에서 1을 더한다.
					if (!pkMap.containsKey(browser)) {
						pkMap.put(browser, 1);
					} else {
						pkMap.put(browser, pkMap.get(browser) + 1);
					} // end else
					total++;
				} // end if
			} // end while
			resList = new ArrayList<String>(pkMap.keySet());
			String percentage;
			for (int i = 0; i < pkMap.size(); i++) {
				percentage = String.format("%.2f", (double) pkMap.get(resList.get(i)) / total * 100);
				glmv.getJtaView2()
						.append(resList.get(i) + " - " + pkMap.get(resList.get(i)) + " (" + percentage + "%)\n");
			} // end for

		} finally {

			if (br != null) {
				br.close();
			} // end if

		} // end finally

	}// getBrowseConnInfo

	public void successServiceInfo() throws FileNotFoundException, IOException {
		// 16bit stream 사용
		BufferedReader br = null;
		int success = 0;
		int failed = 0;
		String temp = "";

		try {
			br = new BufferedReader(new FileReader(file));
			while ((temp = br.readLine()) != null) {

				if (temp.substring(temp.indexOf('[') + 1, 4).equals("404")) {
					failed++;
				}
				if (temp.substring(temp.indexOf('[') + 1, 4).equals("200")) {
					success++;
				} // end else
			} // end while
			glmv.getJtaView3().setText("서비스를 성공적으로 수행한 횟수 - " + success + "회,\n실패 횟수 - " + failed + "회");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally
	}// successServiceInfo

	/**
	 * 4. 요청이 가장 많은 시간을 구하는 일.
	 */
	public void getHugeRequestTime() throws FileNotFoundException, IOException {
		Map<String, Integer> requestTimeMap = new HashMap<String, Integer>();
		// 16bit stream 사용
		BufferedReader br = null;
		String temp = "";
		String requestTime = "";
		String getHour = "";
		try {

			br = new BufferedReader(new FileReader(file));
			while ((temp = br.readLine()) != null) {
				requestTime = temp.replace("[", "").split("]")[3];
				getHour = requestTime.substring(requestTime.indexOf(":")-2, requestTime.indexOf(":"));
				
				if(requestTimeMap.containsKey(getHour)) {
					requestTimeMap.put(getHour, requestTimeMap.get(getHour)+1);
				} else {
					requestTimeMap.put(getHour, 1);
				}//end if
				
//				System.out.println(requestTimeMap);
			} // end while
			
			List timeLine = new ArrayList<String>(requestTimeMap.keySet());

			System.out.println();
//			String tempRank = timeLine.get(0);
			for(int i = 0; i < timeLine.size(); i++) {
				
			}//end for
			
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally

	}// getHugeRequestTime

	/**
	 * 5. 비정상적인 요청(403)이 발생한 횟수와 비율을 구하는 일
	 */
	public void abnormalRequestInfo() throws FileNotFoundException, IOException {
		BufferedReader br = null;
		String temp = "";
		int totalCnt = 0;
		int abnormalCnt = 0;
		double percentage;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((temp = br.readLine()) != null) {
				if (temp.substring(temp.indexOf('[') + 1, 4).equals("403")) {
					abnormalCnt++;
				}
				totalCnt++;
			} // end while
			percentage = (double) abnormalCnt / (double) totalCnt * 100;
			glmv.getJtaView5().setText("비정상적인 요청(403)이 발생한 횟수 - [" + abnormalCnt + "회]\n전체(" + totalCnt + "회)의 ["
					+ String.format("%.2f", percentage) + "%]");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally

	}// abnormalRequestInfo

	/**
	 * 입력된 두 가지 값(시작 행, 끝 행) 사이에 해당하는 정보 중 최다사용 키의<br>
	 * 이름과 횟수를 구하는 일.
	 */
	public void getPartMaxUseKeyInfo() {

	}// getPartMaxUseKeyInfo

	public void createReport() throws FileNotFoundException {

	}// createReport

	public void createFileName() {

	}// createFileName

	public void addResultList() {

	}// addResultList

	public void addToList() throws IOException {
		resList = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String lineTxt = "";

			System.out.println("///////////////////////////// 시작 ///////////////////////////////");
			while ((lineTxt = br.readLine()) != null) {
				System.out.println(lineTxt);
			} // end while

			for (int i = 0; i < resList.size(); i++) {
				System.out.println(resList.get(i));
			} // end for
		} finally {
			
		}//end finally
	}// addToList
	
	
}// class