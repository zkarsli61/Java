package Questions;

public class PalindromeOption2 {

    public static void main(String[] args) {
        int r = 0;
        int temp = 0;
        int total = 0;
        int given = 1441;   //burdaki numarayi degistirip rUn yapinca palin.olup olmadigini consolde goruyoruz
        temp = given;       //Palindrome...tersi cevrildiginde de ayni olan sayi(Int) ya da yazi(String)
        while (given!=0){
            r = given%10;
            total = (total*10) + r;
            given = given/10;
        }
        if (temp == total){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
