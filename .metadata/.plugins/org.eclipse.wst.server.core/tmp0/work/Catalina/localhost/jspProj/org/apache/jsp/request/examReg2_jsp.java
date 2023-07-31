/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-07-31 09:33:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;

public final class examReg2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Arrays");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>examReg2</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>examReg2</h1>\r\n");
      out.write("\r\n");


	//초기화
	String [] pname = request.getParameterValues("pname");
	String [] title = "kor,eng,mat,soc,sci".split(",");
	// title = [kor, eng, mat]
			    //0   1    2
	int [][] arr = new int[title.length][pname.length];
	
	//   ? 각 사람
	//res[?][0] - 총점
	//res[?][1] - 평균
	//res[?][2] - 등수
	//res[?][3] - 등급
	int [][] res = new int[pname.length][3];
	
	
	// 입력부
	for(int i = 0; i<title.length; i++){
		String [] jj = request.getParameterValues(title[i]);
		for(int j = 0; j<jj .length; j++){
			arr[i][j] = Integer.parseInt(jj[j]);
		}
	}
	
	
	//연산부
	// p : 사람
	for(int p = 0; p<res.length; p++){
		
		//총점
		res[p][0] = 0;
		
		//점수 : j 과목
		for(int j = 0; j<arr.length; j++){
			res[p][0] += arr[j][p];
		}
		
		//평균
		res[p][1] = res[p][0]/arr.length;
		
	} 
	
	//분석
	for(int me = 0; me<res.length; me++){
		res[me][2] = 1;	
		
		for(int you = 0; you<res.length; you++){
			
			if(res[me][1] < res[you][1] ){
				res[me][2]++;	
			}
		}
	}
	
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 출력부 -->\r\n");
      out.write("<table border=\"\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>이름</td>\r\n");
      out.write("			<td>국어</td>\r\n");
      out.write("			<td>영어</td>\r\n");
      out.write("			<td>수학</td>\r\n");
      out.write("			<td>사회</td>\r\n");
      out.write("			<td>과학</td>\r\n");
      out.write("			<td>총점</td>\r\n");
      out.write("			<td>평균</td>	\r\n");
      out.write("			<td>등수</td>			\r\n");
      out.write("			<td>등급</td>\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("		</tr>\r\n");
      out.write('\r');
      out.write('\n');
 
for(int r = 1; r<=pname.length; r++){
	for(int i = 0; i<pname.length; i++){ 
		if(r == res[i][2]) {	
            String grade = "";
            int avg = res[i][1];
            if (avg >= 90) {
                grade = "수";
            } else if (avg >= 80) {
                grade = "우";
            } else if (avg >= 70) {
                grade = "미";
            } else if (avg >= 60) {
                grade = "양";
            } else{
            	grade = "가";
            }
        
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(pname[i] );
      out.write(' ');
      out.print(r );
      out.write("</td> \r\n");
      out.write("			");
 for(int j = 0; j<arr.length; j++){ 
      out.write("				\r\n");
      out.write("				<td>");
      out.print(arr[j][i] );
      out.write("</td>\r\n");
      out.write("			");
} 
			 for(int j = 0; j<res[i].length; j++){ 
      out.write("				\r\n");
      out.write("				<td>");
      out.print(res[i][j] );
      out.write("</td>\r\n");
      out.write("			");
} 
      out.write("	\r\n");
      out.write("			<td>");
      out.print(grade );
      out.write("</td>	\r\n");
      out.write("		</tr>\r\n");
}}}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}