package com.dami.trolley.controller;

import com.dami.trolley.bean.trolley;
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
import java.util.List;

@Controller
public class trollerController {

    @Resource
    trolleyService ts;
    @RequestMapping("/trolleyServlet")
    public void service(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (method) {
            case "insertTrolley":
                insertTrolley(request,response);
                break;
            case "selectTrolleyCount":
                selectTrolleyCount(request,response);
                break;
            case "findTrolley":
                findTrolley(request,response);
                break;
            case "updateTro":
                updateTro(request,response);
                break;
            case "deleteTro":
                deleteTro(request,response);
                break;
            default:
                break;
        }
    }


    private void deleteTro(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int tid = Integer.valueOf(request.getParameter("tid"));
        boolean flag = ts.deleteTro(tid);

        try {
            if(flag) {
                findTrolley(request,response);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void updateTro(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int tid = Integer.valueOf(request.getParameter("tid"));

        int number = Integer.valueOf(request.getParameter("num"));

        boolean flag = ts.updateTro(tid,number);

        try {
            if(flag) {
                findTrolley(request,response);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void findTrolley(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        HttpSession hs = request.getSession();
        user u = (user)hs.getAttribute("USER");

        List<trolley> list = ts.findTrolley(u);

        hs.setAttribute("TroList", list);
        try {
            request.getRequestDispatcher("trolley.jsp").forward(request, response);
        } catch (ServletException e) {

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void selectTrolleyCount(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        try {
            int uid = Integer.valueOf(request.getParameter("uid"));
            int count = ts.selectTrolleyCountByuid(uid);
            try {
                response.getWriter().print(count);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


    }

    private void insertTrolley(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int uid = Integer.valueOf(request.getParameter("uid"));
        int gid = Integer.valueOf(request.getParameter("gid"));
        trolley tro = new trolley(uid, gid);
        boolean flag = ts.insertTrolley(tro);
        try {
            response.getWriter().print(flag);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
