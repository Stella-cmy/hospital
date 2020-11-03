import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*Student a = new Student("b",111);
        Student b = new Student("c",222);
        Student c = new Student("a",333);
        TreeSet<Student> t = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o1.name.compareTo(o2.name);
                return num1==0?o1.age-o2.age:num1;
            }
        });
        t.add(a);
        t.add(b);
        t.add(c);
        for(Student s:t){
            System.out.println(s);
        }*/
        HashSet<Integer> h = new HashSet();
        while (true){
            int x = (int)(Math.random()*19+1);
            System.out.print(x+" ");
            if(!h.contains(x)) h.add(x);
            if(h.size()==10) break;
        }
        for(int a:h){
            System.out.println(a);
        }
    }
}
