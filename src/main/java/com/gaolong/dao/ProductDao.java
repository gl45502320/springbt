package com.gaolong.dao;

import com.gaolong.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    //调用jar工具分页查询
    public List<Product> pageSelectProduct(@Param("book_name")String book_name);

    public List<Product> pageProduct(@Param("book_name")String book_name,@Param("start")int start,@Param("pageSize")int pageSize);


    public void deleteProductAll(int []ids);

    public int countProduct(@Param("book_name")String book_name);

}
