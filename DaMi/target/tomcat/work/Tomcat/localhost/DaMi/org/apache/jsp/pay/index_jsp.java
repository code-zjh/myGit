/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-16 17:26:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pay;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>支付宝电脑网站支付</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul, ol {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: \"Helvetica Neue\", Helvetica, Arial, \"Lucida Grande\",\r\n");
      out.write("\t\tsans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tab-head {\r\n");
      out.write("\tmargin-left: 120px;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tab-content {\r\n");
      out.write("\tclear: left;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\tborder-bottom: solid #02aaf1 2px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".selected {\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tbackground-color: #02aaf1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".show {\r\n");
      out.write("\tclear: left;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hidden {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".new-btn-login-sp {\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".new-btn-login {\r\n");
      out.write("\tbackground-color: #02aaf1;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".red-star {\r\n");
      out.write("\tcolor: #f00;\r\n");
      out.write("\twidth: 10px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".null-star {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content {\r\n");
      out.write("\tmargin-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content dt {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tmargin-top: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content dd {\r\n");
      out.write("\tmargin-left: 120px;\r\n");
      out.write("\tmargin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content dd input {\r\n");
      out.write("\twidth: 85%;\r\n");
      out.write("\theight: 28px;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\t-webkit-border-radius: 0;\r\n");
      out.write("\t-webkit-appearance: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#foot {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 15px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot-ul {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot-ul li {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".note-help {\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tline-height: 130%;\r\n");
      out.write("\tmargin-top: 5px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#btn-dd {\r\n");
      out.write("\tmargin: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot-ul {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".one_line {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\theight: 1px;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tborder-top: 1px solid #eeeeee;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".am-header {\r\n");
      out.write("\tdisplay: -webkit-box;\r\n");
      out.write("\tdisplay: -ms-flexbox;\r\n");
      out.write("\tdisplay: box;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding: 7px 0;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-ms-box-sizing: border-box;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tbackground: #1D222D;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t-webkit-box-pack: center;\r\n");
      out.write("\t-ms-flex-pack: center;\r\n");
      out.write("\tbox-pack: center;\r\n");
      out.write("\t-webkit-box-align: center;\r\n");
      out.write("\t-ms-flex-align: center;\r\n");
      out.write("\tbox-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".am-header h1 {\r\n");
      out.write("\t-webkit-box-flex: 1;\r\n");
      out.write("\t-ms-flex: 1;\r\n");
      out.write("\tbox-flex: 1;\r\n");
      out.write("\tline-height: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body text=#000000 bgColor=\"#ffffff\" leftMargin=0 topMargin=4>\r\n");
      out.write("\t<header class=\"am-header\">\r\n");
      out.write("\t<h1>支付宝电脑网站支付体验入口页</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"tabhead\" class=\"tab-head\">\r\n");
      out.write("\t\t\t<h2 id=\"tab1\" class=\"selected\" name=\"tab\">付 款</h2>\r\n");
      out.write("\t\t\t<h2 id=\"tab2\" name=\"tab\">交 易 查 询</h2>\r\n");
      out.write("\t\t\t<h2 id=\"tab3\" name=\"tab\">退 款</h2>\r\n");
      out.write("\t\t\t<h2 id=\"tab4\" name=\"tab\">退 款 查 询</h2>\r\n");
      out.write("\t\t\t<h2 id=\"tab5\" name=\"tab\">交 易 关 闭</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form name=\"alipayment\" action=\"pay/alipay.trade.page.pay.jsp\" method=\"post\"\r\n");
      out.write("\t\t\ttarget=\"_blank\">\r\n");
      out.write("\t\t\t<div id=\"body1\" class=\"show\" name=\"divcontent\">\r\n");
      out.write("\t\t\t\t<dl class=\"content\">\r\n");
      out.write("\t\t\t\t\t<dt>商户订单号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDout_trade_no\" name=\"WIDout_trade_no\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orders_number }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>订单名称 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDsubject\" name=\"WIDsubject\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orders_number }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>付款金额 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDtotal_amount\" name=\"WIDtotal_amount\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.sum_price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("  />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>商品描述：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDbody\" name=\"WIDbody\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt></dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">付 款</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=tradequery action=alipay.trade.query.jsp method=post\r\n");
      out.write("\t\t\ttarget=\"_blank\">\r\n");
      out.write("\t\t\t<div id=\"body2\" class=\"tab-content\" name=\"divcontent\">\r\n");
      out.write("\t\t\t\t<dl class=\"content\">\r\n");
      out.write("\t\t\t\t\t<dt>商户订单号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTQout_trade_no\" name=\"WIDTQout_trade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>支付宝交易号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTQtrade_no\" name=\"WIDTQtrade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt></dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">交 易 查 询</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“交易查询”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=traderefund action=alipay.trade.refund.jsp method=post\r\n");
      out.write("\t\t\ttarget=\"_blank\">\r\n");
      out.write("\t\t\t<div id=\"body3\" class=\"tab-content\" name=\"divcontent\">\r\n");
      out.write("\t\t\t\t<dl class=\"content\">\r\n");
      out.write("\t\t\t\t\t<dt>商户订单号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTRout_trade_no\" name=\"WIDTRout_trade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>支付宝交易号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTRtrade_no\" name=\"WIDTRtrade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>退款金额 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTRrefund_amount\" name=\"WIDTRrefund_amount\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>退款原因 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTRrefund_reason\" name=\"WIDTRrefund_reason\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>退款请求号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTRout_request_no\" name=\"WIDTRout_request_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt></dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">退 款</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“退款”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=traderefundquery\r\n");
      out.write("\t\t\taction=alipay.trade.fastpay.refund.query.jsp method=post\r\n");
      out.write("\t\t\ttarget=\"_blank\">\r\n");
      out.write("\t\t\t<div id=\"body4\" class=\"tab-content\" name=\"divcontent\">\r\n");
      out.write("\t\t\t\t<dl class=\"content\">\r\n");
      out.write("\t\t\t\t\t<dt>商户订单号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDRQout_trade_no\" name=\"WIDRQout_trade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>支付宝交易号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDRQtrade_no\" name=\"WIDRQtrade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>退款请求号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDRQout_request_no\" name=\"WIDRQout_request_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt></dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">退 款 查 询</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“退款查询”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=tradeclose action=alipay.trade.close.jsp method=post\r\n");
      out.write("\t\t\ttarget=\"_blank\">\r\n");
      out.write("\t\t\t<div id=\"body5\" class=\"tab-content\" name=\"divcontent\">\r\n");
      out.write("\t\t\t\t<dl class=\"content\">\r\n");
      out.write("\t\t\t\t\t<dt>商户订单号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTCout_trade_no\" name=\"WIDTCout_trade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt>支付宝交易号 ：</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"WIDTCtrade_no\" name=\"WIDTCtrade_no\" />\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<hr class=\"one_line\">\r\n");
      out.write("\t\t\t\t\t<dt></dt>\r\n");
      out.write("\t\t\t\t\t<dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">交 易 关 闭</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“交易关闭”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"foot\">\r\n");
      out.write("\t\t\t<ul class=\"foot-ul\">\r\n");
      out.write("\t\t\t\t<li>支付宝版权所有 2015-2018 ALIPAY.COM</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tvar tabs = document.getElementsByName('tab');\r\n");
      out.write("\tvar contents = document.getElementsByName('divcontent');\r\n");
      out.write("\t\r\n");
      out.write("\t(function changeTab(tab) {\r\n");
      out.write("\t    for(var i = 0, len = tabs.length; i < len; i++) {\r\n");
      out.write("\t        tabs[i].onmouseover = showTab;\r\n");
      out.write("\t    }\r\n");
      out.write("\t})();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTab() {\r\n");
      out.write("\t    for(var i = 0, len = tabs.length; i < len; i++) {\r\n");
      out.write("\t        if(tabs[i] === this) {\r\n");
      out.write("\t            tabs[i].className = 'selected';\r\n");
      out.write("\t            contents[i].className = 'show';\r\n");
      out.write("\t        } else {\r\n");
      out.write("\t            tabs[i].className = '';\r\n");
      out.write("\t            contents[i].className = 'tab-content';\r\n");
      out.write("\t        }\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction GetDateNow() {\r\n");
      out.write("\t\tvar vNow = new Date();\r\n");
      out.write("\t\tvar sNow = \"\";\r\n");
      out.write("\t\tsNow += String(vNow.getFullYear());\r\n");
      out.write("\t\tsNow += String(vNow.getMonth() + 1);\r\n");
      out.write("\t\tsNow += String(vNow.getDate());\r\n");
      out.write("\t\tsNow += String(vNow.getHours());\r\n");
      out.write("\t\tsNow += String(vNow.getMinutes());\r\n");
      out.write("\t\tsNow += String(vNow.getSeconds());\r\n");
      out.write("\t\tsNow += String(vNow.getMilliseconds());\r\n");
      out.write("\t\tdocument.getElementById(\"WIDout_trade_no\").value =  sNow;\r\n");
      out.write("\t\tdocument.getElementById(\"WIDsubject\").value = \"测试\";\r\n");
      out.write("\t\tdocument.getElementById(\"WIDtotal_amount\").value = \"0.01\";\r\n");
      out.write("\t}\r\n");
      out.write("\t//GetDateNow();\r\n");
      out.write("</script>\r\n");
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
