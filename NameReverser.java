import java.util.Scanner;

class NameArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Name stored:");
        System.out.println(name); // Print original name

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println("Name in reverse:");
        System.out.println(reversed);
    }
}
