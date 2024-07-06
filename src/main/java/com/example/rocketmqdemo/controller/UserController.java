package com.example.rocketmqdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.rocketmqdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author authorxx
 * @since 2024-07-06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/send")
    public String send(@RequestParam(required = false, defaultValue = "HelloRocketMQ") String messageContent) {
        try {
            Long selectCount = userMapper.selectCount(null);
            return "Message sent: " + selectCount.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Failed to send message.";
    }
}
