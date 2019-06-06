package com.test01;

/**
 * Created by zxc1996zxc on 2019-05- Integer C=data[index];
        System.out.println("删除了"+C);30.
 */
public class Main02 {
    public static void main(String[] args){
        Ary a=new Ary(1);
        a.add(5);
        a.add(6);
        a.add(7);

        Object index = (Integer)a.getIndex(1);
        System.out.println(index);
        a.delete(1);
        Link ll=new Link();
        ll.add("苍老师");
        ll.add("李老师");
        System.out.println(ll.toString());
    }
}
