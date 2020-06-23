package com.dami.category.service;

import com.dami.category.bean.category;
import com.dami.category.dao.categoryMapper;
import com.dami.goods.dao.goodsMapper;
import com.dami.utils.PageTool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {
    @Resource
    categoryMapper cs;
    @Resource
    goodsMapper gd;
    public List<category> findCategoryList(PageTool pt) {
        // TODO Auto-generated method stub
        return cs.findCategoryList(pt);
    }
    public int selectCount() {
        // TODO Auto-generated method stub
        return cs.selectCount();
    }
    public boolean deleteCate(String ids) {
        // TODO Auto-generated method stub
        gd.deleteGoods(ids);
        return cs.deleteCate(ids)>0;
    }
    public boolean insertCategory(category cate) {
        // TODO Auto-generated method stub
        return cs.insertCategory(cate)==1;
    }
    public category selectCategoryByCid(int cid) {
        // TODO Auto-generated method stub
        return cs.selectCategoryByCid(cid);
    }
    public boolean update(category cate) {
        // TODO Auto-generated method stub
        return cs.update(cate)==1;
    }
    public List<category> selectGoodsName() {
        // TODO Auto-generated method stub
        return cs.selectCateName();
    }
    public List<category> selectGoodsName(int i) {
        // TODO Auto-generated method stub
        return cs.selectCateName1(i);
    }
}
