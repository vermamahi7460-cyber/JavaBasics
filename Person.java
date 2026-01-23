public class Person {
    string name;

    void display(){
        System.out.println("Name:"+name);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.display();
    }
}
