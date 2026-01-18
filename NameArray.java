import java.util.Scanner;

class NameArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Convert string to character array
        char[] arr = name.toCharArray();

        System.out.println("Name stored in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println(); // move to new line

        // Reverse the array
        System.out.println("Name in reverse:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
