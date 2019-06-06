package com.CCC;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by zxc1996zxc on 2019-05-31.
 */
public class Sega {
    public static void main(String[] args){
        HashSet hashSet=new HashSet();
        TreeSet treeSet=new TreeSet();

        Student s=new Student(500,"世界");
        Student t=new Student(500,"世界");
        hashSet.add(s);
        hashSet.add(t);

        System.out.println(hashSet.size());
        StudentComparator s1=new StudentComparator(500,"500");
        StudentComparator s2=new StudentComparator(600,"500");
        StudentComparator s4=new StudentComparator(500,"500");
        StudentComparator s5=new StudentComparator(700,"500");
        StudentComparator s6=new StudentComparator(500,"500");
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println(treeSet.toString());

    }
}
