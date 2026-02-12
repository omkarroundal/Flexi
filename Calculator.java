
import java.util.Scanner;

//Calculator using Parameterized Constructor and User Choice
class calc {
    int a, b;

    calc(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Addition : " + (a + b));
                break;
            case 2:
                System.out.println("Substration : " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication : " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Division : " + (a / b));
                else
                    System.out.println("Denominator cannot be zero for division.");
                break;
            case 5:
                System.out.println("Exiting....");
                break;
            default:
                System.out.println("Invalid choice!");
                break;

        }
    }
}

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        int choice;
        calc c = new calc(n1, n2);
        do {
            System.out.println("Enter Choice : ");
            System.out.println("1. Addition");
            System.out.println("2. Substration");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            c.calculate(choice);
        } while (choice != 5);

        sc.close();
    }
}