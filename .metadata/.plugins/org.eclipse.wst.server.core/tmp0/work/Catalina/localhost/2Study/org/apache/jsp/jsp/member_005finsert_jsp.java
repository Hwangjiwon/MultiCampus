/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2019-05-31 06:46:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "side.jsp", out, false);
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\r\n");
      out.write("\t*** 회원 가입 *** <br> <br>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action = \"/2Study/Main?sign=member_insert\" method=\"post\">\r\n");
      out.write("\t<input type = \"hidden\" name = \"sign\" value =\"member_insert\"/>\r\n");
      out.write("\t\t<fieldset id = \"must\">\r\n");
      out.write("\t\t\t<legend>필수사항</legend>\r\n");
      out.write("\t\tID <input type = \"text\" name = \"id\" > <br>\r\n");
      out.write("\t\tPW <input type = \"text\" name = \"pw\" > <br>\r\n");
      out.write("\t\tName <input type = \"text\" name = \"name\"> <br>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset id = \"option\">\r\n");
      out.write("\t\t\t<legend>인적사항</legend>\r\n");
      out.write("\t\tE-Mail <input type =\"email\" name = \"email\" placeholder=\"OOO@OOO.OOO\" /> <br>\r\n");
      out.write("\t\tGender <input type = \"radio\" name = \"gender\" value = \"male\" checked /> 남성\r\n");
      out.write("\t\t\t<input type = \"radio\" name = \"gender\" value = \"female\" /> 여성 <br>\r\n");
      out.write("\t\tAge <input type = \"number\" name =\"age\" min = \"1\" max =\"99\" step =\"1\" value =\"20\"/> <br>\r\n");
      out.write("\t\tGitHub <input type = \"url\" name = \"git\" placeholder=\"http://******\"/> <br>\r\n");
      out.write("\t\tTel <input type =\"tel\" name = \"tel\" pattern =\"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}\" placeholder =\"0**-****-****\"/><br>\r\n");
      out.write("\t\tBirth <input type =\"date\" name =\"birth\"/> <br>\r\n");
      out.write("\t\tNational <select name =\"country\">\r\n");
      out.write("\t\t\t\t\t<option value = \"Korea\" selected> 대한민국 </option>\r\n");
      out.write("\t\t\t\t\t<option value = \"USA\"> 미국 </option>\r\n");
      out.write("\t\t\t\t\t<option value = \"UK\"> 영국 </option>\r\n");
      out.write("\t\t\t\t\t<option value = \"Japan\"> 일본 </option>\r\n");
      out.write("\t\t\t\t\t<option value = \"China\"> 중국 </option>\r\n");
      out.write("\t\t\t\t</select> <br>\r\n");
      out.write("\t\t</fieldset>\t\t\t\r\n");
      out.write("\t\t<fieldset id = \"etc\">\r\n");
      out.write("\t\t\t<legend>기타사항</legend>\r\n");
      out.write("\t\tHobby <input type =\"checkbox\" name = \"hobby\" value = \"movie\" /> 영화 \r\n");
      out.write("\t\t\t  <input type =\"checkbox\" name = \"hobby\" value = \"drive\" /> 드라이브 \r\n");
      out.write("\t\t \t  <input type =\"checkbox\" name = \"hobby\" value = \"soccer\" /> 축구\r\n");
      out.write("\t\t\t  <input type =\"checkbox\" name = \"hobby\" value = \"music\" /> 음악 <br>\r\n");
      out.write("\t\tColor <input type = \"color\" name = \"color\" value = \"#FF8080\"><br>\r\n");
      out.write("\t\tImage <input type = \"file\" name = \"filename\" > <br>\r\n");
      out.write("\t\tFavorite <input type = \"image\" height=\"50\" src = \"https://i.pinimg.com/originals/a1/60/71/a16071849d7eaf5ef3d6554710451f05.png\" alt =\"Cat\"/>\r\n");
      out.write("\t\t\t\t <input type = \"image\" height=\"50\" src = \"https://smallimg.pngkey.com/png/small/42-426056_cats-dogs-cats-and-dogs-heart-shaped-svg.png\" alt =\"Dog\"/> <br>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset id = \"add\">\r\n");
      out.write("\t\t\t<legend>추가사항</legend>\r\n");
      out.write("\t\t<textarea rows = \"3\" cols =\"50\" name =\"desc\">\r\n");
      out.write("자기소개를 입력해주세요.\r\n");
      out.write("\t\t</textarea> <br>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<input type =\"submit\" value =\"Sign Up\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "copyright.jsp", out, false);
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
