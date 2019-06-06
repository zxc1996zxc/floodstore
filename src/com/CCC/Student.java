package com.CCC;

/**
 * Created by zxc1996zxc on 2019-05-31.
 */
public class Student {
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if (obj==null)
            return false;
        if (getClass()!=obj.getClass())
            return false;

        return super.equals(obj);
    }
}
