package com.webjjang.board.contorller;

import java.util.List;

import com.webjjang.board.service.BoardListServiceImpl;
import com.webjjang.board.service.BoardViewServiceImpl;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.main.Execute;
import com.webjjang.util.exception.DBException;
import com.webjjang.util.io.In;
import com.webjjang.util.io.Out;
import com.webjjang.view.board.BoardPrint;

public class BoardController {

	@SuppressWarnings("unchecked")
	public void execute() {
		
		while(true) {
			// 정상 처리
			try {
				// 제목 출력
				Out.title("게시판 시스템");
				// 메뉴 출력
				Out.menu("1. 리스트  2. 글보기  3. 글등록", "4. 글수정  5. 글삭제  0. 이전 메뉴");
				// 메뉴 입력
				String menu = In.getStr("메뉴 입력");
				// 메뉴 처리
				switch (menu) {
				case "1":
					// BoardController ->m BoardListService : 기본
					// BoardController -> Execute -> BoardListService : 로그 출력 위해
					List<BoardVO> list
					= (List<BoardVO>) Execute.run(new BoardListServiceImpl(), null);
					// 가져온 데이터 출력하기
					BoardPrint.print(list);
					break;
	
				case "2":
					// BoardController -> BoardViewService : 기본
					// BoardController -> Execute -> BoardViewService : 로그 출력 위해
					// 넘어가는 데이터 : 번호(no), 받는 데이터 : BoardVO
					String strNo = In.getStr("번호");
					Long no = Long.parseLong(strNo);
					BoardVO vo = (BoardVO) Execute.run(new BoardViewServiceImpl(), no);
					break;
					
				case "3":
					// BoardController -> BoardListService : 기본
					// BoardController -> Execute -> BoardListService : 로그 출력 위해
					break;
					
				case "4":
					// BoardController -> BoardListService : 기본
					// BoardController -> Execute -> BoardListService : 로그 출력 위해
					break;
					
				case "5":
					// BoardController -> BoardListService : 기본
					// BoardController -> Execute -> BoardListService : 로그 출력 위해
					break;
					
				case "0":
					// BoardController -> BoardListService : 기본
					// BoardController -> Execute -> BoardListService : 로그 출력 위해
					return;
					
				default:
					System.out.println("잘못된 메뉴를 입력하셨습니다. \n 1~5,0의 숫자만 입력이 가능합니다.");
					break;
				} // end of switch
				
			} catch (DBException e) {
				System.out.println("** DB 오류 처리");
				System.out.println("예외 내용 : " + e.getMessage());
				System.out.println("발생 위치 : " + e.getPosition());
				System.out.println();
			} catch (Exception e) {
				// 개발자를 위한 코드 -> 오류 수정 -> 나중에 주석 처리
				// e.printStackTrace();
				// 사용자를 위한 코드
				System.out.println("게시판 처리 중 예외가 발생되었습니다.");
				System.out.println("예외 내용 : " + e.getMessage());
				System.out.println("다시 시도해 보세요.");
				System.out.println("예외가 계속되면 전산 담당자에게 연락해 주세요.");
				System.out.println();
			}
		}// end of while()
		
	} // end of main()
	
} // end of class
