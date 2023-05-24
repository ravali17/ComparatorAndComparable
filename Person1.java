import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person1 implements Comparable<Person1> {
    String name;
    int id;
    int age;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person1 o) {
       return this.id - o.id;
    //  return this.name.compareTo(name);
    }

    public static void main(String[] args) {
        List<Person1>person1List=new ArrayList<>();
        Person1 pp=new Person1();
        pp.id=6;
        pp.age=40;
        pp.name="siri";
        person1List.add(pp);
        Person1 pp1=new Person1();
        pp1.id=2;
        pp1.age=20;
        pp1.name="andy";
        person1List.add(pp1);
        Person1 pp2=new Person1();
        pp2.id=1;
        pp2.age=54;
        pp2.name="vinnu";
        person1List.add(pp2);
        Collections.sort(person1List);
        System.out.println(person1List);
    }

}
