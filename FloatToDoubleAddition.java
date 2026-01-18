public class FloatToDoubleAddition {

    static double add(float x, float y) {
        return (double) x + (double) y;
    }

    public static void main(String[] args) {
        float a = 5.5f;
        float b = 4.5f;

        double sum = add(a, b);
        System.out.println("Sum: " + sum);
    }
}

