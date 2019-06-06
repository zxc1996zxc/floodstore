package com.CHat;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Chat chat=new Chat();
        Server server=new Server();
        chat.send("4566");
        chat.start();
        server.start();
    }

}
