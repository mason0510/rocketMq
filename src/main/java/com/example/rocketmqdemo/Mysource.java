package com.example.rocketmqdemo;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Mysource {
    String OUTPUT = "customOutput";

//    @Output(Mysource.OUTPUT)
//    MessageChannel output();
}
