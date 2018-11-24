package com.gaolong.controller;

import com.gaolong.entity.User;
import com.gaolong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session, Map map, User user, String code){

        System.out.println("user===>"+user);
        System.out.println("code===>"+code);
        String kaptcha= (String) session.getAttribute("Kaptcha");
        System.out.println("kaptcha--->"+kaptcha);
        if(kaptcha.equalsIgnoreCase(code)){
            boolean bool=userService.login(user);
            if(bool){
                return "forward:/main/main.jsp";
            }else{
                return "forward:/main/main1.jsp";
            }
        }else{
            return "forward:/error.jsp";
        }

    }
}
