package com.example.rocketmqdemo.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
//    String INPUT = "input";
    String INPUT1 = "input1";
    String INPUT2 = "input2";

//    @Input(MySink.INPUT)
//    SubscribableChannel input();

    @Input(MySink.INPUT1)
    SubscribableChannel input1();

    @Input(MySink.INPUT2)
    SubscribableChannel input2();
}
