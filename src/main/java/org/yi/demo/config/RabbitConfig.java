package org.yi.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName RabbtiConfig
 * @Author Maoxiaolin
 * @Date 2019/12/5 11:46
 * @Version 1.0
 **/
@Configuration
public class RabbitConfig {

    final static String message1 = "topic.message1";
    final static String message2 = "topic.message2";

    @Bean
    public Queue queueMessage1(){
        return new Queue(message1);
    }

    @Bean
    public Queue queueMessage2(){
        return new Queue(message2);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessage1, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage1).to(exchange).with("topic.message1");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessage2, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage2).to(exchange).with("topic.#");
    }

}
