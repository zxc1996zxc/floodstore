package com.test01;

/**
 * Created by zxc1996zxc on 2019-05-30.
 */
public class Link {
Node first;
private  Integer size=0;
    //增加方法
    public  void  add(Object object){
        Node n=new Node();
        n.setObject(object);
        //判断是否第一次添加
        if(first==null){
            first=n;
        }else {
            Node temp=first;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
     size++;
    }
 //打印链表
    public  String toString(){
        StringBuffer sb=new StringBuffer("[");
        //不同于C++，这里java通过临时变量来声明
        Node temp=first;
        //当链表不为空
        if(first!=null){
            if(temp.next==null) {
                sb.append(temp.object);
            }else {
                sb.append(temp.object);
            }
        }
        while (temp.next!=null){
            temp=temp.next;
            if(temp.next==null){
                sb.append(temp.object);
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
class Node{
    Object object;
     Node next;
    //赋值

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}