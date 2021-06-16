package com.example.optimist.controller;

import com.alibaba.fastjson.JSON;
import com.example.optimist.bean.Registered;
import com.example.optimist.bean.UserUpdate;
import com.example.optimist.entity.Flower;
import com.example.optimist.entity.Flowerinformation;
import com.example.optimist.entity.Newsflower;
import com.example.optimist.entity.User;
import com.example.optimist.mapper.FlowerMapper;
import com.example.optimist.mapper.FlowerinformationMapper;
import com.example.optimist.mapper.NewsflowerMapper;
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

    @Autowired
    private NewsflowerMapper newsflowerMapper;

    @Autowired
    private FlowerinformationMapper flowerinformationMapper;

    @Autowired
    private FlowerMapper flower;

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

    @PostMapping("/register")
    @ResponseBody
    public String register(Registered form) {
        User user = userMapper.selectByName(form.getName());
        Map<String, String> status = new HashMap<>();
        if (user != null) {
            status.put("status", "error");
            status.put("dsc", "user already exists");
        } else {
            User newUser = new User();
            newUser.setUname(form.getName());
            newUser.setUnickName(form.getName());
            newUser.setUpassword(form.getPassword());
            userMapper.insertSelective(newUser);
            status.put("status", "success");
            status.put("dsc", "user registration successful");
        }
        return JSON.toJSONString(status);
    }

    @PostMapping("/updateInfo")
    @ResponseBody
    public String updateInfo(UserUpdate form) {
        User user = userMapper.selectByPrimaryKey(form.getUno());
        Map<String, String> status = new HashMap<>();
        if (user.getUno().equals(form.getUno())) {
            user.setUnickName(form.getNick_name());
            user.setUpassword(form.getPassword());
            userMapper.updateByPrimaryKeySelective(user);
            status.put("form_name", form.getNick_name());
            status.put("user_name", form.getNick_name());
            status.put("status", "success");
            status.put("dsc", "Reset successfully");
        }
        return JSON.toJSONString(status);
    }

    @PostMapping("/showLogin")
    @ResponseBody
    public String showLogin(){
        List<User> users = userMapper.returnAll();
        return JSON.toJSONString(users);
    }

    @PostMapping("/showNews")
    @ResponseBody
    public String showNews() {
        List<Newsflower> newsflowers = newsflowerMapper.returnAll();
        return JSON.toJSONString(newsflowers);
    }

    @PostMapping("/showClassification")
    @ResponseBody
    public String showClassification() {
        List<Flowerinformation> flowerinformations = flowerinformationMapper.returnAll();
        return JSON.toJSONString(flowerinformations);
    }

    @PostMapping("/showFlower")
    @ResponseBody
    public String showFlower() {
        List<Flower> flowers = flower.returnAll();
        return JSON.toJSONString(flowers);
    }

}
