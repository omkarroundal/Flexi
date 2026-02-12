//write a program in java using parameterised constructor to print name ,roll no, and prn of user using scanner sc.

import java.util.Scanner;
class Student {
    String name;
    long prn;

    Student(String n, long p) {
        name = n;
        prn = p;
    }
    void display(){
        System.out.println("Name : "+ name);
        System.out.println("PRN : "+ prn);
    }
    
}
public class constPara {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter PRN :");
        long prn = sc.nextLong();
        Student s1 = new Student(name, prn);
        s1.display();
        sc.close();
    }
}