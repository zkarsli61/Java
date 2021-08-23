package day27_JavaPractice;

import java.util.Random;

public class $_7_11 {
    //1. Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
    static int sumOfNumbers(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++)
            sum += i;
        return sum;
    }

    //2. Write method that accepts a String and removes all duplicate from String. EX : aaabbc --> abc
    static String removeDuplicates(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);
            if(!result.contains(eachLetter + ""))
                result += eachLetter;
        }
        return result;
    }

    //4. Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj
    static String isReverse(String str){
        String reversedString = "";
        for(int i = str.length() - 1; i >= 0; i--)
            reversedString += str.charAt(i);
        return reversedString;
    }

    //5. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    static boolean isPalindrome(String str){
        //1st Logic:
//        for(int i = 0, j = 1; i < str.length()/2; i++, j++){
//            if(str.charAt(i) != str.charAt(str.length() - j))
//                return false;
//        }
//        return true;

        //2nd Logic:
        String reversed = isReverse(str);
        return reversed.equals(str);
    }

    //3. Write method that accepts a String and extracts letters and numbers. Method should return a String. EX: a1b2c3 --> Letters are abc and numbers are 123.
    static String extracter(String str){

        String letters, numbers;
        letters = numbers = "";

        for(int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);
            if(Character.isLetter(eachLetter))
                letters += eachLetter;
            if(Character.isDigit(eachLetter))
                numbers += eachLetter;
        }
        return "Letters are " + letters + " Numbers are " + numbers;
    }
    //8. Write a method that generates an single dimensional Array that consists of x numbers random numbers between 1 and 100. Method will accept int x as an argument.
    static int[] arrayGenerater(int num){
        int[] myArray = new int[num];
        for(int i = 0; i < myArray.length; i++)
            myArray[i] = new Random().nextInt(100);
        return myArray;
    }


    public static void main(String[] codingInJavaIsFun) {
        //Lesson05_1_for_Loop.timer(4);
        //System.out.println(sumOfNumbers(5));
        //System.out.println(removeDuplicates("racecar"));
        //System.out.println(isReverse("racecar"));
        //System.out.println(isPalindrome("madam"));
        //System.out.println(extracter("a1b2c3d4f5"));
        //System.out.println(Arrays.toString(arrayGenerater(10)));



    }
}
