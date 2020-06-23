<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
//获取tomcat 协议+地址+端口号+ 获取项目名
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- !DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> --><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品分类</title>
<link href="<%=basePath %>admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath %>js/jquery-3.1.1.js"></script>


</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">分类管理</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
        
        
        <li class="click"><span><img src="<%=basePath %>admin/images/t02.png" /></span>修改</li>
        <li><span><img src="<%=basePath %>admin/images/t04.png" /></span>统计</li>
        <li style="cursor: pointer;" onclick="add_category()"><span><img src="<%=basePath %>admin/images/t01.png"  /></span>添加类别</li>
        <li style="cursor: pointer;" onclick="batchDelete()"><span><img src="<%=basePath %>admin/images/t03.png" /></span>批量删除</li>
        </ul>

    </div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="ca" type="checkbox" value="" onclick="clickAll()" /></th>
        <th>序号<i class="sort"><img src="<%=basePath %>admin/images/px.gif" /></i></th>
        <th>类别名称</th>
        <th>启用状态</th>
        <th>排序序号</th>
        <th>创建时间</th>
        <th>描述</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${categ }" var="cate" varStatus="i">
        <tr>
        <td><input  name="ch" type="checkbox"  value="${cate.cid }"  /></td>
        <td>${i.count }</td>
        <td>${cate.name }</td>
        <td>
        <c:if test="${cate.state==1 }">启用</c:if>
        <c:if test="${cate.state==0 }">未启用</c:if>
        </td>
        <td>${cate.order_number }</td>
        <td>${cate.create_time }</td>
        <td>${cate.description }
        </td>
        <td><a href="CategoryServlet?method=selectCategoryByCid&cid=${cate.cid }">修改</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共<i class="blue">${pt.totalCount }</i>条记录，当前显示第&nbsp;<i class="blue">${pt.currentPage } &nbsp;</i>页</div>
        <ul class="paginList">
	        
	         <li class="paginItem"><a href="CategoryServlet?method=findCategoryList&currentPage=1">首页</a></li>
	         <li class="paginItem"><a href="CategoryServlet?method=findCategoryList&currentPage=${pt.prePage }">上一页</a></li>
	         <li class="paginItem"><a href="CategoryServlet?method=findCategoryList&currentPage=${pt.nextPage }">下一页</a></li>
	         <li class="paginItem"><a href="CategoryServlet?method=findCategoryList&currentPage=${pt.totalPages }">尾页</a></li>
	         
	        
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
    
    <script type="text/javascript">
    
    
    
	$('.tablelist tbody tr:odd').addClass('odd');
	
	function clickAll(){
		
		$('[name="ch"]').prop("checked",$('[name="ca"]').prop("checked"));
	}
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
			window.location="CategoryServlet?method=deleteCate&ids="+ids;
		}
	}
	
	function add_category(){
		window.location="admin/category_add.jsp";
	}
	
/* 	$("#update").click(function(){
		var i=0;
		alert(1);
		$('[name="ch"]:checked').each(function(){
			i++;
		})
		if(i=0){
			alert("请选择后再修改");
			return;
		}else(i>1){
			alert("请选择一个进行修改");
			return;
		}
		var cid = $("#li").val();
		window.location="CategoryServlet?method=selectCategoryByCid&cid="+cid;
	}) */
	
	</script>
</body>
</html>
