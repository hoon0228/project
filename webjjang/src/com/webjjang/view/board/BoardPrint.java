package com.webjjang.view.board;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

public class BoardPrint {

	public static void print(List<BoardVO> list) {
		// list 비어 있으면 데이터가 없다고 출력하자.
		if(list == null || list.size() ==0)
			System.out.println("데이터가 존재하지 않습니다.");
		// 항목 제목을 출력
		System.out.println("=======================================");
		System.out.println("  번호  /        제목          /  작성자");
		System.out.println("=======================================");
		// 데이터 출력
		for(BoardVO vo : list)
			System.out.println(" " + vo.getNo() + " / " + vo.getTitle()
				+ " / " +vo.getWriter());
	}
	
}
