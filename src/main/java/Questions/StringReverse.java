package Questions;


import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
    // Kullanicidan bir String alarak bu Stringi terse cevirin ve yazdirin
        
        // for loop
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tesrsine cevirmek istediginiz String'i yaziniz");
        String input=scan.nextLine();
        String revStr="";
        
        for (int i = input.length()-1; i >=0; i--) { // merhaba
            revStr += input.charAt(i); //abahrem
        }
        System.out.println("Forloop ile reverse = " + revStr);
        
        // 2.yol StringBuffer ile ters cevirme
        StringBuffer strB = new StringBuffer();
        strB.append(input);
        strB=strB.reverse();
        System.out.println("StringBuffer ile reverse = " + strB);
        
        // 3.yol method olusturup array kullanalim
        scan.close();
        arrayIleTersineCevir(input);
    }
//   private static void arrayIleTersineCevir(String input) {
//        
//        String[] kelimeArr=input.split("");
//        //System.out.println(Arrays.toString(kelimeArr));
//        
//        String tersString= "";
//        for (int i = kelimeArr.length-1; i >=0; i--) {
//            tersString+=kelimeArr[i];
//        }
//        System.out.println("method ve array kullanarak cevirdigimiz : " + tersString);
       
       //NumberPalindrome2 class ta 31/40 satir arasi yok varsayilip(Uncoomand) 42- 53 arasi kullanilir
       public static String arrayIleTersineCevir(String input) {
           
           String[] kelimeArr=input.split("");
           System.out.println(Arrays.toString(kelimeArr));
           
           String tersString= "";
           for (int i = kelimeArr.length-1; i >=0; i--) {
               tersString+=kelimeArr[i];
           }
           System.out.println("method ve array kullanarak cevirdigimiz : " + tersString);
          return tersString;
          

    }
}
