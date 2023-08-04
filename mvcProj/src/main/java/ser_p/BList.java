package ser_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BList implements BoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// Java 코드 영역에서 mainTitle 속성 설정
		request.setAttribute("mainTitle", "게시판 목록");
		System.out.println("BList.execute() 실행");
		
		
		request.setAttribute("mainData" ,new BoardDAO().list());
	}
}
