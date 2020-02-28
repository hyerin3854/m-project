package sec11.exam01_final;

public class Person {
	final String nation = "Korea";  //값이 저장되고 나면 수정할수없음
	final String ssn;
	String name;

	
	public Person(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	
	}
	
}
