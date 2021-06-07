package com.example.optimist.controller;

import com.alibaba.fastjson.JSON;
import com.example.optimist.bean.Registered;
import com.example.optimist.entity.User;
import com.example.optimist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 65667
 */
@Controller
public class LoginController implements Serializable {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    @ResponseBody
    public String login(Registered form) {
        User user = userMapper.selectByName(form.getName());
        Map<String, String> status = new HashMap<>();
        if (user == null) {
            status.put("status", "error");
            status.put("dsc", "the user does not exist");
            status.put("from", form.getName());
            return JSON.toJSONString(status);
        } else {
            if (form.getPassword().equals(user.getUpassword())){
                return JSON.toJSONString(user);
            }else {
                status.put("status","wrong");
                status.put("dsc","wrong password");
                status.put("from", form.getPassword());
                return JSON.toJSONString(status);
            }
        }
    }

    @PostMapping("/showLogin")
    @ResponseBody
    public String showLogin(){
        List<User> users = userMapper.returnAll();
        return JSON.toJSONString(users);
    }

}
