<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" href="http://localhost:8080/DaMi/css/index.css">
    <script type="text/javascript" src="http://localhost:8080/DaMi/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="http://localhost:8080/DaMi/js/jquery.validate.js"></script>
    <script type="text/javascript" src="http://localhost:8080/DaMi/js/messages_zh.js"></script>
	<style type="text/css">
	.error{
			color:red;
			font-size:14px;
		}
	</style>
		
	
</head>
<body>
<div class="sign_background">
    <div class="sign_background_in">
        <div class="sign_background_no1">
            <a href="http://localhost:8080/DaMi/index.html"><img src="img/logo.jpg" alt=""></a>
        </div>
        <div class="sign_background_no2">注册大米帐号</div>
        <div class="sign_background_no3">
               
            <div class="sign_background_no5">
             	
             	<form action="http://localhost:8080/DaMi/user/insertUser" method="post" enctype="multipart/form-data">
             	
             		<table style="width: 500px;" border="0" cellspacing="0">
             			<tr>
             				<td width="25%" class="_left">姓名：</td>
             				<td><input type="text" name="name"></td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">性别：</td>
             				<td>
             					男<input name="sex" type="radio" value="1" checked="checked">
             				 	女<input name="sex" type="radio" value="0">
							</td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">电话号码：</td>
             				<td><input type="text" name="phone"  id="phone"><span id="phonemsg"></span></td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">所在地区：</td>
             				<td><input type="text" name="area"></td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">账号：</td>
             				<td><input type="text" name="username" id="username"><span id="usernamemsg"></span></td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">密码：</td>
             				<td><input type="text" name="password"></td>
             			</tr>
             			<tr>
             				<td width="25%" class="_left">上传头像：</td>
             				<td><input type="file" name="photo1"><span id="head">${msg }</span></td>
             			</tr>
             		</table>
             		<div class="sign_background_no6" id="btn" >立即注册</div>
             	</form>
             	 
            </div>
        </div>
        <div class="sign_background_no7">注册帐号即表示您同意并愿意遵守大米 <span>用户协议</span>和<span>隐私政策</span> </div>
    </div>
    <div class="sign_background_no8"><img src="img/sign01.jpg" alt=""></div>
</div>
<script type="text/javascript">
	$("#btn").click(function(){
		$("form").submit();
	})
	
	$("form").validate({
		rules:{
			"name":{
				"required":true
			},
			"area":{
				"required":true
			},
			"password":{
				"required":true
			}
		},
		messages:{
			"name":{
				"required":"姓名不能为空"
			},
			"area":{
				"required":"地区不能为空"
			},
			"password":{
				"required":"密码不能为空"
			}
		},
		errorElement:"error"
	});

	 $("#phone").blur(function(){
		
		var phone = $("#phone").val();
		
		if(phone==""||phone==null){
			$("#phonemsg").text("手机号不能为空").css("color","red");
			$("#phone").focus();
		}else if(!(/^1[3456789]\d{9}$/.test(phone))){
			$("#phonemsg").text("手机号格式不正确").css("color","red");
			$("#phone").focus();
		}else{
			$.ajax({
				url:"user/checkPhone",
				type:"post",
				data:{"phone":phone},
				dataType:"json",
				success:function(obj) {
					if(obj){
						$("#phonemsg").text("手机号已经被注册").css("color","red");
						$("#phone").focus();
					}else{
						$("#phonemsg").text("手机可以使用").css("color","green");
					}
				}
			})
		}
	})
	
	$("#username").blur(function(){
		
		var username = $("#username").val();
		
		if(username==""||username==null){
			$("#usernamemsg").text("用户名不能为空").css("color","red");
			$("#username").focus();
		}else{
			$.ajax({
				url:"user/checkUsername",
				type:"post",
				data:{"username":username},
				dataType:"json",
				success:function(obj) {
					if(obj){
						$("#usernamemsg").text("用户名已经被注册").css("color","red");
						$("#username").focus();
					}else{
						$("#usernamemsg").text("用户名可以使用").css("color","green");
					}
				}
			})
		}
	}) 
	
	
</script>
</body>
</html>