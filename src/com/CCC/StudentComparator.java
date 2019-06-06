package com.CCC;

import java.util.Comparator;

/**
 * Created by zxc1996zxc on 2019-05-31.
 */
public class StudentComparator implements Comparable{
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentComparator(Integer age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public int compareTo(Object o) {
        StudentComparator s1=(StudentComparator) o;

       if(this.age> s1.getAge()){
           return 1;
       }else if (this.age<s1.getAge()){
           return  -1;
       }
        return  0;
    }
}
