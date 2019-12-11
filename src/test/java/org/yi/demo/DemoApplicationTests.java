package org.yi.demo;


import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yi.demo.link.Link;
import org.yi.demo.rabbit.HelloSender;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

//    @Autowired
//    private HelloSender helloSender;
//
//    @Test
//    public void hello() throws Exception {
//        helloSender.send1();
//        helloSender.send2();
//    }

    @Test
    public void hello() {
        Link link = new Link();
//        link.addNode(1);
//        link.addNode(2);
//        link.addNode(3);
//        link.addNode(5);
//        link.insertNode(3, 4);
//        link.deleteNode(0);
//        System.out.println("操作之前"+JSON.toJSONString(link.get(2)));
//        link.traverse();
//        System.out.println("长度"+link.length());
//        link.insertNode(0, 1);
//        System.out.println("操作之后"+JSON.toJSONString(link.get(2)));
//        link.traverse();
//        System.out.println("长度"+link.length());
        link.insertNode(0, 3);
        link.traverse();
        link.deleteNode(0);
        link.traverse();
    }

}
