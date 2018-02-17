import java.util.*;


class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    String name;
    Double score;
    Double age;
}

class SortByName implements Comparator {

    public int compare(Object ob1, Object ob2) {

        String name1 = (String) ((Student) ob1).getName();
        String name2 = (String) ((Student) ob2).getName();
        return name1.compareTo(name2);

    }
}

class sortByScore implements Comparator{
    public int compare(Object ob1, Object ob2) {

        double score1 = (double) ((Student) ob1).getScore();
        double score2 = (double) ((Student) ob2).getScore();
        if (score1 > score2) {

            return 1;
        }
        else if(score2 > score1){
            return -1;
        }
        else
            return 0;

    }
}

public class Question5 {
    public static void main(String[] args) {

        Student object1=new Student();
        object1.setAge(15.0);
        object1.setName("chunky");
        object1.setScore(564.3);
        Student object2=new Student();
        object2.setAge(15.0);
        object2.setName("prachi");
        object2.setScore(564.3);
        Student object3=new Student();
        object3.setAge(15.5);
        object3.setName("sahil");
        object3.setScore(6568.3);
        Student object4=new Student();
        object4.setAge(15.5);
        object4.setName("name");
        object4.setScore(153.5);
        Student object5=new Student();
        object5.setAge(15.5);
        object5.setName("chunks");
        object5.setScore(564.3);

        ArrayList list = new ArrayList();
        list.add(object5);
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        Collections.sort(list,new SortByName());
        Collections.sort(list,new sortByScore());
        ListIterator itr = list.listIterator();
        while (itr.hasNext()) {
            Student obj = (Student) itr.next();
            System.out.print(obj.getName()+"    ");
            System.out.print(obj.getAge()+"   ");
            System.out.println(obj.getScore());
        }



    }
}
