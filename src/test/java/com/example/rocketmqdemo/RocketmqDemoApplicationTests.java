package com.example.rocketmqdemo;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        DefaultMQProducer producer = new DefaultMQProducer("producer_group");
        // Specify name server addresses.
        producer.setNamesrvAddr("localhost:9876");
        // Launch the instance.
        producer.start();
        for (int i = 0; i < 10; i++) {
            // Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTest" /* Topic */,
                    "TagA" /* Tag */,
                    ("Hello RocketMQ " + i).getBytes() /* Message body */
            );
            // Call send message to deliver message to one of brokers.
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        // Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}
