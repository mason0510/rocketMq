package com.example.rocketmqdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(String message) {
        streamBridge.send(MySource.OUTPUT_1, message);
    }
}
