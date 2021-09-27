package day19Loop;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
//    System.out.println(findUnique(new int[] {1,1,2,2,3,3,4,5,6,10} ));
        System.out.println(fibo(10));
        System.out.println(missingNum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(convert2List(new String[][]{{"John", "Bred", "Fox"}, {"Lee", "Ali"}, {"Suzan"}}));
    }

    static List<String> convert2List(String[][] arr) {
        List<String> list = new ArrayList<>();
        for (String[] w1 : arr)
            for (String w2 : w1)
                list.add(w2);
        Collections.sort(list);
        return list;
    }

    static List<String> convert2ListStream(String[][] arr) {
        List<String> list = new ArrayList<>();

        for (String[] w1 : arr)
            for (String w2 : w1)
                list.add(w2);
        Collections.sort(list);
        return list;
    }


    static int missingNum(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=i+1){
                return i+1;
            }
        }
        return a.length+1;
    }
    static List<Integer> fibo (int num){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 1; i < num; i++) {
            list.add(list.get(i-1)+list.get(i));
        }
        return list;
    }

    static void removeFromList(List<String> wordList, String targetWord) {
//        List<String> list = new ArrayList<>();
//        list.add("hi");
//        list.add("hey");
//        list.add("hi");
//        list.add("you");
//
//        removeFromList(list, "hi");
        while (wordList.remove(targetWord)) ;
        System.out.println(wordList);
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

    static boolean isPalindrom(String s1, String s2){
        return new StringBuilder(s1).reverse().equals(s2);
    }
    //7. Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true
    static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        //String[] arr1 = str1.split("");
        char[] arr1 = str1.toCharArray();
        //String[] arr2 = str2.split("");
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    static int[] singleArrayGenerator(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = new Random().nextInt(10);
        return arr;
    }

    // 9. Write a method that accepts an Array of integers and returns the max and the secondMax.
    static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
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


    static void scpExamples(){
        String str1 = "Dallas";//scp
        String str2 = new String("Dallas");//heap
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        String str3 = str1;//str3 = dallas
        System.out.println(str3 == str1);//true
        str1 = "Austin";
        System.out.println(str3 == str1); //false
        System.out.println(str3.equals(str1));//false
        //equals() compares the objects. equals() is already overridden for String,
        // Collections, Wrapper classes for content comparison.
    }
    static boolean checkArr(int[] a) {
// 12. Write a method that accepts an array and returns true
// if the sum of all 3's in the array is exactly 9.
// EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false

//        System.out.println(checkArr(new int[2,3,5,3,6,3,7]);
        int count = 0;
        for (int num : a) {
            if (num == 3)
                count++;
        }
        return count == 3;
    }

    static int pairedShoes(int... shoes) {
        //We have several shoes that must be paired by size.
// Given an array of integers representing the size of each shoe,
// determine how many pairs of shoes with matching there are.
//        INPUT : ar = [38, 39, 38, 39, 38, 40, 39]
//        OUTPUT: The number of pairs are 2.

        int pairedNum = 0;
        System.out.println("Input array:" + Arrays.toString(shoes));
        for (int i = 0; i < shoes.length; i++) {
            int count = 1;
            if (shoes[i] != 0) { // no need to check element is duplicated
                System.out.println("i=" + i + " --> 2nd for loop running");
                for (int j = i + 1; j < shoes.length; j++) {
                    if (shoes[i] == shoes[j]) {
                        shoes[j] = 0; // change 0 element is duplicated
                        count = count == 1 ? 0 : 1;
                        if (count == 0) {
                            pairedNum++;
                        }
                    }
                }
            }
            System.out.println("End of the " + (i + 1) + ".run:" + Arrays.toString(shoes));
        }
        return pairedNum;
    }

    ;

    static void printLetterswithRepeatedCount(String s) {
        // Find the repeated words in the sentence
        // Input: "I like Java I don't like Phyton"
		/*
		 Output: I2
		 		 like2
		 		 Java1
		 		 don't1
		 		 Phyton1
		 */
        String list[] = s.split(" ");
        for (int i = 0; i < list.length; i++) {
            int counter = 1;
            if (!list[i].equals("")) { //no need to check "" element.
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i].equals(list[j])) {
                        counter++;
                        list[j] = ""; // change "" if it is duplicated
                    }
                }
                System.out.println(list[i] + counter);
            }
        }
//         I
//                the same result ... without creating new list and 2nd for loop only runs for non-duplicate elements ...

    }

    static void difForAndForEach(int[] arr) {
        // foreach if you need to change the elements. don't use for each
        for (int a : arr) {
            System.out.println(a);
            a += 1;
        }

        // for with counter
        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void validateInput(Scanner s) {
        System.out.print("Please enter an integer ...");

        // check the input's data type whether is true or not
        while (!s.hasNextInt()) {
            System.out.println(s.next() + "is not an integer, Try again ..");
        }

        int a = s.nextInt();
        System.out.println("Congrats! You did it...");
    }



    //	Interview Questions
    // How to create and initialize List or ArrayList
    static void createInit() {
        //You can create and initialize Array in just one line in Java

        String[] coolStringArray = new String[]{"Java", "Scala", "Groovy"};
        System.out.println(" Array : " + Arrays.toString(coolStringArray));

        //Now If you want to create
        // an ArrayList with three elements
        List<String> notSoCoolStringList = new ArrayList<String>();
        notSoCoolStringList.add("Java");
        notSoCoolStringList.add("Scala");
        notSoCoolStringList.add("Groovy");

        //It took four-line to create and initialize List
        System.err.println(" List : " + notSoCoolStringList);

        //Now here is simple Java tips to
        // create and initialize List in one line but we can't use add/remote method because of the asList.

        List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
        System.err.println(" List created and initialized at same line : " + coolStringList);
    }

    // Overview the popular methods.
    static void popularmethods() {
        ArrayList<String> programmers = new ArrayList<String>();

        //adding objects into ArrayList, here we have added String
        programmers.add("James Gosling");
        programmers.add("Dennis Ritchie");
        programmers.add("Ken Thomson");
        programmers.add("Bjarne Stroustrup");

        //Now, size of this List should be 4 - No?
        System.out.println("How many programmers? " + programmers.size());

        //Let's get first programmer, remember index starts with zero
        System.out.println("Who is the first programmer in our List? " + programmers.get(0));

        //Let's remove last programmer from our list
        programmers.remove(programmers.size() - 1);


        //Now, size should be 3 - Right?
        System.out.println("How many programmers remaining? " + programmers.size());

        //Let's check if our List contains Dennis Ritchie, inventor of C
        boolean doYouGotRitchie = programmers.contains("Dennis Ritchie");
        System.out.println("Do you have the great Dennis Ritchie in your List : "
                + doYouGotRitchie);

        //How about checking if Rod Johnson is in list or not
        System.out.println("Do you got Rod Johnson, creator of Spring framework : "
                + programmers.contains("Rod Johnson"));


        //Now it's time to shake break, let's clear ArrayList before we go
        programmers.clear();
        System.out.println("zafer");

        //What would be size of ArryaList now? - ZERO
        System.out.println("How many programmers buddy? " + programmers.size());

    }

    //How to sort
    static void sort() {
        List<Integer> listofYears = new ArrayList<Integer>();
        listofYears.add(2021);
        listofYears.add(2019);
        listofYears.add(2018);
        listofYears.add(2020);

        // print the ArrayList before sorting
        System.out.println("ArrayList before sorting");
        System.out.println(listofYears);

        // sorting an ArrayList of Integer in ascending order
        Collections.sort(listofYears);

        // print the ArrayList after sorting
        System.out.println("ArrayList after sorting");
        System.out.println(listofYears);

        // sorting an ArrayList of Integer in descending order


        Collections.reverse(listofYears);
        System.out.println(listofYears);

        Collections.sort(listofYears, Collections.reverseOrder());
        // print the ArrayList after sorting

        System.out.println("ArrayList after sorting in descending order");
        System.out.println(listofYears);
    }

    //How to remove duplicates from ArrayList in Java
    static void removeDublicate() {
        // creating ArrayList with duplicate elements
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);  //duplicate
        primes.add(7);
        primes.add(11);

        // let's print arraylist with duplicate
        System.out.println("list of prime numbers : " + primes);

        // https://prnt.sc/1b2oswb Let's see in detail

        for (int i = 0; i < primes.size(); i++) {
            if (primes.lastIndexOf(primes.get(i)) != i) { // primes.indexOf(primes.get(i)); is the same as i
                primes.remove(i);
            }
        }

        // 2 way create a newList
//		List<Integer> newList = new ArrayList<Integer>();
//
//		for (Integer a:primes) {
//			if (!newList.contains(a)){ // if it doesn't contain we should add only once so it will be unique
//				newList.add(a);
//			}
//		}
        System.out.println("list of primes without duplicates : " + primes);
    }

    //How to reverse ArrayList
    static void reverseList() {

//		You can reverse ArrayList in Java by using the reverse() method
        ArrayList<String> listOfInts = new ArrayList<>();
        listOfInts.add("1");
        listOfInts.add("5");
        listOfInts.add("3");
        listOfInts.add("4");
        listOfInts.add("2");

        System.out.println("Before Reversing : " + listOfInts);
        Collections.reverse(listOfInts);
        System.out.println("After Reversing : " + listOfInts);

    }

    //Usage the kind of Loop statement
    static void ArrayListLoopExample() {

        //Creating ArrayList to demonstrate How to loop and iterate over ArrayList
        ArrayList<String> games = new ArrayList<String>(10);
        games.add("Cricket");
        games.add("Soccer");
        games.add("Hockey");
        games.add("Chess");

        System.out.println("original Size of ArrayList : " + games.size());

        //Looping over ArrayList in Java using advanced for loop foreach
        System.out.println("Looping over ArrayList in Java using advanced for loop");
        for (String game : games) {
            //print each element from ArrayList
            System.out.println(game);
        }

        //You can also Loop over ArrayList using traditional for loop
        System.out.println("Looping ArrayList in Java using simple for loop");
        for (int i = 0; i < games.size(); i++) {
            String game = games.get(i);
        }

        //Iterating over ArrayList in Java we haven't learned yet. Let's jump into the next.
        Iterator<String> itr = games.iterator();
        System.out.println("Iterating  over ArrayList in Java using Iterator");
        while (itr.hasNext()) {
            System.out.println("removing " + itr.next() + " from ArrayList in Java");
            itr.remove();
        }

        System.out.println("final Size of ArrayList : " + games.size());

    }
}
