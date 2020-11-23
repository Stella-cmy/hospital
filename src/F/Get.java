package F;

public class Get implements Runnable{
    Student s = new Student();
    public Get(Student s1){
        s = s1;
    }
    @Override
    public void run() {
        while(true){
            synchronized (s){
                if(s.flag){
                    System.out.println(s.toString());
                    s.flag = false;
                    s.notify();
                }
                else {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        }

    }
}