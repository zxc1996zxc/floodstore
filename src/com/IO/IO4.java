package com.IO;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */
public class IO4 {
    public void query(File src, File target) throws Exception {
        //需要转换下
        FileReader cc = new FileReader(src);
        BufferedReader br = new BufferedReader(cc);
        //每行遍历进行统计
        String s ;
        Map<String, Integer> data = new HashMap<>();
        while ((s = br.readLine())  != null) {
            //正则表达式
            String regex = "[^A-Za-z]";
            String[] split = s.split(regex);
            for (String string : split) {
                //利用Map操作
                if (data.containsKey(string)) {
                    Integer value = data.get(string);
                    data.put(string, value + 1);
                } else {
                    //初始化
                    data.put(string, 1);
                }
            }
            System.out.println(data);
        }
        br.close();
        //赋值到新文件
        FileWriter fw = new FileWriter(target);
        BufferedWriter bw = new BufferedWriter(fw);
        //迭代器
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            System.out.println("key= " + entry.getKey() + " and value= "
                    + entry.getValue());
            String str = entry.getKey() + "=" + entry.getValue();
            //写入
            bw.write(str);
            bw.newLine();
        }


     /*   for (Iterator<String> iterator=data.keySet().iterator();iterator.hasNext();){
            String key=iterator.next();
            Integer value=data.get(key);
            String str=key+"="+value;

        }*/
        bw.close();//关闭
    }
}
