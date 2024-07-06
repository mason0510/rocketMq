package com.example.rocketmqdemo.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {

    String OUTPUT_1 = "output1";
    String OUTPUT_2 = "output2";

    @Output(MySource.OUTPUT_1)
    MessageChannel output1();


    @Output(MySource.OUTPUT_2)
    MessageChannel output2();
}
