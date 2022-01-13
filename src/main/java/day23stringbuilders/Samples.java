package day23stringbuilders;

public class Samples {
    public static void main(String[] args) {
        String stg = "Hello world!"; //

        StringBuilder sb= new StringBuilder(stg); // we create an object from StringBuilder class
        StringBuilder stgRvs; // we declare stgRvs as variable from StringBuilder class
        stgRvs=sb.reverse(); // we use reverse() method then we assign it to stgRvs
        System.out.println(stgRvs); // we print it to the console by using sout...

        //b.StringBeffer
        StringBuffer sb1= new StringBuffer(stg);
        StringBuffer stgRvs1;

        stgRvs1=sb1.reverse();
        System.out.println(stgRvs1);


        //2.For loop

        char [] ch= stg.toCharArray();
        for(int i=ch.length-1; i>=0;i--) {
            System.out.print(ch [i]);
        }
        System.out.println(" ");

        //3.split yontemi
        String[] kelimeArr=stg.split("");

        String tersString= "";
        for (int k = kelimeArr.length-1; k >=0; k--) {
            tersString+=kelimeArr[k];

        }
        System.out.println(tersString);

        //4.

        String revStr="";

        for (int i = stg.length()-1; i >=0; i--) {
            revStr += stg.charAt(i);
        }
        System.out.println(revStr);

    }
}
