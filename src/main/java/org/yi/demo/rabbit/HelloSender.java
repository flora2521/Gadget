package org.yi.demo.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloSender
 * @Author Maoxiaolin
 * @Date 2019/12/5 11:53
 * @Version 1.0
 **/
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void send1() {
        for (int i = 0; i < 10; i++) {
            String context = "hi, i am message 1"+"第"+i;
            this.rabbitTemplate.convertAndSend("exchange", "topic.message1", context);
        }

    }

    public void send2() {
        for (int i = 0; i < 10; i++) {
            String context = "hi, i am messages 2"+"第"+i;
            this.rabbitTemplate.convertAndSend("exchange", "topic.message2", context);
        }
    }


}
