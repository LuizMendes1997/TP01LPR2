package TP01.EX3;

public class Person {
	public static final String pay = null;
	private String name;
	private String address;
	public String school;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[Name= "+ name + "Address= " + address + "]";
	}
}
