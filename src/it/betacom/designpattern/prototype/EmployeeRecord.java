package it.betacom.designpattern.prototype;

public class EmployeeRecord implements Prototype{
	private int id;
	private String name,designation,address;
	private double salary;
	
	
	
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toString() {
		return "EmployeeRecord [salary=" + salary + "]";
	}

}
