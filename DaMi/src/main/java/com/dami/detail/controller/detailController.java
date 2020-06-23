package com.dami.detail.controller;

import com.dami.goods.bean.goods;
import com.dami.goods.service.goodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class detailController {
    @Resource
    goodsService gs;
    @RequestMapping("/detailServlet")
    public void Servlet(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) throws IOException {
        switch (method) {
            case "detail":
                detail(request,response);
                break;

            default:
                break;
        }

    }

    private void detail(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int gid = Integer.valueOf(request.getParameter("gid"));
        goods go = gs.findGoodBygid(gid);
        request.setAttribute("detailgo", go);
        try {
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
