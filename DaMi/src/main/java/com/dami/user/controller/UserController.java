package com.dami.user.controller;

import com.dami.user.bean.user;
import com.dami.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService us;

    @RequestMapping("adminLogout")
    private String adminLogout(HttpServletRequest request, HttpSession hs) {
        // TODO Auto-generated method stub

             hs.invalidate();
            return "redirect:/admin/login.jsp";

    }

    @RequestMapping("updateManager/{uid}/{uman}")
    private String updateManager(@PathVariable("uid") Integer uid,@PathVariable("uman") String uman) {
        // TODO Auto-generated method stub
            us.updateManager(uid,uman);
            return "user/findUserList";
    }

    @RequestMapping("deleteUser/{ids}")
    private String deleteUser(@PathVariable("ids")String ids) {

        us.deleteUser(ids);
        return "redirect:/user/findUserList/1";
    }


    @RequestMapping("findUserList/{currentPage}")
    private ModelAndView findUserList(@PathVariable("currentPage") Integer currentPage) {
        // TODO Auto-generated method stub
        ModelAndView mv = new ModelAndView("/admin/user_list");

        PageHelper.startPage(currentPage,3);


        List<user> list = us.findUserList();
        PageInfo<user> pageInfo = new PageInfo<>(list);

        mv.addObject("allUser",pageInfo);

        return mv;
    }

    @RequestMapping("adminLogin")
    @ResponseBody
    private boolean adminLogin(String username,String password,HttpSession hs) throws IOException {
        // TODO Auto-generated method stub

        return us.checkAdmin(username,password,hs);

    }

    @RequestMapping("login")
    @ResponseBody
    private boolean login(String phone,String code,HttpSession session) {
        // TODO Auto-generated method stub

        boolean flag = us.login(phone,code,session);
        if(flag) {

            session.setAttribute("USER", us.selectUserByPhone(phone));
        }
        return flag;
    }

    @RequestMapping("sendCode")
    @ResponseBody
    private boolean sendCode(String phone,HttpSession session) {
        // TODO Auto-generated method stub
        boolean flag = us.sendCode(phone,session);
        return flag;
    }

    @RequestMapping("insertUser")
    private ModelAndView insertUser( @RequestParam("photo1") MultipartFile photo,user u) throws Exception {

        if(photo.getSize()==0) {
            ModelAndView mv = new ModelAndView("forward:../regist.jsp");

            mv.addObject("msg", "请选择头像");

            return mv;
        }


        String type = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1);

        if(!(type.equals("jpg")||type.equals("jpeg")||type.equals("png"))) {
            ModelAndView mv = new ModelAndView("regist");

            mv.addObject("msg", type+"文件格式不正确");

            return mv;

        }
        String photoName = UUID.randomUUID()+photo.getName();
        String path = "E:/xmpic";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        FileUtils.copyInputStreamToFile(photo.getInputStream(),new File(file,photoName+"."+type));


        u.setPhoto(photoName);
        u.setCreate_time(new Date());

        boolean flag = us.insertUser(u);



        if(flag) {
            return new ModelAndView("redirect:../login.jsp");
        }else {
            ModelAndView mv = new ModelAndView("regist");
            mv.addObject("msg","插入失败");
            return mv;
        }
    }
    @RequestMapping("checkUsername")
    @ResponseBody
    private boolean checkUsername(String username) {
        // TODO Auto-generated method stub

        return us.checkUsername(username);

    }

    @RequestMapping("checkPhone")
    @ResponseBody
    private boolean checkPhone(String phone) {
        // TODO Auto-generated method stub

        return us.checkPhone(phone);

    }

}
