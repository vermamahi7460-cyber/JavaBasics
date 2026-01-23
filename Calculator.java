import java.util.Scanner;

class Calculator {

    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;
            case 4:
                System.out.println("Division = " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        Calculator c = new Calculator(n1, n2);
        c.calculate(ch);
    }
}

