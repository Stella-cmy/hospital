package F;

public class Set implements Runnable{
    Student s;
    private int x = 0;
    public Set(Student s1){
        s = s1;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (s){
                if (s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    s.flag = true;
                    s.notify();
                    s.setName("ycm");
                    s.setAge(x++);
            }

        }

    }
}
