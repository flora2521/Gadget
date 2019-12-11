package org.yi.demo.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloReceiver
 * @Author Maoxiaolin
 * @Date 2019/12/5 11:57
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = "topic.message2")
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) throws InterruptedException {
        Thread.sleep(10);
        System.out.println("Receiver2  : " + hello);
    }

}
