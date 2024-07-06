package com.example.rocketmqdemo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.rocketmqdemo.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MessageSender messageSender;

    @GetMapping("/send")
    public String send(@RequestParam(required = false, defaultValue = "HelloRocketMQ") String messageContent) {
        JSONObject message = new JSONObject();
        message.put("text", messageContent);
        message.put("timestamp", System.currentTimeMillis());

        try {
            messageSender.sendMessage(message.toString());  // 发送 JSON 字符串
            return "Message sent: " + message.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Failed to send message.";
    }
}

