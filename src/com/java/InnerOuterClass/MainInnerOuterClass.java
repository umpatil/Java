package com.java.InnerOuterClass;

//import com.java.InnerOuterClass.OuterClass.InnerClass;

public class MainInnerOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass class1 = new OuterClass();
		OuterClass.InnerClass class2 = class1.new InnerClass();
		System.out.println("Value of Outer Class is :" +class1.x +"Value of Inner Class is :"+class2.y);
		
		
		
	}

}
