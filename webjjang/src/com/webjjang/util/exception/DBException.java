package com.webjjang.util.exception;

// DB 오류가 난 경우의 예외 객체 -> 예외 객체를 상속받아야만 한다.
public class DBException extends Exception {

	// 기본 작성이고 없으면 경고난다.
	private static final long serialVersionUID = 1L;
	
	// private 변수 - 예외가 발생 위치를 저장
	private String position;
	
	public String getPosition() {return position;}
	
	// 메시지는 정해져 있다. - DB에서 예외 발생 - new 할때 메시지 넣기한다.
	public DBException() {
		super("DB 처리 중 예외 발생되었습니다.");
	}

	// 예외 발생 위치 저장하는 생성자
	public DBException(String position) {
		this();
		this.position = position;
	}
}
