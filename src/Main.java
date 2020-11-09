import java.util.*;

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
/*        HashSet<Integer> h = new HashSet();
        while (true){
            int x = (int)(Math.random()*19+1);
            System.out.print(x+" ");
            if(!h.contains(x)) h.add(x);
            if(h.size()==10) break;
        }
        for(int a:h){
            System.out.println(a);
        }*/
        /*玩扑克*/
        HashMap<Integer,String> map = new HashMap<>();
        List<Integer> poker = new ArrayList<>();
        String[] hs = {"♠","♣","♥","◇"};
        String[] dx = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=1;
        for(String s1:dx){
            for(String s2:hs){
                String p = s1.concat(s2);
                poker.add(index);
                map.put(index++,p);
            }
        }
        poker.add(index);
        map.put(index++,"大王");
        poker.add(index);
        map.put(index,"小王");
        Collections.shuffle(poker);
        TreeSet<Integer> s1 =new TreeSet<>();
        TreeSet<Integer> s2 =new TreeSet<>();
        TreeSet<Integer> s3 =new TreeSet<>();
        TreeSet<Integer> s4 =new TreeSet<>();
        int i=0;
        while(i<poker.size()){
            if(i<3*17){
                s1.add(poker.get(i++));
                s2.add(poker.get(i++));
                s3.add(poker.get(i++));
            }else{
                s4.add(poker.get(i++));
            }
        }
        Main.show("s1",s1,map);
        Main.show("s2",s2,map);
        Main.show("s3",s3,map);
        Main.show("底牌",s4,map);
    }
    public static void show(String name,TreeSet<Integer> t,HashMap<Integer,String> m){
        System.out.println(name+"：");
        for(Integer i:t){
            System.out.print(m.get(i)+" ");
        }
        System.out.println();
    }
}
