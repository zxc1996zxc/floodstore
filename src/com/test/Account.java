package com.test;

/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class Account {
    private Integer money;
    private Integer take;
    private Integer put;

    public Account(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getTake() {
        return take;
    }

    public void setTake(Integer take) {
        this.take = take;
    }

    public Integer getPut() {
        return put;
    }

    public void setPut(Integer put) {
        this.put = put;
    }
    //2个动作（需要监听器）
   synchronized   public  void save(){
       //有钱时候不用存，让线程等待
       this.money+=1000;

        System.out.println("存钱后现有余额"+money);
       //唤醒
       this.notify();
    }
   synchronized public  void take() throws  InterruptedException{
       //没钱让线程等待
       if(money<1000){
           throw new MyException("===》余额不足");
        //   this.wait();
         //  System.out.println("余额不足请充值");
       }
   if(money>=1000){
       money-=1000;
       System.out.println("取钱后现有余额"+money);
   }

       //唤醒
          this.notify();
    }
}
