class InstanceMethodDemo {

    void show() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {
        InstanceMethodDemo obj = new InstanceMethodDemo();
        obj.show();
    }
}

