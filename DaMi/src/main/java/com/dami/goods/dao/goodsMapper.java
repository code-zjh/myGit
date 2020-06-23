package com.dami.goods.dao;

import com.dami.goods.bean.goods;
import com.dami.utils.PageTool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface goodsMapper {
    public int deleteGoods(String ids);
    public List<goods> selectAll(PageTool pt);
    public int insertGood(goods go);
    public int deleteGoodsBygid(String gid);
    public goods findGoodBygid(int gid);
    public int updateGood(goods go);
    public List<goods> findStarGoods(int state,int i);
    public List<goods> findjiadian(int i,int j);
    public List<goods> findTuiJianGoods(@Param("coo")String coo);

    public int selectCount();
}
