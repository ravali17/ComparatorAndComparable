import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee> {
    String name;
    int id;
    int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
       public static void main(String[] args) {
           List<Employee> emplist=new ArrayList<>();
           Employee emp=new Employee();
           emp.id=1;
           emp.age=20;
           emp.name="tina";
           emplist.add(emp);
           Employee emp1=new Employee();
           emp1.id=2;
           emp1.age=25;
           emp1.name="ravi";
           emplist.add(emp1);
           Employee emp2=new Employee();
           emp2.id=3;
           emp2.age=26;
           emp2.name="ammu";
           emplist.add(emp2);
           Collections.sort(emplist,emp);
           System.out.println(emplist);



       }

    }
