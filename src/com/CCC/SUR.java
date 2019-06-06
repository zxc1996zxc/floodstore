package com.CCC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by zxc1996zxc on 2019-05-31.
 */
public class SUR {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList();
        arrayList.add("saber");
        arrayList.add("launcher");
        arrayList.add("ESU");
        arrayList.add("6555");
        //双向迭代
        ListIterator it=arrayList.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //从后向前
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
