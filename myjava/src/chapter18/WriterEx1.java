package chapter18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterEx1 {

	public static void main(String[] args) throws Exception{
		Writer fw =new FileWriter("output.txt");
		Reader fr= new FileReader("output.txt");
				
		fw.write('한');
		fw.write('a');
		fw.write(97);
		fw.write(new char[] {'한','글','a','b','c'});
		fw.write("한글abcde");
		
		fw.close();
		
		//		
		int cnt = 0;
		while (fr.read() != -1) {
			cnt++;
		}
		System.out.println(cnt+"개의 문자");

		fr.close();
	}

}
