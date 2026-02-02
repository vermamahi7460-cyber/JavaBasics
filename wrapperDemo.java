public class wrapperDemo {
    public static void main(String[] args) {
       int i=3;
       double d= 2.4;   
       System.out.println("Interger i:"+i);
       System.out.println("Double d:"+d);
       Interger i1= Integer.valueOf(i); //boxing
       Double d1= Double.valueOf(d);    //boxing
       System.out.println("Interger i1:"+i1);
       System.out.println("Double d1:"+d1); 
       string str1= "123";
         String str2= "123";
         system.out.println("Answer is:"+(str1+str2)); //123123
         int s1= Integer.parseInt(str1); //unboxing
         int s2= Integer.parseInt(str2); //unboxing
         system.out.println("Answer is:"+(s1+s2)); //246
    }
}
