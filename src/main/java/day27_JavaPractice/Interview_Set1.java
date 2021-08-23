package day27_JavaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interview_Set1 {
    /*
    1. Write a method that swap two variables' values without using temp variable.
    2. Write a method that checks to see if the words u pass is Anagram.
    3. Write a method that reverses a sentence.
    4. Write a method that sorts an Array int[] without using the sort method.
    5. Write a method that returns how many times each letter is repeated?
    6. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    7. Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
    8. Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
    9. Write a method that checks if the passing argument is a prime number.
    10.Write a method that finds remainder of 2 numbers without using the % operator?
    */
    public static void main(String[] args) {
        //swappingNumbers1(5,10);
        System.out.println(isAnagram2("wha ztup","zup what"));
        //System.out.println(isReversed3("I love you"));
        //sortArrayWithoutUsingSortMethod4();
        //System.out.println(countLetters5("aaabbbbccccc111"));
        //System.out.println(isPalindrome6("madam"));
        // System.out.println(fib7(2));
        //System.out.println(findMissingNumber8(new int[] {1,3,4,5,6,7,8,9,10}));
        //System.out.println(isPrime9(29));
        //System.out.println(findRemainder10(5,10));
    }

    //1.Write a method that swap two variables' values without using temp variable.
    public static void swappingNumbers1(int x,int y) {

        //temp way
        System.out.println("Before Temp " + x + "..." + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Temp " + x + "..." + y);

        //Without using temp
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After without Temp " + x + "..." + y);
    }

    //2.Write a method that checks to see if the words u pass is Anagram.
    public static boolean isAnagram2(String str1, String str2) {
        //Example: dear and read...
        char[] ch1 = str1.toCharArray();
//        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
//        Arrays.sort(ch2);
//        return Arrays.equals(ch1,ch2);
        if (ch1.length != ch2.length) return false;
        for (int i = 0; i < ch1.length; i++) {
            boolean isFound=false;
            for (int j = 0; j <ch2.length; j++) {
                // check all the elements of str1 into the str2 and if it exists, replace it unused char '|'
                if (ch1[i] == ch2[j]) {
                    ch2[j]='|';
                    isFound=true;
                    continue;
                }
            }
            if (!isFound) return false; // any char of st1 is not found within str2 return false
        }
        return true;
    }

    //3.Write a method that reverses a sentence.
    public static String isReversed3(String str) {
        //I love you ---> you love I
        String result = "";
        String[] arr = str.split(" ");
        for(int i = arr.length - 1; i >= 0; i--)
            result+= arr[i] + " ";

        //result = new StringBuilder(str).reverse().toString(); //This will reverse even each character in each word

//		String[] arr = str.split(" ");
//		List<String> list = Arrays.asList(arr);
//
//		Collections.reverse(list);
//
//		arr = list.toArray(new String[arr.length]);
//		str = "";
//		for(String a : arr)
//			str += a + " ";
//
//		return str;
        return result;
    }

    //4.Write a method that sorts an Array int[] without using the sort method.
    public static void sortArrayWithoutUsingSortMethod4() {
//        int[] arr = {2,86,72,8} --> {2,8,72,86} or {86,72,8,2}
        int[] arr = $_7_11.arrayGenerater(15);
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) { //--->if I switch > to < then it will be descending
                    int	temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //5.Write a method that returns how many times each letter is repeated?
    public static Map<String, Integer> countLetters5(String str){

        Map<String,Integer> map = new HashMap<>();

        //		String[] arr = str.split("");
        //		int count = 0;
        //
        //		for(String each : arr) {
        //			count = 0;
        //			for(int i = 0; i < arr.length; i++) {
        //
        //				if(each.equals(arr[i]))
        //					count++;
        //			}
        //			map.put(each,count);
        //		}

        String[] strMap = str.split("");
        for(String each : strMap) {
            if(!map.containsKey(each))
                map.put(each, 1);
            else
                map.put(each,map.size());
        }
        return map;
    }

    //6.Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    public static boolean isPalindrome6(String str) {

        //		char[] ch1 = str.toCharArray();
        //
        //		String strReversed = "";
        //		for(int i = ch1.length - 1; i >= 0; i--) {
        //			strReversed+= ch1[i] + "";
        //		}
        //
        //		char[] ch2 = strReversed.toCharArray();
        //
        //		return Arrays.equals(ch1,ch2);


        //for(int i = 0, j = 1; i < str.length()/2; i++, j++) {
        //if(str.charAt(i) != str.charAt(str.length() - j))
        //return false;
        //}
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    //7.Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
    public static int fib7(int num) {

        int a = 0;//first number
        int b = 1;//second number
        int c;//this is the next number
        if(num == 0)
            return a;
        for(int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //8.Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 2, 3, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
    public static int findMissingNumber8(int[] arr) {

        Arrays.sort(arr);
        if(arr[arr.length - 1] != 10)
            return 10;
        for(int i = 0; i< arr.length - 1; i++) {
            if(arr[i] + 1 != arr[i + 1])
                return arr[i] + 1;
        }
        return 1;
    }

    //9.Write a method that checks if the passing argument is a prime number.
    public static boolean isPrime9(int num) {

        //		if(num <= 1)
        //			return false;
        //		if(num == 2)
        //			return true;
        //
        //		for(int i = 2; i < num; i++) {
        //
        //			if(num%i == 0)
        //				return false;
        //		}
        //		return true;

        if(num <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }

    //10.Write a method that finds remainder of 2 numbers without using the % operator?
    public static int findRemainder10(int dividend, int divisor) {

        return (dividend - divisor * (dividend / divisor));
        //		int quotient = 0;

        //		while(dividend >= divisor) {
        //			dividend-= divisor;
        //			quotient++;
        //		}
        //		return quotient;
    }
}