package F;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{

    public int n = 200;
    private Lock lock = new ReentrantLock();
    Object obj = new Object();
    public void run() {
        while(true){
            /*synchronized (obj) {
                if(n>0) {
                    System.out.println(Thread.currentThread().getName() + "售出" + n);
                    n--;
                }
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
            lock.lock();
            if(n>0) {
                System.out.println(Thread.currentThread().getName() + "售出" + n);
                n--;
            }
            lock.unlock();
        }

    }
}
