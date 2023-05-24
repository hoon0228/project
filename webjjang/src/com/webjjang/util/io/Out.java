package com.webjjang.util.io;

public class Out {

	public static void title(String title) {
		System.out.println();
		System.out.println("***********************");
		System.out.println("  " + title);
		System.out.println("***********************");
		System.out.println();
	}
	
	// 불특정 다수개의 문자열 배열이 들어온다.
	public static void menu(String ... menus) {
		System.out.println();
		System.out.println("+---------------------------------------+");
		for(String menu : menus) 
			System.out.println("  " + menu);
		System.out.println("+---------------------------------------+");
		System.out.println();
		
	}
	
}
