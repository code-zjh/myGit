package com.dami.user.dao;

import com.dami.user.bean.user;

import java.util.List;

public interface UserMapper {
    public int insertUser(user u);
    public user checkUsername(String username);
    public user checkPhone(String phone);
    public user checkAdminByManager(String username, String password);
    /*public List<user> findUserList(PageTool pt);*/
    public int deleteByUid(String ids);
    public user selectUserByUid(int uid);

    public int updateManager(int uid, String uman);
    public user selectUserByPhone(String phone);

    List<user> selectUserList();
}
