package chapter10.section1050;

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		
		try (MyFileInputStream fis = new MyFileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
