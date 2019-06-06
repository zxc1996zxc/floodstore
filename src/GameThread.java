/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class GameThread extends Thread {
    static int num =50;
    public GameThread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("敲里吗");
        System.out.println("敲里吗");
        System.out.println("敲里吗");
        System.out.println("敲里吗");
        System.out.println("敲里吗");
        System.out.println("敲里吗");
    }
}
