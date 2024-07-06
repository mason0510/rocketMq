package com.example.rocketmqdemo;

import com.example.rocketmqdemo.service.MySink;
import com.example.rocketmqdemo.service.MySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.rocketmqdemo.service",
		"com.example.rocketmqdemo.controller"  // 添加这行来包含控制器
})
@MapperScan("com.example.rocketmqdemo.mapper")
@EnableBinding({Sink.class,Source.class,MySink.class,MySource.class})
public class RocketmqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketmqDemoApplication.class, args);
	}

}
