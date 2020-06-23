<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%	
	//获取项目名
	String path = request.getContextPath();
	//获取tomcat 协议+地址+端口号+ 获取项目名
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	//获取tomcat 协议+地址+端口号
	String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/xmsp/";
	
%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> --><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品信息</title>
<link href="<%=basePath %>admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath %>js/jquery-3.1.1.js"></script>

<!-- <script type="text/javascript">

// old write 
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});



</script> -->
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
        <li style="cursor: pointer;" onclick="add_goods()"  id="insert" ><span><img src="admin/images/t01.png"/></span>添加商品</li>
        <li style="cursor: pointer;" onclick="batchDelete()"><span><img src="admin/images/t03.png" /></span>批量删除</li>
        </ul>

    </div>
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input id="checkAll" name="checkAll" type="checkbox" value=""/></th>
        <th>序号<i class="sort"><img src="admin/images/px.gif" /></i></th>
        <th>商品类别</th>
        <th>商品名称</th>
        <th>商品颜色</th>
        <th>商品价格</th>
        <th width="10%">简介</th>
        <th width="20%">详情</th>
       	<th>商品展示图</th>
       	<th>是否热推</th>
       	<th>型号</th>
       	<th>生产日期</th>
       	<th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="go" varStatus="i">
        <tr>
        	<td><input id="che" name="che" type="checkbox" value="${go.gid }"/></td>
        	<td>${i.count }</td>
        	<td>${go.cate.name }</td>
        	<td>${go.gname }</td>
        	<td>${go.color }</td>
        	
        	<td>${go.price }</td>
        	<td>
        	<c:if test="${go.description.length()<6 }">${go.description }</c:if>
        	<c:if test="${go.description.length()>6 }">${go.description.substring(0,6) }...</c:if>
        	</td>
        	<td>
        	<c:if test="${go.full_description.length()<6 }">${go.full_description }</c:if>
        	<c:if test="${go.full_description.length()>6 }">${go.full_description.substring(0,6) }...</c:if>
        	</td>
        	<td><img alt="" src="<%=imgPath %>${go.pic }" width="60px" height="60px"></td>
        	<td>${go.state }</td>
        	<td>${go.version }</td>
        	<td>${go.product_date }</td>
        	<td><a href="GoodsServlet?method=findGoodBygid&gid=${go.gid }">修改</a></td>
        </tr>
        
        </c:forEach>
        
        
        </tbody>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共${pt.totalCount }<i class="blue"></i>条记录，当前显示第&nbsp;<i class="blue">${pt.currentPage }&nbsp;</i>页</div>
        <ul class="paginList">
	        
	         <li class="paginItem"><a href="GoodsServlet?method=findGoodsList&currentPage=1">首页</a></li>
	         <li class="paginItem"><a href="GoodsServlet?method=findGoodsList&currentPage=${pt.prePage }">上一页</a></li>
	         <li class="paginItem"><a href="GoodsServlet?method=findGoodsList&currentPage=${pt.nextPage }">下一页</a></li>
	         <li class="paginItem"><a href="GoodsServlet?method=findGoodsList&currentPage=${pt.totalPages }">尾页</a></li>
	         
	        
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
	$("#checkAll").click(function(){
		$("[name='che']").prop("checked",$(this).prop("checked"));
		
	})
	
	$("#insert").click(function(){
		//window.location="admin/goods_add.jsp";
		window.location="GoodsServlet?method=selectGoodsName";
	})
	function batchDelete(){
		var str = "";
		$('[name="che"]:checked').each(function () {
			str+=","+$(this).val();
		})
		if(str==""){
			alert("请选择后再删除")
			return;
		}else{
			str = str.substring(1);
			if(confirm("确认删除吗")){
				window.location="GoodsServlet?method=deleteGoods&gid="+str;
			}
		}
	}
	
	</script>
	
	
</body>
</html>
