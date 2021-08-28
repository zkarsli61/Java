package day19Loop;

public class Lesson04_Instance_Control_Flow extends Baba {
    int i  = 100;
    {
        m2();
        System.out.println("Child First instance block");
    }
    Lesson04_Instance_Control_Flow(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        Lesson04_Instance_Control_Flow t = new Lesson04_Instance_Control_Flow();
        //if this object creation was not here then the output would be only "Child main"
        System.out.println("Child main");

        //now If I add another object here. then it will repeat the instance control flow
        //Lesson04_Instance_Control_Flow tt = new Lesson04_Instance_Control_Flow();
    }
    public void m2() {
        System.out.println(y);
    }
    {
        System.out.println("Child Second instance block");
    }
    int y = 20;
}