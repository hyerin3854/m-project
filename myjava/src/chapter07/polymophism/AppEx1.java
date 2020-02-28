package chapter07.polymophism;

public class AppEx1 {
	public static void main(String[] args) {
		Cat tiger = new Tiger();
		Cat cat = new HouseCat();
		
		tiger.cry();
		cat.cry();
		
		Tiger t = (Tiger) tiger;
		
		System.out.println(cat instanceof Tiger);
		System.out.println(cat instanceof HouseCat);
		System.out.println(cat instanceof Cat);
		
		if (cat instanceof Tiger) {
			Tiger t2 = (Tiger) cat;
		}
		
		t.cry();
	}
}

