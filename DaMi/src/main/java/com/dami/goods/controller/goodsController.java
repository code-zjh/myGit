package com.dami.goods.controller;

import com.dami.category.bean.category;
import com.dami.category.service.CategoryService;
import com.dami.goods.bean.goods;
import com.dami.goods.service.goodsService;
import com.dami.utils.PageTool;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class goodsController {
    @Resource
    goodsService gs;
    @Resource
    CategoryService cg;
    @RequestMapping("/GoodsServlet")
    public void Servlet(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) throws IOException {
        switch (method) {
            case "findGoodsList":
                findGoodsList(request, response);
                break;
            case "insertGood":
                insertGood(request, response);
                break;
            case "selectGoodsName":
                selectGoodsName(request, response);
                break;
            case "deleteGoods":
                deleteGoods(request, response);
                break;
            case "findGoodBygid":
                findGoodBygid(request, response);
                break;
            case "updateGoods":
                updateGoods(request, response);
                break;

            default:
                break;
        }

    }

    private void updateGoods(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int gid = Integer.valueOf(request.getParameter("gid"));
        int cid = Integer.valueOf(request.getParameter("cid"));
        String gname = request.getParameter("name");
        String color = request.getParameter("color");
        String size = request.getParameter("size");

        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String full_description = request.getParameter("full_description");

        String state = request.getParameter("state");
        String version = request.getParameter("version");
        String pro_date = request.getParameter("product_date");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        String pic = null;

        try {

            Part part = request.getPart("picm");

            String header = part.getHeader("content-disposition");
            String photo = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
            photo = UUID.randomUUID() + photo;
            String path = "E:\\xmsp";
            File file = new File(path);
            if (!file.exists()) {
                file.mkdir();
            }
            part.write(path + "/" + photo);

            pic = photo;


            Date product_date = sdf.parse(pro_date);



            goods go = new goods(gid,cid, gname, color, size, Double.parseDouble(price), description, full_description, pic,
                    Integer.valueOf(state), version, product_date);

            boolean flag = gs.updateGood(go);
            if (flag) {
                findGoodsList(request, response);
            }else {
                findGoodsList(request, response);
            }
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void findGoodBygid(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int gid = Integer.valueOf(request.getParameter("gid"));
        goods go = gs.findGoodBygid(gid);
        request.setAttribute("goo", go);
        List<category> list = cg.selectGoodsName();
        request.setAttribute("caname", list);
        try {
            request.getRequestDispatcher("admin/goods_update.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void deleteGoods(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        String gid = request.getParameter("gid");

        boolean flag = gs.deleteGoods(gid);

        if (flag) {
            findGoodsList(request, response);
        }
    }

    private void selectGoodsName(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        List<category> list = cg.selectGoodsName();
        request.setAttribute("caname", list);
        try {
            request.getRequestDispatcher("admin/goods_add.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void insertGood(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int cid = Integer.valueOf(request.getParameter("cid"));
        String gname = request.getParameter("name");
        String color = request.getParameter("color");
        String size = request.getParameter("size");

        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String full_description = request.getParameter("full_description");

        String state = request.getParameter("state");
        String version = request.getParameter("version");
        String pro_date = request.getParameter("product_date");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");

        try {
            Date product_date = sdf.parse(pro_date);

            Part part = request.getPart("pic");
            String header = part.getHeader("content-disposition");
            String photo = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
            photo = UUID.randomUUID() + photo;
            String path = "E:\\xmsp";
            File file = new File(path);
            if (!file.exists()) {
                file.mkdir();
            }
            part.write(path + "/" + photo);
            String pic = photo;
            goods go = new goods(cid, gname, color, size, Double.parseDouble(price), description, full_description, pic,
                    Integer.valueOf(state), version, product_date);
            boolean flag = gs.insertGood(go);
            if (flag) {
                findGoodsList(request, response);
            }
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    private void findGoodsList(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int count = gs.selectCount();
        String currentPage = request.getParameter("currentPage");
        PageTool pt = new PageTool(count, currentPage);
        List<goods> list = gs.findGoodsList(pt);

        request.setAttribute("list", list);

        request.setAttribute("pt", pt);
        try {
            request.getRequestDispatcher("/admin/goods_list.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
