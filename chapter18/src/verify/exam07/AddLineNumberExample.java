package verify.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\USER\\Documents\\myworkspace\\eclipse-workspace\\myjava\\src\\chapter18\\buffered\\BufferedReaderExample.java";

		// 작성 위치
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		int rowNumber = 0;
		String rowData;
		while ((rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + ":" + rowData);
		}
		br.close();
		fr.close();
	}

}
