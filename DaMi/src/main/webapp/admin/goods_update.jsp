<%@page import="com.dami.goods.bean.goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/xmsp/";
%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> --><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改商品</title>
<link href="<%=basePath %>admin/css/style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript" src="<%=basePath %>admin/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery-3.1.1.js"></script>

</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">修改商品</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>商品信息</span></div>
    
    <form action="<%=basePath %>/GoodsServlet?method=updateGoods&gid=${goo.gid }" method="post" enctype="multipart/form-data">
	    <ul class="forminfo">
	    	 
	    	 <!-- 商品分类信息 -->
	    	 <li>
	    	 	<label>商品分类</label>
	    	 	
	    	 	<select name="cid" class="dfinput">
	    	 	<c:forEach items="${caname }" var="cc">
	    	 		<option value="${cc.cid }">${cc.name }</option>
	    	 	</c:forEach>
	    	 	</select>
	    	 </li>
	    	 
	    	 
		    <li><label>商品名称</label><input name="name" type="text" class="dfinput" value="${goo.gname }" /><i>商品名称不能超过30个字符</i></li>
		    <li><label>颜色</label><input name="color" type="text" class="dfinput"  value="${goo.color }" /></li>
		    <li><label>规格尺寸</label><input name="size" type="text" class="dfinput" value="${goo.size }"  /></li>
		    <li><label>单价</label><input name="price" type="text" class="dfinput" value="${goo.price }"  /></li>
		    <li><label>简介</label>
		    	<textarea name="description" cols="10" rows="10" class="textinput" style="height: 80px">${goo.description }</textarea>
		    </li>
		    <li><label>完整介绍</label>
		    	<textarea name="full_description" cols="10" rows="10" class="textinput" style="height: 80px">${goo.full_description }</textarea>
		    </li>
		    <li><label>商品展示图</label><input type="hidden" name = "hiddenImg" value ="${goo.pic }" >
		    	<input name="picm" type="file"/><font style="color: red">${msg }<img src="<%=imgPath %>${goo.pic }" height="100px" width="100px" ></font>
		    </li>
		    <li><label>商品小类别</label>
			    <cite>
				    <input name="state" type="radio" value="0" 
				    <c:if test="${goo.state==0 }">checked="checked"</c:if>
				     />正常&nbsp;&nbsp;&nbsp;&nbsp;
				    <input name="state" type="radio" value="1"
				     <c:if test="${goo.state==1 }">checked="checked" </c:if>
				     />热门产品
				    <input name="state" type="radio" value="2"
				     <c:if test="${goo.state==2 }">checked="checked"</c:if>
				     />为你推荐
				    <input name="state" type="radio" value="3" 
				    <c:if test="${goo.state==3 }">checked="checked"</c:if>
				    />新品
				    <input name="state" type="radio" value="4"
				      <c:if test="${goo.state==4 }">checked="checked"</c:if>
				     />小米明星单品
			    </cite>
		    </li>
		    <li><label>型号</label><input name="version" type="text" class="dfinput" value="${goo.version }" /></li>
		    
		    <li><label>生产日期</label>
		    	<input class="Wdate" style="width: 345px;height: 32px;line-height: 32px;" value="${goo.product_date }" onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="product_date" type="text" class="dfinput"  />
		    </li>
		    
		    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存"/></li>
	    </ul>
    </form>
    </div>
</body>
</html>
