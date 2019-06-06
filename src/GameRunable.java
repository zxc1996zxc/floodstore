/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class GameRunable implements Runnable{
    int num =50;

    @Override
    public void run() {
     while (num>0){
         System.out.println(Thread.currentThread().getName());
         num--;
     }
        System.out.println("skr");
    }
}
