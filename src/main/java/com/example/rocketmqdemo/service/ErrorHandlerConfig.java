package com.example.rocketmqdemo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.handler.advice.ErrorMessageSendingRecoverer;
import org.springframework.messaging.MessageChannel;

@Configuration
public class ErrorHandlerConfig {
//    @Bean(name = "test-topic1.test-group.errors.recoverer")
    public ErrorMessageSendingRecoverer testTopicTestGroupErrorsRecoverer() {
        return new ErrorMessageSendingRecoverer(errorChannel());
    }

    @Bean
    public MessageChannel errorChannel() {
        return new DirectChannel();
    }
}
