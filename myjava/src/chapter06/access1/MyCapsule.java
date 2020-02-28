package chapter06.access1;

public class MyCapsule { //값을 세팅하는 메소드, 얻어오는 메소드를 작성
	private int id;
	private String name;
	private String model;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
}
