package com.test;

/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class GetRunable implements Runnable {
    Account account;
    public GetRunable(Account account){
        this.account=account;
    }
    @Override
    public void run() {
        for (int i=0;i<12;i++){
            try {
                account.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //====
    }
}
