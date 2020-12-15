package penzastreet.com.task_2.part_6_1;

public class Person {
    protected String name;
    protected int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("(%s, %s)", this.name, this.age);
    }

    public String work() {
        return "None";
    }
}

class Employee extends Person {
    String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String toString() {
        return String.format("(%s, %s, %s)", this.name, this.age, this.company);
    }

    public String work() {
        return "Manager";
    }
}
