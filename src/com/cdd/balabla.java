package com.cdd;

import java.security.KeyStore;
import java.util.*;

/**
 * Created by zxc1996zxc on 2019-06-01.
 */
public class balabla {
    public static void main(String[] args){
        Map st=new HashMap();
        st.put("第五军","sega");
        st.put("李云龙","独立团");
        st.put("丁伟","新一团");
        //遍历方式一；
        Set keys=st.keySet();
        for (Object object: keys){
            System.out.println(st.get(object));
        }
        //遍历方式2
        Set entrys=st.entrySet();
        for (Object o:entrys){
            Map.Entry entry=(Map.Entry)o;
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        //统计字符串
        String str="aaabbcdsdadwda";
        Map m=new HashMap();
        for (int i=0;i<str.length();i++){
            char ele=str.charAt(i);
            if(m.containsKey(ele)){
                Object o=m.get(ele);
                Integer c=(Integer)o+1;
                m.put(ele,c);
            }else {
                m.put(ele,1);
            }

        }
        System.out.println(m);
        //排序找数值
        Collection val=m.values();
        Integer max=0;
        for (Object object:val){
            Integer i=(Integer)object;
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);
        Object ma= Collections.max(val);
        System.out.println(ma);
    }
}
