final class FinalDemo {          // final class
    final int MAX = 100;         // final variable

    final void display() {       // final method
        System.out.println("Final variable value: " + MAX);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}

