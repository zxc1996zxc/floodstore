package com.test01;

/**
 * Created by zxc1996zxc on 2019-05-30.
 */
public class Ary {
    private Integer []data;
    private  Integer size=0;
    //初始化
    public Ary(Integer length){
        data =new  Integer[length];
    }
    //增加
    public void add(Integer i){
        if(size==data.length){
            Integer []new1=new Integer[data.length*2];
            System.arraycopy(data,0,new1,0,size);
            //把新数组赋值给老数组
            data=new1;
        }
        data[size]=i;
        size++;
    }
    public Object getIndex(int index){
        if(index<0||index>size){
            throw  new ArrayIndexOutOfBoundsException("越界");
        }
        return  data[index];
    }
    public void  delete(int index){
        Integer C=data[index];
        System.out.println("删除了"+C);
        System.arraycopy(data,index+1,data,index,size-index-1);
        size--;

    }
}
