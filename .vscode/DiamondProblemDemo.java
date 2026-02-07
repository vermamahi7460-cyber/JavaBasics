interface A {
    void show();
}

interface B {
    void show();
}

class DiamondProblemDemo implements A, B {

    public void show() {
        System.out.println("Diamond problem solved using Interface");
    }

    public static void main(String[] args) {
        DiamondProblemDemo obj = new DiamondProblemDemo();
        obj.show();
    }
}
