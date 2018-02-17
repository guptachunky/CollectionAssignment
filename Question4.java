import java.util.*;

class Employee {
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    double age;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;


}


class MyComparator implements Comparator {

    public int compare(Object ob1, Object ob2) {

        Double sal1 = (Double) ((Employee) ob1).getSalary();
        Double sal2 = (Double) ((Employee) ob2).getSalary();

        if (sal1 < sal2) {

            return 1;
        }
        else if(sal2 < sal1){
            return -1;
        }
        else
            return 0;
    }
}


public class Question4 {

    public static void main(String[] args) {
        Employee object = new Employee();
        object.setAge(15);
        object.setName("name1");
        object.setSalary(15203.22);
        Employee object1 = new Employee();
        object1.setAge(15);
        object1.setName("name2");
        object1.setSalary(26203.22);
        Employee object2 = new Employee();
        object2.setAge(15);
        object2.setName("name3");
        object2.setSalary(1503.22);
        Employee object3 = new Employee();
        object3.setAge(15);
        object3.setName("name4");
        object3.setSalary(19503.22);
        Employee object4 = new Employee();
        object4.setAge(15);
        object4.setName("name5");
        object4.setSalary(15653.22);


        TreeSet list = new TreeSet(new MyComparator());
        list.add(object);
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

//        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Employee obj = (Employee) itr.next();
            System.out.print(obj.getName()+"    ");
            System.out.print(obj.getAge()+"   ");
            System.out.println(obj.getSalary());
        }
    }
}
