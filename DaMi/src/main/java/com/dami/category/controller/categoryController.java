package com.dami.category.controller;

import com.dami.category.bean.category;
import com.dami.category.service.CategoryService;
import com.dami.utils.PageTool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class categoryController {

    @Resource
    CategoryService cs;

    @RequestMapping("/CategoryServlet")
    public void CategoryServlet(@RequestParam(value = "method") String method, HttpServletRequest request, HttpServletResponse response) {
            switch(method) {
                case("findCategoryList"):
                    findCategoryList(request,response);
                    break;
                case("deleteCate"):
                    deleteCate(request,response);
                    break;
                case("insertCategory"):
                    insertCategory(request,response);
                    break;
                case("selectCategoryByCid"):
                    selectCategoryByCid(request,response);
                    break;
                case("updateCategory"):
                    updateCategory(request,response);
                    break;

                default:
                    break;
            }








        }


    private void updateCategory(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int cid = Integer.valueOf(request.getParameter("cid"));

        String name = request.getParameter("name");
        int state=Integer.valueOf(request.getParameter("state"));
        String order_number = request.getParameter("order_number");
        String description = request.getParameter("description");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        Date create_time = null;
        try {
            create_time = sdf.parse(request.getParameter("create_time"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        category cate = new category(cid,name, Integer.valueOf(state), Integer.valueOf(order_number), description, create_time);

        boolean flag = cs.update(cate);

        if(flag) {
            findCategoryList(request,response);
        }
    }

    private void selectCategoryByCid(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int cid = Integer.valueOf(request.getParameter("cid"));

        category cate = cs.selectCategoryByCid(cid);

        request.setAttribute("cate", cate);

        try {
            request.getRequestDispatcher("admin/category_update.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void insertCategory(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        String name = request.getParameter("cname");
        String state = request.getParameter("status");
        String order_number = request.getParameter("order_number");
        String mark = request.getParameter("mark");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        Date create_time = null;
        try {
            create_time = sdf.parse(request.getParameter("create_time"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        category cate = new category(name, Integer.valueOf(state), Integer.valueOf(order_number), mark, create_time);
        boolean flag = cs.insertCategory(cate);
        if(flag) {
            findCategoryList(request,response);
        }
    }

    private void deleteCate(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        String ids = request.getParameter("ids");
        boolean flag = cs.deleteCate(ids);
        if(flag) {
            findCategoryList(request, response);
        }
    }

    private void findCategoryList(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        int count = cs.selectCount();
        String currentPage = request.getParameter("currentPage");
        PageTool pt = new PageTool(count,currentPage);
        List<category> list = cs.findCategoryList(pt);
        request.setAttribute("categ", list);
        request.setAttribute("pt", pt);

        try {
            request.getRequestDispatcher("/admin/category_list.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}
}