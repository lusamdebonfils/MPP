package com.addis;

public class Test implements D {

	public Test() {
		method();
	}

	public static void main(String[] args) {
		new Test();

	}

	@Override
	public void method() {
		System.out.println("D is da shit!!");
		
	}

}