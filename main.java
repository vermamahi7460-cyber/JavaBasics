class student{
    string name;
    int age;

    Student(string n,int a){
        name=n;
        age = a;
    }
    void display(){
        System.out.println("Name:"+name+" Age:"+age);
    }
}
public class Main{
    public static void main(String[] args) {
        student s1 = new student("Mansi",20);
        s1.display();
    }
}
