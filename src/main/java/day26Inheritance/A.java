package day26Inheritance;

public class A extends B{

   public static void main(String[] args) {
       B b=new B();
       b.m();
       System.out.println(b.x);
       C c=new B();
       c.m();
       System.out.println(c.x);
       C d=new A();
       d.x="A11";
//       d.m1();
       System.out.println(d.x);
    }
}
