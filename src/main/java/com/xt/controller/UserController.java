package com.xt.controller;

import com.xt.utils.JsonResult;
import com.xt.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    List<User> arr = new ArrayList<>();
    {
        User user = new User();
        user.setUserId(1);
        user.setUserName("admin");
        user.setUserPwd("1234");
        arr.add(user);

        User user1 = new User();
        user1.setUserId(2);
        user1.setUserName("admin");
        user1.setUserPwd("2345");
        arr.add(user1);

        User user2 = new User();
        user2.setUserId(3);
        user2.setUserName("admin");
        user2.setUserPwd("3456");
        arr.add(user2);
    }

    @RequestMapping("/login")
    public @ResponseBody JsonResult<User> checkLogin(HttpSession httpSession, User user){
        User u = new User();
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i).getUserName().equals(user.getUserName())&&
               arr.get(i).getUserPwd().equals(user.getUserPwd())){
                u = arr.get(i);
            }
        }
        JsonResult<User> jr = null;
        if(u!=null) {
            httpSession.setAttribute("user", user);
            jr = new JsonResult<User>("OK", u, "200");
        }else {
            jr = new JsonResult<User>();
            jr.setErrorCode("500");
        }
        return jr;
    }
}
