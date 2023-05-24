package com.webjjang.board.doa;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

public interface BoardDAO {

	public List<BoardVO> list(Object obj) throws Exception;
	public BoardVO view(Long no) throws Exception;
	
	
}
