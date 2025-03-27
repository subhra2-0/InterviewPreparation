package justPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.getId()-this.getId() ;
    }
}

public class PracticeJava {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(4,"Subhrajit",1200));
        emp.add(new Employee(1,"Naveen",34000));
        emp.add(new Employee(3,"Ashwin",5000));
        emp.add(new Employee(15,"Anand",7000));
        emp.add(new Employee(2,"Major",23000));

//       List<Employee> emps = emp.stream().sorted((i1,i2)->i2.getId()-i1.getId()).collect(Collectors.toList());
//        System.out.println(emps);

        Collections.sort(emp,new NameComparator());
        System.out.println(emp);


    }
}
