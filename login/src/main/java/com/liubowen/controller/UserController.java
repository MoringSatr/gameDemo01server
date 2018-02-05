package com.liubowen.controller;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * @author liubowen
 * @date 2018/2/4 18:22
 * @description
 */
@RestController
@RequestMapping("/userController")
public class UserController {

    @PostMapping("/login")
    public Map<String, Object> login() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("code", 0);
        map.put("msg", "登陆成功");
        return map;
    }
}
