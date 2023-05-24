package com.webjjang.main;

import com.webjjang.board.contorller.BoardController;
import com.webjjang.util.io.In;
import com.webjjang.util.io.Out;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FrontController
		// 무한반복
		while (true) {
			// 제목 출력
			Out.title("웹짱 닷컴");
			// 메뉴 출력
			Out.menu("1. 게시판  0. 프로그램 종료");
			// 메뉴 입력 + 처리
			switch (In.getStr("메뉴 입력")) {
			case "1":
				// Main -> BoardController
				BoardController boardController = new BoardController();
				boardController.execute();
				break;
			case "0":
				Out.title("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다. \n 1,0의 숫자만 입력이 가능합니다.");
				break;
			}
		}

	}

}
