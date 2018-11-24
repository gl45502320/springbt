package com.gaolong.controller;

import com.gaolong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/pageSelectProduct")
    public @ResponseBody Map pageSelectProduct(String name, int page, int rows){

        System.out.println("page--->"+page);
        System.out.println("rows--->"+rows);
        return productService.pageSelectProduct(name, page, rows);

    }
}
