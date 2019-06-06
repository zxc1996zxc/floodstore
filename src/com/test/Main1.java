package com.test;

/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class Main1 {
    public static void main(String[] args){
        //这里传入一个账户
        Account account=new Account(1000);

       SaveRunable sr=new SaveRunable(account);
        GetRunable gr=new GetRunable(account);
        //启动
        new Thread(sr).start();

        new Thread(gr).start();

    }
}
