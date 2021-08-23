package day23stringbuilders;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        sb1.trimToSize();

        System.out.println(sb1.capacity());
        sb1.substring(2);

        System.out.println(sb1);
//        System.out.println(sb1.toString().equals(sb2.toString()));

 //       System.out.println(sb1.compareTo(sb2));
    }
}
