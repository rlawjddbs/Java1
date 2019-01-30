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
				// 1. �ִ� ��� Ű�� �̸��� Ƚ��
				getMaxUseKeyInfo();
				// 2. �������� ���� Ƚ��, ����
				getBrowseConnInfo();
				// 3. ���񽺸� ���������� ������ Ƚ��, ���� Ƚ��
				successServiceInfo();
				// 4. ��û�� ���� ���� �ð�
				getHugeRequestTime();
				// 5.
				abnormalRequestInfo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(glmv, "������ �о���� �� �����ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(glmv, "������ �а� ����ϴ� �� ������ �߻��߽��ϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} // end catch

		} // end if

	}// GetLogMainViewEvt

	/**
	 * 1. ���� ���� ���� Ű���带 ã�� ��.
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void getMaxUseKeyInfo() throws IOException, FileNotFoundException {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ���� ���̾�α׸� ���� �ҷ��� ������ �� �پ� 16bit stream�� ����Ͽ� �о���� ���̹Ƿ�
		// BufferedReader(���� br)�� ���� �� �ʱ�ȭ �Ѵ�.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = "";
			String keyValue = "";
			while ((temp = br.readLine()) != null) {
				if (temp.contains("key=")) {
					// Ű���常 �����Ͽ� keyValue ������ �����Ѵ�.
					keyValue = temp.substring(temp.indexOf("key=") + 4, temp.indexOf("&"));
					// pkMap�� Ű������ Ű���尡 ���ٸ� Ű���� �߰��� �� 1�� ���� �Ҵ��ϰ�,
					// �̹� �ش� Ű���尡 Ű������ �ִٸ�, ������ ������ 1�� ���Ѵ�.
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
			glmv.getJtaView1().setText(list.get(0) + " " + map.get(list.get(0)) + "ȸ");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally

	}// getMaxUseKeyInfo

	/**
	 * ������ �� ����Ƚ���� ������ ���ϴ� ��
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void getBrowseConnInfo() throws FileNotFoundException, IOException {
		pkMap = new HashMap<String, Integer>();

		String temp = "";
		String browser = "";

		// 16bit stream ���
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			int total = 0;

			while ((temp = br.readLine()) != null) {

				if (temp.contains("key=")) {
					// String class�� replaceAll method�� Ư�����ڸ� ����Ͽ� ġȯ�� ��� ���ڿ� ��ü�� ġȯ�ǹǷ�
					// Ư�����ڸ� ġȯ�� �� �ִ� replace method�� Ȱ���Ѵ�.
					browser = temp.replace("[", "").split("]")[2];

					// pkMap�� Ű������ Ű���尡 ���ٸ� Ű���� �߰��� �� 1�� ���� �Ҵ��ϰ�,
					// �̹� �ش� Ű���尡 Ű������ �ִٸ�, ������ ������ 1�� ���Ѵ�.
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
		// 16bit stream ���
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
			glmv.getJtaView3().setText("���񽺸� ���������� ������ Ƚ�� - " + success + "ȸ,\n���� Ƚ�� - " + failed + "ȸ");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally
	}// successServiceInfo

	/**
	 * 4. ��û�� ���� ���� �ð��� ���ϴ� ��.
	 */
	public void getHugeRequestTime() throws FileNotFoundException, IOException {
		Map<String, Integer> requestTimeMap = new HashMap<String, Integer>();
		// 16bit stream ���
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
	 * 5. ���������� ��û(403)�� �߻��� Ƚ���� ������ ���ϴ� ��
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
			glmv.getJtaView5().setText("���������� ��û(403)�� �߻��� Ƚ�� - [" + abnormalCnt + "ȸ]\n��ü(" + totalCnt + "ȸ)�� ["
					+ String.format("%.2f", percentage) + "%]");
		} finally {
			if (br != null) {
				br.close();
			}
		} // end finally

	}// abnormalRequestInfo

	/**
	 * �Էµ� �� ���� ��(���� ��, �� ��) ���̿� �ش��ϴ� ���� �� �ִٻ�� Ű��<br>
	 * �̸��� Ƚ���� ���ϴ� ��.
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

			System.out.println("///////////////////////////// ���� ///////////////////////////////");
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