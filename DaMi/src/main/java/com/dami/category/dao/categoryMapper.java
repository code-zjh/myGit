package com.dami.category.dao;

import com.dami.category.bean.category;
import com.dami.utils.PageTool;

import java.util.List;

public interface categoryMapper {
    public List<category> findCategoryList(PageTool pt);
    public int selectCount();
    public int deleteCate(String ids);
    public int insertCategory(category cate);
    public category selectCategoryByCid(int cid);
    public int update(category cate);
    public List<category> selectAll();
    public List<category> selectCateName();
    public List<category> selectCateName1(int i);

}
