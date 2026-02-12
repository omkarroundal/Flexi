class Student {
    String name;
    int age;

    void putData(String n, int a) {
        name = n;
        age = a;
    }

    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class InstanceMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.putData("Vedant", 19);
        s1.showData();
    }
}