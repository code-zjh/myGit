package com.dami.goods.service;

import com.dami.category.bean.category;
import com.dami.category.dao.categoryMapper;
import com.dami.goods.bean.goods;
import com.dami.goods.dao.goodsMapper;
import com.dami.utils.PageTool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class goodsService {
    @Resource
    categoryMapper cd;
    @Resource
    goodsMapper gd;
    public List<goods> findGoodsList(PageTool pt) {
        // TODO Auto-generated method stub
        List<goods> list = gd.selectAll(pt);

        List<category> list1 = cd.selectAll();
        for (goods go : list) {
            for (category cat : list1) {
                if(cat.getCid()==go.getCid()) {
                    go.setCate(cat);
                    break;
                }
            }
        }
        return list;
    }
    public int selectCount() {
        // TODO Auto-generated method stub
        return gd.selectCount();
    }
    public boolean insertGood(goods go) {
        // TODO Auto-generated method stub
        return gd.insertGood(go)==1;
    }
    public boolean deleteGoods(String uid) {
        // TODO Auto-generated method stub

        return gd.deleteGoodsBygid(uid)>0;
    }
    public goods findGoodBygid(int gid) {
        // TODO Auto-generated method stub
        return gd.findGoodBygid(gid);
    }
    public boolean updateGood(goods go) {
        // TODO Auto-generated method stub
        return gd.updateGood(go)==1;
    }
    public List<goods> findStarGoods(int state,int i) {
        // TODO Auto-generated method stub
        return gd.findStarGoods(state,i);
    }
    public List<goods> findjiadian(int i,int j) {
        // TODO Auto-generated method stub
        return gd.findjiadian(i,j);
    }
    public List<goods> findTuiJianGoods(String coo,int count) {
        // TODO Auto-generated method stub
        StringBuilder sql = new StringBuilder();


        String[] str = coo.split("#");
        for (int i = 0; i < str.length; i++) {
            if(i==0) {
                sql.append(" gname like '%"+str[0]+"%'");

            }else {
                sql.append(" or gname like '%"+str[i]+"%'");


            }
        }
        sql.append(" order by product_date limit "+count);
        return gd.findTuiJianGoods(sql.toString());
    }
}
