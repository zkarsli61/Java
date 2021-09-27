package day20arraylists;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExams {
    public static void main(String[] args) {
        //System.out.println(removeWord(new ArrayList<>(List.of("a","a","a","b","c","a")), "a"));
        //System.out.println(findUnique(new int[] {1,1,1,2}));
        //System.out.println(Arrays.toString(sortedArray(singleArrayGenerator(10))));
        //System.out.println(findMaxs(singleArrayGenerator(10)));
        //System.out.println(isAnagram("elbow", "below"));
//        System.out.println(sumOf3(new int[]{2,3,5,3,6,3,7}));
//        Lesson05_1_for_Loop.timer(4);
//        System.out.println(isMountain(new int[]{1,2,3,4,3,2,1}));
//        System.out.println(isMountain1(new int[]{1,5,9,9,9,9,9}));
        //  putAllZeroToEnd(new int[]{3,4,0,5,0,2,0});
//        System.out.println(countCharFirstToLastOccur("aaaaaaeaaaaa",'e'));
//	System.out.println(findLongestPolindrome("abxxbmbd"));
//	Integer arr[] = new Integer[]{-9,-9,0,1,2,-1,34,4,4,5,5,4,3,5}; 
//	longSequence1(arr);
	String MESSAGE ="Hello!";
}

    public static void longSequence1(Integer arr2[]){
        Map<Integer,String> map=new HashMap<>();
        Integer index=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>0){
        	map.put(index,map.get(index)==null?""+arr2[i]:map.get(index)+", "+arr2[i]);
            } else{
                index++;
            }
        }
    System.out.println(map.values().stream().max(Comparator.comparing(String::length)).get());
}
    
    static int longSequence(int[] arr) {
	int max=0,seqNum=0;
	String str = "";
	for (int i : arr) {
	    if (i>0) {
		str += i+",";
		seqNum++;
	    }
	    else {
		max=(seqNum >max )? seqNum:max ;
		
		str=""; seqNum=0;
	    }
	}
	max=(seqNum >max )? seqNum:max ;
	return max;
    }
    // Find the closest 2 numbers without using sort() method
    static void closestNums(int[] list) {
        // we don't need to check the last element 1st for loop.
        // because it will ve covered into the 2nd for loop.
        // so The 1st element will be increased by 1 till list.size()-1
        int minDif = Integer.MAX_VALUE;
        int num1=0, num2=0;

        for (int i = 0; i < list.length - 1; i++) {
            // the 2nd element should be ahead of the 1st element. That's why the 2nd index will start i+1
            for (int j = i + 1; j < list.length; j++) {
                // we are calculating the difference between 2 currrent element
                int dif = Math.abs(list[i] - list[j]);
                //and check to the minDif value
                if (dif < minDif) {
                    minDif = dif; // change the minDif value and the num1 and num2 as well
                    // because we don't use sort method.
                    num1 = list[i];
                    num2 = list[j];
                }
            }
        }
        System.out.println("Closest numbers are " + num1 + "-" + num2);
    }
    //TODO ****
    static String findLongestPolindrome(String s){
        String[] arr = s.split("");
        for (String a:arr) {
            if (s.indexOf(a)!=s.lastIndexOf(a)){
                String word = s.substring(s.indexOf(a),s.lastIndexOf(a)+1);
                if (StringUtils.reverse(word).equals(word))
                    return word;
            }
        }
        return "Not found";
    }
    static int countCharFirstToLastOccur(String s, char c){

        s= s.replaceAll("\\s","");

        int first =  s.indexOf(c);
        int last =   s.lastIndexOf(c);

        if (first == -1 || last-first-1 < 0 ) return -1;

        return last-first-1;
    }
    static void putAllZeroToEnd (int[] arr){
//        int[] result,temp;
//        temp =  Arrays.stream(arr).filter(x-> x>0).toArray();
//        result = Arrays.copyOf(temp, arr.length);
//        System.out.println(Arrays.toString(result));

        int[] result = new int[arr.length];
        int ind=0;
        for (int a:arr) {
            if (a!=0) {
                result[ind]=a;
                ind++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    public static void removeDuplicate(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }

    /*
     * Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
     * the maximum value, decreasing constantly after the maximum value
     *
     * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
     * the maximum value, decreasing and increasing after the maximum value
     *
     * Create a method to check if it is Mountain Array or not. Use as possible as
     * Functional Programming
     */
    public static boolean isMountain1(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();

        // Initially we will go up till the top
        boolean bottom2Top = true;

        int num,nextNum;

        for (int i = 1; i < arr.length; i++) {
            num = arr[i-1];
            nextNum = arr[i];
            if (bottom2Top) {
                if (nextNum < num) return false;
            }
            else {
                if (nextNum > num) return false;
            }
            // when we reach the top/max, change the direction
            if (nextNum==max)  bottom2Top=false;
        }

        return true;
    }
    public static boolean isMountain(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1])
                return false;
        }
        for (int i = input.length / 2; i < input.length - 1; i++) {
            if (input[i] < input[i + 1])
                return false;
        }
        return true;
    }
    //     12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9. EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
    static boolean sumOf3(int[] arr){
        int count = 0;
        for(int num : arr){
            if(num == 3)
                count++;
        }
        return count == 3;
    }

    //7. Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true
    static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        //String[] arr1 = str1.split("");
        char[] arr1 = str1.toCharArray();
        //String[] arr2 = str2.split("");
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }

    // Write a method that generates a single dimensional Array
    static int[] singleArrayGenerator(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = new Random().nextInt(100);
        return arr;
    }


    // 11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.
    static int[] sortedArray(int[] arr){
        for(int i = 0; i < arr.length -1 ; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
        //return Arrays.sort(arr);
    }

    //14. Write a method that accepts an Array and returns the number/s that are not repeated in an ArrayList. Method returns the numbers in aN ArrayList. EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]
    static ArrayList<Integer> findUnique(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();

        for(int num : arr){
            int count = 0;
            for(int num2 : arr){
                if(num == num2) {
                    count++;
                    if (count>1){
                        count = 0;
                        break;
                    }
                }
            }
            if(count == 1)
                al.add(num);
        }
        return al;
    }

    //16. Write a method that takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord. Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","you"));  ----> removeAll(wordList,"hi"); --->["hey","you"].
    static ArrayList<String> removeWord(ArrayList<String> al, String word){
        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(word)) {
                al.remove(al.get(i));
                i--;
            }
        }
        return al;
    }
}
