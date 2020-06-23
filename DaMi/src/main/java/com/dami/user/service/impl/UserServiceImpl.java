package com.dami.user.service.impl;

import com.dami.user.bean.user;
import com.dami.user.dao.UserMapper;
import com.dami.user.service.UserService;
import com.dami.utils.SendSmS;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper ud;
    public boolean checkUsername(String username) {

        return ud.checkUsername(username)!=null;
    }
    public boolean checkPhone(String phone) {
        // TODO Auto-generated method stub
        return ud.checkPhone(phone)!=null;
    }
    public boolean insertUser(user u) {
        // TODO Auto-generated method stub
        return (ud.insertUser(u)==1);
    }
    public boolean sendCode(String phone, HttpSession session) {
        // TODO Auto-generated method stub
        int code = SendSmS.sendCode(phone);

        if(code==0){
            return false;
        }

        String phonecode = phone+"#"+code;
        session.setAttribute("phonecode", phonecode);

        return true;
    }
    public boolean login(String phone, String code, HttpSession session) {
        String str = phone+"#"+code;

        String phonecode = (String)session.getAttribute("phonecode");
        return str.equals(phonecode);
    }
    public boolean checkAdmin(String username, String password,HttpSession hs) {
        // TODO Auto-generated method stub
        user u = ud.checkAdminByManager(username,password);
        hs.setAttribute("user", u);
        return u!=null;
    }
    /*public List<user> findUserList(PageTool pt) {
        // TODO Auto-generated method stub
        return ud.findUserList(pt);
    }*/
    public boolean deleteUser(String ids) {
        // TODO Auto-generated method stub
        return ud.deleteByUid(ids)>0;
    }

    @Override
    public List<user> findUserList() {
        return ud.selectUserList();
    }

    public user selectUserByUid(int uid) {
        // TODO Auto-generated method stub
        return ud.selectUserByUid(uid);
    }

    public boolean updateManager(Integer uid, String uman) {
        // TODO Auto-generated method stub
        return ud.updateManager(uid,uman)==1;
    }
    public user selectUserByPhone(String phone) {
        // TODO Auto-generated method stub
        return ud.selectUserByPhone(phone);
    }
}
