package fortune;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {

		Date date = new Date();// Date클래스 객체 생성
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 오늘 날짜를 원하는 형식으로 표현
		System.out.println(dateForm.format(date));
	}
}
