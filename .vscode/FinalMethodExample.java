class parent{
    final void display(){
        System.out.println("This is a final method in parent class");
    }   
}
 class child extends parent{
    //void display(){  // This will cause a compile-time error
      //  System.out.println("Trying to override final method");
   // }
}   
public class FinalMethodExample {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
    
}
