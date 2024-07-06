package com.example.rocketmqdemo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Paths;

@SpringBootTest
class RocketmqDemoApplicationTests {

//	@Autowired
//	private SinkSender sinkSender;


//
//
//	@Qualifier("Output-1")
//	@Autowired
//	private MessageChannel output1;
//
//	@Qualifier("Output-2")
//	@Autowired
//	private MessageChannel output2;
//
//	@Test
//	public void contextLoads(){
//		sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
//	}
//
//
//	@Test
//	public void contextLoads1(){
//		output1.send(MessageBuilder.withPayload("From Output-1").build());
//		output2.send(MessageBuilder.withPayload("From Output-2").build());
//	}

    public static void main(String[] args) throws Exception {
        // Instantiate with a producer group name.
//        DefaultMQProducer producer = new DefaultMQProducer("producer_group");
//        // Specify name server addresses.
//        producer.setNamesrvAddr("localhost:9876");
//        // Launch the instance.
//        producer.start();
//        for (int i = 0; i < 10; i++) {
//            // Create a message instance, specifying topic, tag and message body.
//            Message msg = new Message("TopicTest" /* Topic */,
//                    "TagA" /* Tag */,
//                    ("Hello RocketMQ " + i).getBytes() /* Message body */
//            );
//            // Call send message to deliver message to one of brokers.
//            SendResult sendResult = producer.send(msg);
//            System.out.printf("%s%n", sendResult);
//        }
//        // Shut down once the producer instance is not longer in use.
//        producer.shutdown();
//        FastAutoGenerator.create("jdbc:mysql://localhost:3306/wallet?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "zxc6545398")
//                .globalConfig(builder -> builder
//                        .author("Baomidou")
//                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
//                        .commentDate("yyyy-MM-dd")
//                )
//                .packageConfig(builder -> builder
//                        .parent("com.baomidou.mybatisplus")
//                        .entity("entity")
//                        .mapper("mapper")
//                        .service("service")
//                        .serviceImpl("service.impl")
//                        .xml("mapper.xml")
//                )
//                .strategyConfig(builder -> builder
//                        .entityBuilder()
//                        .enableLombok()
//                )
//                .templateEngine(new FreemarkerTemplateEngine())
//                .execute();

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/wallet?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "zxc6545398")
                .globalConfig(builder -> {
                    builder.author("Your Name") // 设置作者
                            .outputDir("src/main/java"); // 输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .entity("entity") // 设置实体类包名
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
    }

    @Test
	public void contextLoads1(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/wallet?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "zxc6545398")
                .globalConfig(builder -> {
                    builder.author("Your Name") // 设置作者
                            .outputDir("src/main/java"); // 输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .entity("entity") // 设置实体类包名
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
	}

}
