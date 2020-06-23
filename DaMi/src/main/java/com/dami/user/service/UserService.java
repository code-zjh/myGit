package com.dami.user.service;

import com.dami.user.bean.user;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
    boolean updateManager(Integer uid, String uman);

    boolean deleteUser(String ids);

    List<user> findUserList();

    boolean checkAdmin(String username, String password, HttpSession hs);

    boolean login(String phone, String code, HttpSession session);

    Object selectUserByPhone(String phone);

    boolean sendCode(String phone, HttpSession session);

    boolean insertUser(user u);

    boolean checkUsername(String username);

    boolean checkPhone(String phone);
}
