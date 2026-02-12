import java.util.Scanner;

class Student {
    String name;
    double PRN;

    void putStudent(String n, double p) {
        name = n;
        PRN = p;
    }
}

class Course {
    String c_name;
    int marks;

    void putCourse(String c, int m) {
        c_name = c;
        marks = m;
    }
}

class College {
    String clg_name;
    String location;

    void putCollege(String clg, String loc) {
        clg_name = clg;
        location = loc;
    }
}

public class Details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Course c1 = new Course();
        College clg1 = new College();

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student PRN: ");
        double PRN = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Course Name: ");
        String c_name = sc.nextLine();
        System.out.println("Enter Marks (out of 100): ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter College Name: ");
        String clg_name = sc.nextLine();
        System.out.println("Enter College Location: ");
        String location = sc.nextLine();

        s1.putStudent(name, PRN);
        c1.putCourse(c_name, marks);
        clg1.putCollege(clg_name, location);

        System.out.println("\nStudent Details are as follows:");
        System.out.println("College name : " + clg1.clg_name + ",\t Location : " + clg1.location);
        System.out.println("Student Name : " + s1.name + ",\t PRN : " + s1.PRN);
        System.out.println("Course Name : " + c1.c_name + ",\t Marks : " + c1.marks);
        sc.close();
    }
}