package com.webjjang.util.io;

import java.util.Scanner;

public class In {

	private static Scanner scanner = new Scanner(System.in);
	
	// 문자열을 입력 받는 메서드
	public static String getStr() {
		return scanner.nextLine();
	}
	
	// 안내 메시지를 출력하고 데이터를 받아내는 메서드
	public static String getStr(String msg) {
		System.out.print(msg + " -> ");
		return getStr();
	}
	
}
