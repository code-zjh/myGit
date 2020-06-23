package com.dami.orders.controller;

import com.dami.orders.bean.orders;
import com.dami.orders.service.ordersService;
import com.dami.trolley.service.trolleyService;
import com.dami.user.bean.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
@Controller
public class ordersController {

    @Resource
    ordersService os;
    @Resource
    trolleyService ts;
    @RequestMapping("/ordersServlet")
    public void Servlet(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) throws IOException {

        switch (method) {
            case "selOrders":
                selOrders(request,response);
                break;
            case "insertOrders":
                insertOrders(request,response);
                break;
            case "updateOrderState":
                updateOrderState(request,response);
                break;
            default:
                break;
        }

    }

    private void updateOrderState(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        String orders_number = request.getParameter("orders_number");
        boolean flag = os.updateOrderState(1,orders_number);
        if(flag) {
            try {
                response.sendRedirect("IndexInfoServlet?method=showInfo");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    private void insertOrders(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        HttpSession hs = request.getSession();
        user u = (user)hs.getAttribute("USER");
        double sum_price = Double.parseDouble(request.getParameter("sum_price"));
        int count = Integer.valueOf(request.getParameter("count"));
        String orders_number = UUID.randomUUID().toString();
        orders or = new orders(orders_number, u.getUid(), sum_price, 0, new Date(), count);
        boolean flag = os.insertOrders(or);
        if(flag) {
            System.out.println("订单插入成功");
            boolean trolleyflag = ts.updateState(u.getUid(),orders_number);
            if(trolleyflag) {
                System.out.println("购物车修改成功");
                request.setAttribute("order", or);
                try {
                    request.getRequestDispatcher("pay/index.jsp").forward(request, response);
                } catch (ServletException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }else {
            System.out.println("失败");
        }
    }
    private void selOrders(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub

        int uid = Integer.valueOf(request.getParameter("uid"));
        double sum_price = Double.parseDouble(request.getParameter("sum_price"));

        orders ord = os.selectOrderByUid(uid);
        orders or = new orders();
        boolean flag=false;
        if(ord==null) {
            String orders_number = UUID.randomUUID()+"";
            or = new orders(orders_number,uid, sum_price, 0,new Date() , 1);
            flag = os.insertOrders(or);
        }else {
            or = new orders(ord.getOrders_number(),uid, ord.getSum_price()+sum_price, 0,new Date() , ord.getCount_number()+1);
            flag = os.updateOrders(or);
        }



        try {
            response.getWriter().print(flag);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
