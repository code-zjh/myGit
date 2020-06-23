package com.dami.indexInfo;

import com.dami.category.bean.category;
import com.dami.category.service.CategoryService;
import com.dami.goods.bean.goods;
import com.dami.goods.service.goodsService;
import com.dami.utils.CookieUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller

public class IndexInfoController {
    @Resource
    private CategoryService cs ;
    @Resource
    private goodsService gs ;
    @RequestMapping("/IndexInfoServlet")
    public void service(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (method) {
            case"showInfo":
                showInfo(request,response);
                break;
            case"addCookie":
                addCookie(request,response);
                break;
            default:
                break;
        }
    }


    private void addCookie(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        // TODO Auto-generated method stub
        String search = request.getParameter("search");
        System.out.println(search);
        CookieUtils.addCookie(search,request, response);
        try {
            response.getWriter().print(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private void showInfo(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        // TODO Auto-generated method stub
        List<category> clist = cs.selectGoodsName(10);
        request.setAttribute("clist", clist);

        List<goods> glist = gs.findStarGoods(4,5);
        request.setAttribute("glist", glist);

        List<goods> hotGoods = gs.findStarGoods(1, 4);
        request.setAttribute("hotGoods", hotGoods);

        List<goods> jiadian1 = gs.findjiadian(0,4);
        request.setAttribute("jiadian1", jiadian1);
        List<goods> jiadian2 = gs.findjiadian(4,4);
        request.setAttribute("jiadian2", jiadian2);

        List<goods> zhineng = gs.findStarGoods(6, 5);
        request.setAttribute("zhineng", zhineng);
        List<goods> tuijian = new ArrayList<goods>();
        String coo = CookieUtils.getCookie(request);

        if(coo==null||coo=="") {
            tuijian = gs.findStarGoods(2, 5);
        }else {
            tuijian = gs.findTuiJianGoods(coo,5);
        }

        request.setAttribute("tuijian", tuijian);

        try {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
