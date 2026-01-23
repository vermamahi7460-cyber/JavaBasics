class StaticStudent {

    int rollNo;
    String name;
    static String collegeName = "symbiosis instute of technology";

    StaticStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("College : " + collegeName);
    }

    public static void main(String[] args) {
        StaticStudent s1 = new StaticStudent(101, "Mahi");
        s1.display();
    }
}

