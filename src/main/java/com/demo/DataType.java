package main.java.com.demo;



public enum DataType {
	NAME("name"),
	AGE("age");
	private String name;
	DataType(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public static String getType(String name) {
		for(DataType type:DataType.values()) {
			if(name.equals(type.name())) {
				return type.getName();
			}
		}
		return null;
	}
}
