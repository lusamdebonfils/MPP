package com.addis;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println(list);
		int i = list.indexOf(200);
		list.set(i, 900);
		System.out.println(list);
	}

}
