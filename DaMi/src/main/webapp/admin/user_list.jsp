<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.dami.user.bean.user"%>
<%	
	//获取项目名
	String path = request.getContextPath();
	//获取tomcat 协议+地址+端口号+ 获取项目名
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/xmpic/";
%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> --><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息</title>
<link href="<%=basePath %>admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath %>js/jquery-3.1.1.js"></script>


</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">商品管理</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
        
        <!-- 
        
        <li class="click"><span><img src="images/t02.png" /></span>修改</li>
        <li><span><img src="images/t04.png" /></span>统计</li>
         -->
        <li style="cursor: pointer;" onclick="batchDelete()"><span><img src="<%=basePath %>admin/images/t03.png" /></span>批量删除</li>
        </ul>

    </div>
    <table class="tablelist">
    	<thead>
	    	<tr>
	        <th><input name="checkAll" type="checkbox" value=""  /></th>
	        <th>序号<i class="sort"><img src="<%=basePath %>admin/images/px.gif" /></i></th>
	        <th>姓名</th>
	        <th>性别</th>
	        <th>电话号码</th>
	        <th>所在地区</th>
	        <th>权限</th>
	        <th>账号</th>
	       	<th>头像</th>
	       	<th>注册时间</th>
	       	<th>操作</th>
	        </tr>
	        </thead>
        <tbody>
        <c:forEach items="${allUser.list }" var="user" varStatus="i" >
        <tr>
        	<th><input name="ch" type="checkbox" value="${user.uid }" /></th>
	        
        	<td>${user.uid }</td>
        	<td>${user.name }</td>
        	<td><c:if test="${user.sex==0 }">女</c:if>
        	<c:if test="${user.sex==1 }">男</c:if>
        	</td>
        	<td>${user.phone }</td>
        	<td>${user.area }</td>
        	<td><c:if test="${user.manager==0 }">管理员</c:if>
        	<c:if test="${user.manager==1 }">普通用户</c:if>
        	</td>
        	<td>${user.username }</td>
        	<td>
        	<img alt="" src="<%=imgPath %>${user.photo }" width="30px" height="30px">
        	</td>
        	<td>${user.create_time }</td>
        	<td>
        	<c:if test="${user.manager==0 }"><a href='user/updateManager/1/${user.uid }'><span style="color: red;">设为普通用户</span></a></c:if>
        	<c:if test="${user.manager==1 }"><a href='user/updateManager/0/${user.uid }'><span style="color: green;">设为管理员</span></a></c:if>
        	</td>
        	
        </tr>
        </c:forEach>	
        </tbody>
    </table>
   
    <div class="pagin">
    	<div class="message">共<i class="blue">${allUser.total }</i>条记录，当前显示第&nbsp;<i class="blue">${allUser.pageNum }&nbsp;</i>页</div>
        <ul class="paginList">
	        
	         <li class="paginItem"><a href="<%=basePath%>user/findUserList/1">首页</a></li>
	         <li class="paginItem"><a href="<%=basePath%>user/findUserList/${allUser.prePage }">上一页</a></li>
	         <li class="paginItem"><a href="<%=basePath%>user/findUserList/${allUser.nextPage }">下一页</a></li>
	         <li class="paginItem"><a href="<%=basePath%>user/findUserList/${allUser.pages }">尾页</a></li>
	         
	         
	        
        </ul>
    </div>
    
    
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
    
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	
	$('[name="checkAll"]').click(function(){
		
		$('[name="ch"]').prop("checked",$('[name="checkAll"]').prop("checked"));
	})
	function batchDelete(){
		var ids="";
		$('[name="ch"]:checked').each(function(){
			ids+=","+$(this).val();
		})
		if(ids==""){
			alert("请选择后再删除");
		}
		if(confirm("确定要删除吗")){
			ids=ids.substring(1);
			window.location="/DaMi/user/deleteUser/"+ids;
		}
	}
	</script>
</body>
</html>
