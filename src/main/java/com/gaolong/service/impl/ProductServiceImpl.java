package com.gaolong.service.impl;

import com.gaolong.dao.ProductDao;
import com.gaolong.entity.Product;
import com.gaolong.service.ProductService;
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

        String names=null;
        if(name!=null){
            names="%"+name+"%";
        }
        int start=(PageNum-1)*PageSize;
        //int pageSize=PageNum*PageSize;
       // List<Product> listt=productDao.pageProduct(name, end, start);

        System.out.println("start-->"+start);
        System.out.println("pageSize-->"+PageSize);
     //   PageHelper.startPage(PageNum,PageSize);
//        List<Product> list=productDao.pageSelectProduct(names);
        List<Product> list=productDao.pageProduct(names, start, PageSize);
     //   PageInfo<Product> studentPageInfont =new PageInfo<>(list);
//        System.out.println("studentPageInfont-=-->"+studentPageInfont);
//        for (Product product : list) {
//            System.out.println(product);
//        }

        map.put("rows", list);
        map.put("total", productDao.countProduct(names));

//        System.out.println("studentPageInfont.getTotal()-->"+studentPageInfont.getTotal());
//        System.out.println("studentPageInfont-->"+studentPageInfont);

        return map;
    }

    @Override
    public void deleteProductAll(int []ids){
        productDao.deleteProductAll(ids);

    }

}
