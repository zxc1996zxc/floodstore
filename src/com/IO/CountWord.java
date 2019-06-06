package com.IO;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */

public class CountWord {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File src = new File("E:/CCF.txt");
        File target = new File("E:/ssr.txt");
        query(src,target);
    }
    /**
     定义一个方法query用于统计一个文件中单词个数，把统计的结果保存到一个新的文件中，统计结果文件格式如下:
     Java = 10;
     Public = 5;
     Hello = 3;

     1.定义方法
     1.1 方法参数
     1.1.1 参数1，源文件File
     1.1.2 参数2，目标文件，把结果要保存到这个文件中
     2.完成方法功能
     2.1  使用BufferedReader 去读取
     2.2 使用Map 存放统计的结果
     2.3 循环遍历Map数据 ，让后字符串拼接放到文件中（BufferWriter）
     * @throws IOException

     */
    public static void query(File src,File target) throws IOException {
        //使用BufferedReader 去读取
		/*
		 BufferedReader(Reader r) 构造方法参数要去绑定一个 源文件src
		 参数r:使用FileReader
		 */
        BufferedReader br = new BufferedReader(new FileReader(src));

        //读取数据
        String s;
        //用来统计 单词的  Map
        Map<String,Integer> data = new HashMap<>();
        while( ( s = br.readLine()) != null ){

            //使用每一行数据
			/*
			  1.定义一个正则表达式
			    1.1 匹配字母的正则 [A-Za-z]
			    1.2 非字母作为一个拆分条件，正则  [^A-Za-z]
			  2.利用String里面的方法 split 把数据拆分出来
			  3.遍历 拆分出来数据，保存到 Map 里面
			 */
            String regex = "[^A-Za-z]";
            String[] strs = s.split(regex);
            for (String word : strs) {
                // 判断如果word是空字符串，跳过
                if (word.equals("")) {
                    continue;// 结束本次循环，继续下次循环
                }
				/*
				 * 1.判断 单词 在map里面存在否 1.1 存在 ，值取出来加1 1.2 不存在，放进去初始值1
				 */
                if (data.containsKey(word)) {
                    Integer val = data.get(word);
                    data.put(word, val + 1);// 加1
                } else {
                    data.put(word, 1);// 第一次初始值1
                }
            }
        }
        System.out.println(data);
        //data.remove("");
        //关闭流
        br.close();

		/*
		  写入
		 */
        BufferedWriter bw = new BufferedWriter(new FileWriter(target));
        //遍历Map Map<String,Integer> data = new HashMap<>();
        for (Iterator<String> iterator = data.keySet().iterator(); iterator.hasNext();) {
            String key =  iterator.next();
            Integer value = data.get(key);
            //拼接字符串 ,例如 Java = 10;
            String str = key+"="+value+";";
            bw.write(str);//写数据
            bw.newLine();//换行
        }

        bw.close();//关闭流
    }

}