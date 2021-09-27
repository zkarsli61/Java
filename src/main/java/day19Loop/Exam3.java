package day19Loop;

import java.util.*;

public class Exam3 {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(List.of(1,1,2,2,3,3));
//        System.out.println(list);
//        HashSet<Integer> set= new HashSet<>(list);
//        System.out.println(set);
//        System.out.println(isPangram2("The quick brown fox jumps over the lazy dog"));
//        sumGame();
        System.out.println(extracter("Zaaa23i4343i67777"));
    }

    //Write a function to check whether a string is pangram or not assuming that the string passed in does not have any punctuation.
    // Pangrams are words or sentences containing every letter of the alphabet at least once.
    static boolean isPangram(String str) {
        str = str.replace(" ", "").toLowerCase();
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!al.contains(each) && Character.isLetter(each)) {
                al.add(each);
            }
        }
        return al.size() == 26;
    }

    static boolean isPangram2(String str) {
        String[] arr = str.replace(" ", "").toLowerCase().split("");
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        return set.size() == 26;
    }

    //2.Write a method where u ask a user to enter a number until the total is at least 100 or
    // number of trials is equal to 3. EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 -->
    // You made it! your sum is 100.
    static void sumGame() {
        Scanner scan = new Scanner(System.in);
        int sum, trials;
        sum = 0;
        trials = 0;
        while (sum < 100 && trials != 3) {
            System.out.println("Enter a number!");
            sum += scan.nextInt();
            trials++;
        }
        if (sum >= 100)
            System.out.println("You made it! Your sum is " + sum);
        else if (trials == 3)
            System.out.println("You ran out of trials!!");
    }

    //6.Write a method that reverses a number. Method accepts an integer and returns an int. EX: 123 --> 321
    static int reverseNumber(int num) {
        String result = "";
        String str = String.valueOf(num);
        if (num < 0) {
            str = str.substring(1);
            result += "-";
        }
        result += new StringBuilder(str).reverse().toString();
        return Integer.parseInt(result);
//        String reversed = "";
//        if(num == 0)
//            reversed = "0";
//        if(num < 0) {
//            num *= -1;
//            reversed += "-";
//        }
//        while(num > 0){
//            reversed += num % 10;
//            num /= 10;
//        }
//        return Integer.parseInt(reversed);
    }

    //7.Write a method that gets any number from a string it gets and returns the total of those number.
    // EX :extractNum("aa2aa3") ==> 2+3 ==> 5.
    static int extracter(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (char w : arr) {
            if (Character.isDigit(w))
                sum += Integer.parseInt(w + "");
        }
        return sum;
    }

    //1.Write a method that can remove duplicated values from an Integer ArrayList.EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]
    static ArrayList<Integer> remover(ArrayList<Integer> al) {
//        for(int i = 0; i < list.size(); i++){
//            int count = 0;
//            for(int j = 0; j < list.size(); j++){
//                if(list.get(i).equals(list.get(j)))
//                    count++;
//            }
//            if(count > 1){
//                list.remove(list.get(i));
//                i--;
//            }
//        }
//        return list;
        return new ArrayList<>(new HashSet<>(al));
    }

    //9. Create a method the prints the lowercase alphabet
    static ArrayList<String> alphabet() {
        ArrayList<String> al = new ArrayList<>();
        for (char i = 97; i <= 122; i++) {
            String each = i + "";
            al.add(each);
        }
        return al;
    }
    //Create a method that generates names, Method accepts an int that will set # of names to be stored in the arraylist. It returns an Arraylist

    static ArrayList<String> createNames(int numOfNames) {

        ArrayList<String> al = new ArrayList<>();
        List<String> list = alphabet();

        for (int j = 1; j <= numOfNames; j++) {
            String name = "";
            int length = new Random().nextInt(25);
            for (int i = 0; i <= length; i++) {
                int num = new Random().nextInt(26);
                name += list.get(num);
            }
            al.add(name);
        }
        return al;
    }

    //Create a method that accepts an arrayList of Strings and return the longest String
    static String findLongest(ArrayList<String> al) {
        String result = "";

        for (String each : al) {
            if (each.length() >= result.length())
                result = each;
        }
        System.out.println(al);
        return result;
    }
}
