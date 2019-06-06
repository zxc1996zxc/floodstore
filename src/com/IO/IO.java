package com.IO;

import java.io.*;

/**
 * Created by zxc1996zxc on 2019-06-02.
 */
public class IO {
    /**
     * 只能读取字符，但是我们平时都是读取字符串
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {
        FileInputStream f2=new FileInputStream("E:/新建哒.txt");
        byte[]b=new byte[20];
        int i;
        while ((i=f2.read(b))!=-1){
            System.out.println(new String(b));
        }
        //输出
        OutputStream os=new FileOutputStream("E:/新建哒.txt",true);
        //开启追加

        os.write("aadada".getBytes());
       ;
        File fileReader=new File("E:/新建哒.txt");
        File fileWriter=new File("E:/ssr.txt");
        IO4 it=new IO4();
        it.query(fileReader,fileWriter);
    }
}
