<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%	
	//获取项目名
	String path = request.getContextPath();
	//获取tomcat 协议+地址+端口号+ 获取项目名
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	//获取tomcat 协议+地址+端口号
	String imgPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/xmsp/";
	
%>


<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <script src="js/jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="css/index.css">
	<script type="text/javascript">
	
	
</script>
</head>
<body>
    <div class="order_head">
        <div class="head_background">
            <div class="head_box">
                <a href="index.html" class="head_left_a"><img src="img/logo.jpg" alt="" class="head_left_p"></a>
                <h1 class="head_h1">我的购物车</h1>
                <div class="head_right">
                    <span class="head_right_in"> ${USER.username } </span>
                    <span class="head_right_in">|</span>
                    <a href="" class="head_right_in">我的订单</a>
                </div>

            </div>
        </div>
    </div>
    <div class="trolley_background">
        <div class="trolley_background_in">
            <div class="tro_tab_h">
                <div class="col tro_tab_check">
                    <h1 class="tro_tab_check_p">√</h1>
                    <span class="tro_tab_check_sp">全选</span>

                </div>
                <div class="col tro_tab_img">

                </div>
                <p class="col tro_tab_name">商品名称</p>
                <div class="col tro_tab_price">单价</div>
                <div class="col tro_tab_num">数量</div>
                <div class="col tro_tab_total">小计</div>
                <div class="col tro_tab_action">操作</div>

            </div>
            
            <c:forEach items="${TroList }" var="tl" >
            <div class="tro_tab_h1">
                <div class="col tro_tab_check">
                    <h1 class="tro_tab_check_p" style="background-color: #fff">
						<input type="checkbox" name="ids">
					</h1>
                    <span class="tro_tab_check_sp"></span>

                </div>
                <div class="col tro_tab_img">
                    <img src="<%=imgPath %>${tl.g.pic}" alt="">

                </div>
                <div class="col tro_tab_name">
                <!--<h2 tro_tab_name_h2>小米电视4A 32英寸 黑色 32英寸</h2>-->
               <li class="tro_tab_name_li1" style="font-size: 16px;">${tl.g.gname}&nbsp;${tl.g.color}</li>
                </div>
                <div class="col tro_tab_price">
                    <span  id="price">${tl.g.price}</span><span>元</span>
                </div>
                <div class="col tro_tab_num">
                    <a class="tro_tab_num_p1" id="subtract" href="javascript:void(0)" onclick="addorDeleteNumber(${tl.tid},${tl.number-1 })">-</a>
                    <input type="text" value="${tl.number}" id="num">
                    <a class="tro_tab_num_p2" id="plus" href="javascript:void(0)" onclick="addorDeleteNumber(${tl.tid},${tl.number+1 })">+</a>
                </div>
                <div class="col tro_tab_total "><span class="tro_tab_total_value" id="prices" >总价${tl.g.price*tl.number}</span>元
				<c:set var="sumprice" value="${sumprice+tl.g.price*tl.number}" ></c:set>
                </div>
                <div class="col tro_tab_action" style="cursor: pointer;width: 40px;height: 40px;" onclick="delGoods(${tl.tid})">删除</div>
            </div>
	           <c:set var="count" value="${count+1}" ></c:set>
            </c:forEach>
        </div>
        
        <div class="tro_close_bot ">
            <!--<p class="tro_bot_ppp">+</p>-->
            <p class="tro_close_p "> <a href="indexServlet?fs=index">继续购物 </a>  | 共<span>${count }</span>种商品</p>
           
            <p class="tro_close_p_c">合计:<span id="close">${sumprice }</span>元</p>
            
            <p class="tro_close_p_r" style="cursor: pointer;" onclick="alipay(${sumprice },${count })">去结算</p>
        </div>


<script type="text/javascript">
	function addorDeleteNumber( tid, number ){
		
		if(number<1){
			number=1;
			alert("商品不能再减少了");
			return;
		}else if(number>5){
			number=5;
			alert("库存不足");
			return;
		}
		window.location="trolleyServlet?method=updateTro&tid="+tid+"&num="+number;
	}
	
	function delGoods(tid){
		
		if(confirm("确定删除吗")){
			window.location="trolleyServlet?method=deleteTro&tid="+tid;
			
		}
		
	}

	function alipay(sumprice ,count){
		
	 window.location="ordersServlet?method=insertOrders&sum_price="+sumprice+"&count="+count;
	}
	
	</script>
	
	
	
    </div>
	

   <jsp:include page="footer.jsp"></jsp:include>

   
</body>
<script type="text/javascript">
	 
	</script>
</html>