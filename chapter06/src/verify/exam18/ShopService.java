package verify.exam18;

public class ShopService {
	//정적 필드
	private static ShopService singleton = new ShopService(); //자기자신의 객체 생성 "singleton"이라는 필드 선언
	
	//생성자
	private ShopService() {} //private 생성자 접근 제한
	
	//정적 메소드
	public static ShopService getInstance() {
			return singleton;
		}
	
	}
		
	

