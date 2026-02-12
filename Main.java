class Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division = " + ((double) a / b));
    }
}

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;

        Calculator obj = new Calculator();

        obj.add(a, b);
        obj.sub(a, b);
        obj.mult(a, b);
        obj.div(a, b);
    }
}