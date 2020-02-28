package chapter11.object;

public class MyClass {
	private int id;
	private String name;
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString () {
		String desc ="id:"+this.id+",name:"+this.name;
		return desc;
	}

}
