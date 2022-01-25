package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumberPalindrome1 {
    //Write Java code to identify a number as Palindrome
    //Example; 1233 --> 3321 is not a Palindrome
    //Example; 787 --> 787 is a Palindrome
    public static void main(String[] args) {
        try {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a Number;" );
        int inputValue = Integer.parseInt(obj.readLine());
        int n = inputValue;
        int reverse = 0;
            System.out.println(" User Entered; " + inputValue);
            for (int i = 0 ; i<=inputValue ; i++ ){
                int r = inputValue%10;
                inputValue = inputValue/10;
                reverse = reverse*10 + r;
                i=0;
            }
            if (n == reverse){
                System.out.println(" You Entered a Palindrome Number");
            }else {
                System.out.println("Given Number is not a Palindrome Number");
            }
        } catch (IOException e) {
            System.out.println("Out of Range.");
        }
    }
}