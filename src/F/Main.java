package F;

public class Main {
    public static void main(String[] args) {
/*        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my,"窗口1");
        Thread t2 = new Thread(my,"窗口2");
        Thread t3 = new Thread(my,"窗口3");
        t1.start();
        t2.start();
        t3.start();*/
/*        Student s = new Student();
        Set st = new Set(s);
        Get gt = new Get(s);
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(gt);
        t1.start();
        t2.start();*/
        Thread1 t1 = new Thread1();
        Thread tt1 = new Thread(t1,"111");
        Thread tt2 = new Thread(t1,"222");
        Thread tt3 = new Thread(t1,"333");
        tt1.start();
        tt2.start();
        tt3.start();
    }

}
