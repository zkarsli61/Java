package day23stringbuilders;

public class StringBuilder01 {
    public static void main(String[] args) {
//How to create a string by using "StringBuilder" class
    // 1.  way
    StringBuilder sb = new StringBuilder();
        sb.append("zafer");
        sb.append(" is a friend of Veli");
        System.out.println(sb); // empty string
        // 2.  way
        StringBuilder sb1 = new StringBuilder("Veli is my friend");
    System.out.println(sb1);
        // 3.  way we need to be sure with the length of the string
        StringBuilder sb2 = new StringBuilder(5);
        sb2.append("zafer1111");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        // in chain
        StringBuilder sb3 = new StringBuilder("Java");
        sb3.append('a').append('b').append('c');
        System.out.println(sb3);
        // Charsquence s, int start, int end exclusive
        sb3.append("ahmet",1,3);
        System.out.println(sb3);
        // the index of the desired char value
        System.out.println(sb3.charAt(5));
        //how to delete
        sb3.delete(4,7);
        sb3.deleteCharAt(3);
        System.out.println(sb3);
    }
}
