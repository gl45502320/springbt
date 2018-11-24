package com.gaolong.service.impl;

import com.gaolong.dao.ProductDao;
import com.gaolong.entity.Product;
import com.gaolong.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    public Map pageSelectProduct(String name, int PageNum, int PageSize){
        Map map=new HashMap();
        PageHelper.startPage(PageNum,PageSize);
        String names=null;
        if(name!=null){
            names="%"+name+"%";
        }
        System.out.println("PageNum-->"+PageNum);
        System.out.println("PageSize-->"+PageSize);
        List<Product> list=productDao.pageSelectProduct(names);
        PageInfo<Product> studentPageInfont =new PageInfo<>(list);
        map.put("rows", list);
        map.put("total", studentPageInfont.getTotal());

        System.out.println("studentPageInfont.getTotal()-->"+studentPageInfont.getTotal());

        return map;
    }

}
