package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BDetail implements BoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// Java 코드 영역에서 mainTitle 속성 설정
		request.setAttribute("mainTitle", "게시판 상세");
		System.out.println("BDetail.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		//수정 할때마다 카운트 올라가지 않음
		new BoardDAO().addCount(id);
		//System.out.println(new BoardDAO().detail(id));
		request.setAttribute("mainData" ,new BoardDAO().detail(id));
	}
}
