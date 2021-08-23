package day26;

public class B extends C{
    public B(){
        this.x="B12";
    }
    public B(String x){
        super.x =x;
    }
    public void m() {System.out.println("B: m()");}
    public void m1() {System.out.println("B:m1()");}

}
