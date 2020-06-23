<%@page import="com.dami.user.bean.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.1.1.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="box">
      <div class="inner whiteGL">
          <div class="left">
              <a class="mix" href="">大米商城-学习专用</a>
          </div>
          <div class="right">
          	<%
          		user u = (user)session.getAttribute("USER");
  
              	if(u==null){ %>
              		<a class="mix" href="login.jsp">登录</a>
              <% 	}else{
            	  %> <a class="mix" href="">${USER.username }</a>                <%
              }
              %>
            
              <a href="regist.jsp">注册</a>
              <a class="max"  href="">消息通知</a>
              <a href="#"><span id="trrr">购物车( <span id="troll">0</span> )</span></a>
          </div>
      </div>
  </div>
  <div class="logo">
      <div class="logo_left">
          <div>
              <a href="javascript:void(0);" title="大米官网"><img class="xiaomi" src="img/logo.jpg"></a>
          </div>
      </div>
      <ul class="logo_center orangeGL">
          <a href="">大米手机</a>
          <a href="">黑米</a>
          <a href="">笔记本</a>
          <a href="">电视</a>
          <a href="">盒子</a>
          <a href="">新品</a>
          <a href="">路由器</a>
          <a href="">智能硬件</a>
          <a href="">服务</a>
          <a href="">社区</a>
      </ul>
      <formv class="logo_right">
         <div class="logo_input"><input id="search" type="text">
             <div class="logo_input_div">
                <!--  <a class="logo_input_a" href="">小米5 新品</a>
                 <a class="logo_input_a" href="">小米Note 3</a> -->
             </div>


         </div>
          <a class="logo_right_a"><img src="img/find.jpg"></a>
          <!--<a href="">红米5新品</a>-->
          <!--<a href="">小米Noto 3</a>-->
      </formv>
  </div>
  <script type="text/javascript">
  	$(".logo_right_a").click(function(){
  		var search=$('#search').val();
  		if(search==null&&search==""){
  			alert("请输入关键字");
  			return;
  		}
  		$.ajax({
  			url:"IndexInfoServlet",
  			type:"post",
  			data:{"search":search,"method":"addCookie"},
  			dataType:"json",
  			success:function(obj){
  				alert("cookie存储成功");
  				window.location.reload();
  			}
  		})
  	})
  		var user = "${sessionScope.USER}";
  		if(user!=null){
  			var uid = "${sessionScope.USER.uid}"
  			
  			$.ajax({
  				url:"trolleyServlet",
  				type:"post",
  				data:{"method":"selectTrolleyCount","uid":uid},
  				dataType:"text",
  				success:function(obj){
  					$("#troll").text(obj);
  				}
  			})
  		}
  		
  		$("#trrr").click(function () {
  			var user = "${sessionScope.USER}";
  	  		if(user==null||user==""){
  	  			alert("请登录后再点击");
  	  			return;
  	  		}else if($("#troll").text()=="0"){
  	  		alert("加点东西再来查看把");
  	  		return ;
  	  		}else{
  	  			var uid = "${sessionScope.USER.uid}";
  	  			window.location="trolleyServlet?method=findTrolley&uid="+uid;
  	  		}
		})
  </script>
</body>
</html>