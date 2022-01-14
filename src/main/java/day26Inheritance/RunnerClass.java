package day26Inheritance;

public class RunnerClass extends C {
    public static void main(String[] args) {
        //C obj1 = new C(); // 'C' is abstract; cannot be instantiated
        C obj = new RunnerClass();
        obj.m();
    }
}
