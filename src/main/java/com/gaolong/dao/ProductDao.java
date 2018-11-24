package com.gaolong.dao;

import com.gaolong.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    //调用jar工具分页查询
    public List<Product> pageSelectProduct(@Param("book_name")String book_name);
}
