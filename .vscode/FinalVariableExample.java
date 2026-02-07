public class FinalVariableExample {
    final int MAX_VALUE = 100;

    void display() {
        System.out.println("The maximum value is: " + MAX_VALUE);
    }
    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.display();
    }
}
