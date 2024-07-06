package com.example.rocketmqdemo.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

//    @StreamListener(MySink.INPUT)
//    public void handleMessage(String message) {
//        System.out.println("Received message on input: " + message);
//    }
////
    @StreamListener(MySink.INPUT1)
    public void handleMessageInput1(String message) {
        System.out.println("Received message on input1: " + message);
    }

    @StreamListener(MySink.INPUT2)
    public void handleMessageInput2(String message) {
        System.out.println("Received message on input2: " + message);
    }

}
