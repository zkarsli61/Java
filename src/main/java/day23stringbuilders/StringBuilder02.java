package day23stringbuilders;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        // how to compare
        // equals method use == so
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.indexOf("1"));

        sb1.insert(3,"zafer");

        System.out.println(sb1);


        sb1.insert(1,"CCTYEWCC",2,5) ;

        System.out.println(sb1);
        System.out.println(sb1.reverse());
        System.out.println(sb1.replace(0,3,""));
        sb1.setCharAt(0,'9');
        System.out.println(sb1);

        sb1.trimToSize();
    }
}
