/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-16 17:13:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dami.user.bean.user;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
	
	//获取项目名
	String path = request.getContextPath();
	//获取tomcat 协议+地址+端口号+ 获取项目名
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	//获取tomcat 协议+地址+端口号
	String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/xmsp/";
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.gname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/index.css\">\r\n");
      out.write("    <script src=\"");
      out.print(basePath );
      out.write("js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"plus5_no2 \">\r\n");
      out.write("        <div class=\"plus5_no2_in\">\r\n");
      out.write("        \t");
 
        	user u = (user)session.getAttribute("USER");
        	if(u==null){
        		
      out.write("\r\n");
      out.write("        \t\t <a class=\"plus5_no2_in_a\" href=\"login.jsp\" > 为方便您购买，请提前登录 </a>\r\n");
      out.write("        \t\t <a class=\"plus5_no2_in_a orange\"style=\"color: pink;\" href=\"login.jsp\">立即登录</a>\r\n");
      out.write("        \t\t  <a id=\"plus5_no2_in\" class=\"plus5_no2_in_a\" href=\"javascript:;\">x</a>\r\n");
      out.write("        \t\t");
 }else{
        			
      out.write("\r\n");
      out.write("        \t\t\t<input id=\"uid\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER.uid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        \t\t\t");

        		}
        	
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"plus5_no3\">\r\n");
      out.write("        <div class=\"plus5_no3_img\">\r\n");
      out.write("            <img width=\"560px\" height=\"560px\" src=\"");
      out.print(imgPath );
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display: block\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"plus5_no3_right\">\r\n");
      out.write("            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.gname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("            <p class=\"plus5_no3_right_p2\">\r\n");
      out.write("            \t<span class=\"plus5_no3_right_span2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("            \t<div style=\"font-size: 14px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.full_description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("            \t\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"plus5_no3_right_p3\">商品价格 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("元<span class=\"plus5_no3_right_span3\">价格 元</span></p>\r\n");
      out.write("            <div class=\"plus5_no3_right_div4\">\r\n");
      out.write("                <div class=\"plus5_no3_right_div4_in\">\r\n");
      out.write("                    <p class=\"plus5_no3_right_p4\">赠品</p><span>**</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div4_in\">\r\n");
      out.write("                    <p class=\"plus5_no3_right_p4\">赠品</p><span>**</span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div5\">\r\n");
      out.write("                    <p ><textarea id=\"address\" rows=\"\" cols=\"\" readonly=\"readonly\" >北京 北京市 东城区 永定门外街道</textarea>\r\n");
      out.write("                   \r\n");
      out.write("                     <span class=\"plus5_no3_right_div5_span\"><a class=\"plus5_no3_right_div5_span\" id=\"updateAddress\" href=\"#\" >修改</a> &nbsp;&nbsp;  有现货</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div6\">选择版本</div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div7\">\r\n");
      out.write("            \r\n");
      out.write("            \t<li class=\"plus5_no3_right_div7_in plus5_no3_right_div7_in_hover\">\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span0 \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.version }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span \" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  元</span>\r\n");
      out.write("                </li>\r\n");
      out.write("            \t\r\n");
      out.write("                <!-- <li class=\"plus5_no3_right_div7_in plus5_no3_right_div7_in_hover\">\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span0 \">3GB+32GB</span>\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span \" >999元</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"plus5_no3_right_div7_in plus5_no3_float\">\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span0 \">4GB+64GB</span>\r\n");
      out.write("                    <span class=\"plus5_no3_right_div7_span \" >1299元</span>\r\n");
      out.write("                </li> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div6\">选择颜色</div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div9\">\r\n");
      out.write("            \t<li class=\"plus5_no3_right_div7_in plus5_no3_right_div7_in_hover \">\r\n");
      out.write("            \t\t<img src=\"img/plus5_phone_01.png\" alt=\"\"><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.color }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("            \t</li>\r\n");
      out.write("                <!-- <li class=\"plus5_no3_right_div7_in plus5_no3_right_div7_in_hover \"><img src=\"img/plus5_phone_01.png\" alt=\"\"><span>金色</span></li>\r\n");
      out.write("                <li class=\"plus5_no3_right_div7_in plus5_no3_float\"><img src=\"img/plus5_phone_02.png\" alt=\"\"><span>黑色</span></li>\r\n");
      out.write("                <li class=\"plus5_no3_right_div7_in\"><img src=\"img/plus5_phone_03.png\" alt=\"\"><span>玫瑰金</span></li>\r\n");
      out.write("                <li class=\"plus5_no3_right_div7_in plus5_no3_float\"><img src=\"img/plus5_phone_04.png\" alt=\"\"><span>浅蓝色</span></li> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"plus5_no3_right_div10\">\r\n");
      out.write("                <p class=\"plus5_no3_right_div10_p1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.gname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"plus5_no3_right_div10_span0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.version }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span> <span class=\"plus5_no3_right_div10_span1\"></span><span class=\"plus5_no3_right_div10_span2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.color }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></p><span class=\"plus5_no3_right_span10\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("元</span>\r\n");
      out.write("                <p class=\"plus5_no3_right_div10_p2\" style=\"font-size: 18px;font-weight: bold;\">总计 ：商品价格  元</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"javascript:void(0)\" ><div class=\"plus5_no3_right_div11\" style=\"cursor: pointer;\" >加入购物车</div></a>\r\n");
      out.write("            <div class=\"plus5_no3_right_div12\">\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_y\">√</div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_z\">七天无理由退货</div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_y\">√</div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_z\">15天质量问题换货</div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_y\">√</div>\r\n");
      out.write("                <div class=\"plus5_no3_right_div12_z\">360天保障</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"javascript:void (0);\"></a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        var plus5_no2_in = document.getElementById(\"plus5_no2_in\");\r\n");
      out.write("        var plus5_no2 = document.getElementsByClassName(\"plus5_no2\")[0];\r\n");
      out.write("        plus5_no2.onclick = function () {\r\n");
      out.write("            plus5_no2.className=\"plus5_no2 plus5_no2_close\";\r\n");
      out.write("//            plus5_no2.style.display=\"none\";\r\n");
      out.write("        }\r\n");
      out.write("        $(\".plus5_no3_right_div9 .plus5_no3_right_div7_in\").click(function () {\r\n");
      out.write("            console.log($(this).children().eq(1).html());\r\n");
      out.write("            $(\".plus5_no3_right_div10_span2\").html($(this).children().eq(1).html());\r\n");
      out.write("\r\n");
      out.write("            $(\".plus5_no3_img img\").css(\"display\",\"none\").eq($(this).index()).css(\"display\", \"block\");\r\n");
      out.write("            $(this).siblings().removeClass(\"plus5_no3_right_div7_in_hover\").end().addClass(\"plus5_no3_right_div7_in_hover\");\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("        $(\".plus5_no3_right_div7 .plus5_no3_right_div7_in\").click(function () {\r\n");
      out.write("//            var value = $(\".plus5_no3_right_div7_span0 \").html();\r\n");
      out.write("            console.log($(this).children().eq(1).html());\r\n");
      out.write("            $(\".plus5_no3_right_div10_span0\").html($(this).children().html());\r\n");
      out.write("            $(\".plus5_no3_right_span10\").html($(this).children().eq(1).html());\r\n");
      out.write("            var value = \"总计:\"+$(this).children().eq(1).html()\r\n");
      out.write("            $(\".plus5_no3_right_div10_p2\").html(value);\r\n");
      out.write("\r\n");
      out.write("            $(this).siblings().removeClass(\"plus5_no3_right_div7_in_hover\").end().addClass(\"plus5_no3_right_div7_in_hover\");\r\n");
      out.write("        })\r\n");
      out.write("        $(\"#updateAddress\").click(function() {\r\n");
      out.write("\t\t\t$(\"#address\").removeProp(\"readonly\");\r\n");
      out.write("        \t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\".plus5_no3_right_div11\").click(function() {\r\n");
      out.write("\t\t\tvar uid = $(\"#uid\").val();\r\n");
      out.write("\t\t\t//var user = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\tvar gid = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detailgo.gid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\tif(uid==null||uid==\"\"){\r\n");
      out.write("\t\t\t\talert(\"请登录后再添加购物车\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t/* window.location=\"BuyServlet?method=insertGWC&uid=\"+uid+\"&sum_price=\"+sum_price;\t */\r\n");
      out.write("\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"trolleyServlet\",\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\tdata:{\"method\":\"insertTrolley\",\"uid\":uid,\"gid\":gid },\r\n");
      out.write("\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\tsuccess:function(obj){\r\n");
      out.write("\t\t\t\t\t\tif(obj){\r\n");
      out.write("\t\t\t\t\t\t\tvar num = Number($(\"#troll\").text())+1;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#troll\").text(num);\r\n");
      out.write("\t\t\t\t\t\t\talert(\"成功添加购物车\");\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\talert(\"成功更新购物车\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}) \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
