package com.dami.trolley.dao;

import com.dami.trolley.bean.trolley;
import com.dami.user.bean.user;

import java.util.List;

public interface trolleyMapper {
    trolley selectTrolleyByUG(trolley tro);

    int insertTrolley(trolley tro);

    int updateTrolley(trolley tt);

    int selectTrolleyCountByuid(int uid);

    List<trolley> findTrolley(user u);

    int updateTrolley1(int tid, int number);

    int deleteTrolley(int tid);

    int updateState(int uid, String orders_number);
}
