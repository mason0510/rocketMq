1.
单机模式
消息关闭或者磁盘满

2.BeanDefinitionOverrideException
确保每个绑定有唯一的目标（destination）和消费者组（group）名称的原因是为了避免 bean 重定义问题
如果多个绑定共享相同的消费者组名称，可能会导致消息被多次处理或处理混乱。


3。
Caused by: org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers


4.
RocketMQ Message hasn‘t been sent. Caused by No route info of this topic
名称应该是 consumequeue ，这个文件夹存放消费者订阅的队列信息，所以才会报错说找不到Topic的路由信息

5.找不到bean
4.9rocketmq版本对应2.6版本springboot.
