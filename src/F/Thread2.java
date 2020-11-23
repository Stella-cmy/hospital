package F;

public class Thread2 implements Runnable{
    int[] n;
    int i;

    public Thread2(int[] n, int i) {
        this.n = n;
        this.i = i;
    }

    @Override
    public void run() {
        synchronized (n){
            while(i<n.length) {
                if (i % 2 == 1) {
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+n[i]);
                n.notify();
                i++;
            }
        }
    }
}

