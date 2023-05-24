package com.webjjang.board.doa;

import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.exception.DBException;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> list(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
		List<BoardVO> list = new ArrayList<>();
		
		// sql developer에서 작성한 쿼리 ";"은 입력하지 않는다. commit도 하지 않아도 된다.
		String sql = "select no, title, writer, writeDate, hit from board ";
		sql += " order by no desc";
		
		
		System.out.println("SQL : " + sql);
		
		// while 문
		BoardVO vo1 = new BoardVO();
		vo1.setNo(1);
		vo1.setTitle("자바");
		vo1.setWriter("이영환");
		list.add(vo1);
		
		BoardVO vo2 = new BoardVO();
		vo2.setNo(2);
		vo2.setTitle("오라클");
		vo2.setWriter("홍길동");
		list.add(vo2);
		
		// 예외 처리 테스트 코드
//		if(obj == null) throw new Exception("게시판 리스트 DB 처리하는 중 오류 발생되었습니다.");
//		if(obj == null) throw new DBException();
		// if(obj == null) throw new DBException("게시판 리스트");
		
		return list;
	} // end of list()

	
	// 글보기
	@Override
	public BoardVO view(Long no) throws Exception{
		BoardVO vo = null;
		
		String sql = "select no, title, content, writer, writeDate, hit ";
		sql += " from board where no = " + no;
		
		System.out.println("처리 SQL : " + sql);
		
		// DB에서 가져오자.
		vo = new BoardVO();
		vo.setNo(10);
		vo.setTitle("자바");
		vo.setWriter("홍길돟");
		
		return vo;
	} // end of view()


} // end of class
