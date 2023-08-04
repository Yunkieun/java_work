package ser_p;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BModifyReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getRealPath("up");
		path = "C:\\java_work\\mvcProj\\src\\main\\webapp\\up";
		
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					//파일명 중복되면 뒤에 번호를 붙여줌
					new DefaultFileRenamePolicy()
				);
			
			BoardDTO dto = new BoardDTO();
			dto.setId(Integer.parseInt(mr.getParameter("id")));
			dto.setTitle( mr.getParameter("title"));
			dto.setPname( mr.getParameter("pname"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			
			String msg = "비밀번호가 일치하지 않습니다.";
			String goUrl = "BDeleteForm?id="+dto.getId();
			
			System.out.println(dto);
			
			if(new BoardDAO().modify(dto) > 0) { //id, pw가 일치하면

				msg = "수정되었습니다.";
				goUrl = "BDetail?id="+dto.getId();
			}else {
				if(mr.getFilesystemName("upfile")!= null) {
					new File(path+"\\"+mr.getFilesystemName("upfile")).delete();
				}
			}
			
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg", msg);
			request.setAttribute("goUrl", goUrl);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
