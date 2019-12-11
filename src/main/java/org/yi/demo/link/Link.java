package org.yi.demo.link;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @ClassName Link
 * @Author Maoxiaolin
 * @Date 2019/12/11 9:57
 * @Version 1.0
 **/
@Data
public class Link {

    Node head = null;

    @Data
    public static class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

    }

    public void addNode(Object object) {
        Node addNode = new Node(object);
        if (null == head) {
            head = addNode;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = addNode;
        }
    }

    public void traverse() {
        if (null == head) {
            System.out.println("NULL");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(JSON.toJSONString(tmp.data));
                tmp = tmp.next;
            }
        }
    }


    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }


    public void insertNode(int index, Object value) {
        if (index < 0 || index > length()) {
            System.out.println("ERROR");
            return;
        }
        int currentPos = 0;
        Node insertNode = new Node(value);
        Node tmp = head;
        if (index == 0) {
            head = insertNode;
            head.next = tmp;
        } else {
            while (tmp.next != null) {
                if ((index - 1) == currentPos) {
                    insertNode.next = tmp.next;
                    tmp.next = insertNode;
                    return;
                }
                currentPos++;
                tmp = tmp.next;
            }
        }
    }


    public void deleteNode(int index) {
        if (index < 0 || index > length()) {
            System.out.println("ERROR");
            return;
        }
        int currentPos = 0;
        Node tmp = head;
        if (index == 0) {
            if (tmp != null) {
                head = tmp.next;
            }
        } else {
            while (tmp.next != null) {
                if ((index - 1) == currentPos) {
                    Node deleteNode = tmp.next;
                    tmp.next = deleteNode.next;
                    return;
                }
                currentPos++;
                tmp = tmp.next;
            }
        }
    }

    public Object get(int index) {
        if (index < 0 || index > length()) {
            System.out.println("ERROR");
            return null;
        }
        Node tmp = head;
        int currentPos = 0;
        while (tmp != null) {
            if (currentPos == index) {
                return tmp.data;
            }
            currentPos++;
            tmp = tmp.next;
        }
        return null;
    }

}
