class Parent {
    void showParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent();  // inherited method
        obj.showChild();
    }
}

