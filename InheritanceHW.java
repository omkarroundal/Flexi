class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Parent class constructor");
    }

    void show() {
        System.out.println("This is Parent class method");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Child class constructor");
    }

    void display() {
        System.out.println("Child class name: " + this.name);
        System.out.println("Parent class name: " + super.name);
        this.show();
        super.show();
    }
}

public class InheritanceHW {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}