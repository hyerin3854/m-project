package chapter06;

public class User {
	String userId;
	int level;

	User() {
		userId = "guest";
		level = 0;
	}
	User(String id) {
		userId = id;
	
	}
	User(String id, int l) {
		userId = id;
		level=l;
	}
	

}
