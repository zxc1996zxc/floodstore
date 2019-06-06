public class Main {

    public static void main(String[] args) {
        Thread gameThread = new GameThread("舰长");
        Thread gameThread1=new GameThread("caption");
        MusicThread mus=new MusicThread();
        gameThread.start();
        gameThread1.start();
        //获取名字
        String name = gameThread.getName();
        String name1=gameThread1.getName();
        System.out.println(name);
        System.out.println(name1);
        mus.start();
        //方法2
        GameRunable gr=new GameRunable();
        MusicRunable mr=new MusicRunable();
       Thread tr1=new Thread(gr,"saber");

        Thread tr2=new Thread(mr);
        tr1.start();
        tr2.start();
    }
}
