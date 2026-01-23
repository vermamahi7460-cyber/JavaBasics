class student{
    string name;
    int age;

    Student()
{
    name="Default Name";
    age = 18;
}
void display(){
    System.out.println("Name:"+name+" Age:"+age);

}
}
public class Student {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}