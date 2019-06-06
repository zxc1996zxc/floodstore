package com.test;

/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class SaveRunable implements  Runnable {
    Account account;
   public  SaveRunable(Account account){
       this.account=account;
   }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0;i<12;i++){
                account.save();
        }
    }
}
