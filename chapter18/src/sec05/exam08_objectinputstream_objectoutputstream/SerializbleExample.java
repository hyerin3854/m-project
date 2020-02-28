package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializbleExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos =new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		ClassA classA = new ClassA();
	
	
	}

}
