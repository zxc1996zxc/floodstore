package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by zxc1996zxc on 2019-06-03.
 */
public class IO3 {
    public static void fileCopy(String src,String dest){
        try( FileInputStream fis=new FileInputStream(src);
             FileOutputStream fos=new FileOutputStream(dest);) {
           byte[] b=new byte[10];
            int len;
            while ((len=fis.read(b))!=-1){
                fos.write(b,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
