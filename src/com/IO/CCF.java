package com.IO;

import java.io.File;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */
public class CCF {
    public static void main(String[] args) throws Exception{
        File fileReader=new File("E:/CCF");
        File fileWriter=new File("E:/ssr");
        IO4 it=new IO4();
        it.query(fileReader,fileWriter);
    }
}
