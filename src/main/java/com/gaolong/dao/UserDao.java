package com.gaolong.dao;

import com.gaolong.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    public User login(@Param("user")User user);
}
