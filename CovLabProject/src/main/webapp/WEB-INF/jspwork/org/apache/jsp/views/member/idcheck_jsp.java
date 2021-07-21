/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-21 08:18:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class idcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <link href=\"/semi/resources/css/lib/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/themify-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/helper.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <title>회원 확인</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/semi/resources/js/jquery-3.6.0.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write(" function validate(){\n");
      out.write("	 var username = document.getElementById(\"username\").value;\n");
      out.write("	 if( username == \"\"){\n");
      out.write("		 alert(\"이름을 적어주세요.\");\n");
      out.write("		 \n");
      out.write("		 username = \"\";\n");
      out.write("		 username.select();\n");
      out.write("		 return false;\n");
      out.write("		 \n");
      out.write("	}\n");
      out.write("	 var re =/^[ㄱ-ㅎ|ㅏ-ㅣ|가-힝]{2,4}$/;\n");
      out.write("	 if(!re.test(username)){\n");
      out.write("		 alert(\"2글자 이상 4글자 이하로 작성해주세요.\")\n");
      out.write("		 username=\"\";\n");
      out.write("		 username.focus();\n");
      out.write("		 return false;\n");
      out.write("		}\n");
      out.write("	 var userrn = document.getElementById(\"userrn\").value;\n");
      out.write("	 if(userrn == \"\"){\n");
      out.write("		 alert(\"주민 번호를 입력해주세요.\");\n");
      out.write("		 userrn=\"\";\n");
      out.write("		 userrn.select();\n");
      out.write("		 return false;\n");
      out.write("	 }\n");
      out.write("	 \n");
      out.write("	 if(userrn.length != 14){\n");
      out.write("		 alert(\"(-)포함 14자리 입력해주세요.\");\n");
      out.write("		 userrn=\"\";\n");
      out.write("		 userrn.select();\n");
      out.write("		 return false;\n");
      out.write("	 }\n");
      out.write("	 var re2 =/\\d{6}\\-[1-4]\\d{6}/;\n");
      out.write("	 if(!re2.test(userrn)){\n");
      out.write("		 alert(\"형식이 맞지 않거나 잘못 입력하였습니다.\")\n");
      out.write("		 userrn=\"\";\n");
      out.write("		 userrn.focus();\n");
      out.write("		 return false;\n");
      out.write("	 }\n");
      out.write("	 \n");
      out.write("\n");
      out.write(" }\n");
      out.write(" function IDCheck(){\n");
      out.write("        var username = document.getElementById(\"username\").value;\n");
      out.write("        var userrn = document.getElementById(\"userrn\").value;\n");
      out.write("	 if(username != null && userrn != null){\n");
      out.write("		 alert(\"이미 등록되어있습니다.\");\n");
      out.write("		 \n");
      out.write("	 }else{\n");
      out.write("		 alert(\"등록된 정보가 없습니다.\");\n");
      out.write("		 \n");
      out.write("	 }\n");
      out.write("\n");
      out.write("	 \n");
      out.write(" }\n");
      out.write("\n");
      out.write(" </script>   \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-primary\">\n");
      out.write("\n");
      out.write("    <div class=\"unix-login\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"login-content\">\n");
      out.write("                        <div class=\"login-logo\">\n");
      out.write("                            <a href=\"index.html\"><span>Focus</span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login-form\">\n");
      out.write("                            <h4>회원 확인</h4>\n");
      out.write("                            <form action=\"/semi/mcheck\" method=\"post\" onsubmit=\"return validate();\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>이름</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"이름\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label>주민번호</label>\n");
      out.write("                                      <br>\n");
      out.write("                                  <input type=\"text\"class=\"form-control\" name=\"userrn\" id=\"userrn\" placeholder=\"주민번호\">\n");
      out.write("									\n");
      out.write("									\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                                <button  onclick=\"IDCheck();\" id=\"mbutton\" type=\"submit\" value=\"sumbit\"class=\"btn btn-primary btn-flat m-b-15\">제출하기</button>\n");
      out.write("                              \n");
      out.write("                                <div class=\"register-link text-center\">\n");
      out.write("                                    <p>돌아가기 <a href=\"/semi/\"> 홈페이지</a></p>\n");
      out.write("                                </div>\n");
      out.write("                              </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
