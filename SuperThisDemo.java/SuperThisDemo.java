// Parent class
class Parent {
    int number = 10;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("Parent class show() method");
    }
}

// Child class
class Child extends Parent {
    int number = 20;

    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println("Child number using this: " + this.number);
        System.out.println("Parent number using super: " + super.number);

        this.showChild();
        super.show();
    }

    void showChild() {
        System.out.println("Child class showChild() method");
    }
}

// Main class
public class SuperThisDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
public class SuperThisDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}