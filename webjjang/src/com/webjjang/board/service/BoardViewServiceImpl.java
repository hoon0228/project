package com.webjjang.board.service;

import com.webjjang.board.doa.BoardDAO;
import com.webjjang.board.doa.BoardDAOImpl;
import com.webjjang.main.Service;

public class BoardViewServiceImpl implements Service {

	// 넘어가는 데이터 - no, 결과 데이터 : BoardVO
	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
		//DB 오라클에서 데이터 가져온다. - BoardVO -> DAO
		// 클래스를 생성하고 호출한다.
		BoardDAO dao = new BoardDAOImpl();
		
		return dao.view((Long) obj);
	}

}
