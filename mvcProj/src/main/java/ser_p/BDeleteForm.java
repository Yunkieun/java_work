package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BDeleteForm implements BoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// Java 코드 영역에서 mainTitle 속성 설정
		request.setAttribute("mainTitle", "게시판 삭제");
		System.out.println("BDetail.execute() 실행");

	}
}
