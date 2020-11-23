package F;

public class Thread1 implements Runnable{
    int[] n = {1,2,3,4,5,6,7,8,9};
    int i = 0;
    @Override
    public void run() {
        while(i<n.length)
        synchronized (n){
            System.out.println(Thread.currentThread().getName()+n[i++]);
            n.notify();
                try {
                    n.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
