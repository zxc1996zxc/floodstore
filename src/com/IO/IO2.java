package com.IO;

import java.io.*;
import java.util.Collection;
import java.util.Map;

/**
 * Created by zxc1996zxc on 2019-06-02.
 */
public class IO2 {
    /**
     * 只能读取字符，但是我们平时都是读取字符串
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       FileInputStream fis=new FileInputStream("E:/新建哒.txt");
        change(fis);

    }
    public static void change(InputStream i) throws IOException {
        InputStreamReader isr=new InputStreamReader(i);
        char[]c=new char[10];
        int length;
        String all="";
        StringBuffer allB=new StringBuffer();
        while ((length=isr.read(c))!=-1){
            String s = new String(c, 0, length);
            System.out.println("s="+s);
            all+=s;
            System.out.println(all);
            allB.append(s);
            System.out.println("=="+allB);

        }
        isr.close();
        i.close();
    }
}
