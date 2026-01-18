public class StringReversePredefined {
    public static void main(String[] args) {
        String name = "Mansi";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversed);
    }
}

