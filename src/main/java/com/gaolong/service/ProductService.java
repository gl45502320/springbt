package com.gaolong.service;

import java.util.Map;

public interface ProductService{

    public Map pageSelectProduct(String name, int PageNum, int PageSize);


    public void deleteProductAll(int []ids);
}
