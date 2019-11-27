package com.java.encapulation;

public class EncapsulationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo demo = new EncapsulationDemo();
		demo.setId(3);
		demo.setName("Hari");
		demo.id = 1;
		System.out.println("Id is :"+demo.getId()+" \nName is :"+ demo.getName());

	}

}
