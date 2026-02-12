class Student {
    String name;
    int age;

    Student(String n, int a) { // Student() .... for default contructor
        name = n; // name = "Vedant";
        age = a; // age = 19;

    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

public class abc {
    public static void main(String[] args) {
        Student student1 = new Student("Vedant", 19); // Student student1 = new Student();
        student1.display();
    }
}