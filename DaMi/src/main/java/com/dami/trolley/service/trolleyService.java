package com.dami.trolley.service;

import com.dami.goods.dao.goodsMapper;
import com.dami.trolley.bean.trolley;
import com.dami.trolley.dao.trolleyMapper;
import com.dami.user.bean.user;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class trolleyService {
    @Resource
    trolleyMapper td;
    @Resource
    goodsMapper gd;
    public boolean insertTrolley(trolley tro) {
        // TODO Auto-generated method stub
        trolley tt = td.selectTrolleyByUG(tro);
        if(tt==null) {
            tro.setNumber(1);
            return td.insertTrolley(tro)==1;
        }else {
            tt.setNumber(tt.getNumber()+1);
            return td.updateTrolley(tt)!=1;
        }

    }
    public int selectTrolleyCountByuid(int uid) {
        // TODO Auto-generated method stub
        return td.selectTrolleyCountByuid(uid);

    }
    public List<trolley> findTrolley(user u) {
        // TODO Auto-generated method stub
        List<trolley> list = td.findTrolley(u);
        for (trolley tro : list) {
            tro.setU(u);
            tro.setG(gd.findGoodBygid(tro.getGid()));
        }
        return list;
    }
    public boolean updateTro(int tid, int number) {
        // TODO Auto-generated method stub
        return td.updateTrolley1(tid, number)==1;
    }
    public boolean deleteTro(int tid) {
        // TODO Auto-generated method stub
        return td.deleteTrolley(tid)==1;
    }
    public boolean updateState(int uid, String orders_number) {
        // TODO Auto-generated method stub
        return td.updateState(uid, orders_number)>0;
    }

}
