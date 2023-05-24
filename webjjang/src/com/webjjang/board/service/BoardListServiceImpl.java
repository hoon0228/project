package com.webjjang.board.service;

import com.webjjang.board.doa.BoardDAO;
import com.webjjang.board.doa.BoardDAOImpl;
import com.webjjang.main.Service;

public class BoardListServiceImpl implements Service {

	// 전달 데이터 : null, 결과 데이터 : List<BoardVO>
	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
		//DB 오라클에서 데이터 가져온다. - List -> DAO
		// 클래스를 생성하고 호출한다.
		BoardDAO dao = new BoardDAOImpl();
		
		return dao.list(obj);
	}

}
