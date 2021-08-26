package Examples;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replit_List {
    public static void main(String[] args) {
        //        System.out.println(invertArray("It is very nice to write code."));
        //        String[] name={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
//        System.out.println(swap2Element(Arrays.asList(name),2,7));
        //    System.out.println("maximum occurring character is : "+mostUsedChar("Learning java is easy"));
        System.out.println(deleteFromList(new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer")), "a"));
//        System.out.println(primeNums(5));
//        System.out.println(commonElements(
//                new String[]{"John", "Brad", "Ange", "Sofia", "Emily"},
//                new String[]{"sofia", "brad", "grace", "emily", "hazel"}));
//        System.out.println(removeElement(new int[] {1,2,3,4,5,6},6));
    }

//    write a Java program to removes a specific element from an array and put the remaining elements in a new array
//    and prints the new array
//    Input :{1,2,3,4,5,6}
//    element:6
//    Output : [1,2,3,4,5],
    static List<Integer> removeElement(int[] arr, int element){
        List<Integer> result = new ArrayList<>();
        for (int w:arr) {
            if (!result.contains(w) && w!=element)
                result.add(w);
        }
       return result;
    }
//    Write a program to find the common elements between two String Arrays (without case sensitivity)
//    Input1 : {John,Brad,Ange,Sofia,Emily}
//    Input2 : {sofia,brad,grace,emily,hazel}
//    Output : [sofia,brad,emily]
        static List<String> commonElements(String[] arr1, String[] arr2) {
        List<String> common = new ArrayList<String>();
        for (String w : arr2) {
            for (String z : arr1) {
                if (w.equalsIgnoreCase(z) && !common.contains(w)) {
                    common.add(w.toLowerCase());
                    continue;
                }
            }
        }
        return common;
    }
//    Write a program that accepts an integer as input and
//    prints first 10 prime numbers greater than input
//    Check numbers if they are even or not in a return method.
//          Input : 5
//          Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
        static List<Integer> primeNums (Integer input){
            List<Integer> list = new ArrayList<>();
            input++;
            while (list.size() != 10) {
                for (int i = 2; i <= input; i++) {
                    if (input % i == 0) {
                        if (i == input) list.add(i);
                        break;
                    }
                }
                input++;
            }
            return list;
        }
//    Write a program that deletes the letters 'a' from the names in the list given as input.
//            INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
//            OUTPUT : [Veli,Omer]
        static List<String> deleteFromList (List < String > list, String letter){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).toLowerCase().contains(letter.toLowerCase())) {
                    list.remove(i);
                    i--;
                }
            }
            return list;
        }
//    Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.
//    Note: Upper and lower case letters, spaces and special characters will not be changed.
//             Input : It is very nice to write code.
//            Output : .edoc etirw ot ecin yrev si tI
        static String invertArray (String s){
        String[] arr = s.split("");
            String reverse = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                reverse += arr[i];
            }
            return reverse;
        }
//    Create a 10-element list. Swap the 8th element with the 3rd element.
//        INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
//        Output: [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
        static List<String> swap2Element (List < String > list,int firstInd, int secondInd){
//        System.out.println(list);
            String s = list.get(firstInd);
            list.set(firstInd, list.get(secondInd));
            list.set(secondInd, s);
            return list;
        }
//    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
//        input : Learning java is easy
//        output: maximum occurring character is : a
        static char mostUsedChar (String input){
            char chmostUsed = ' ';

            List<String> list = Arrays.asList(input.replace(" ", "").toLowerCase().split(""));
            Collections.sort(list);
            int count = 1;
            int max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).equals(list.get(i + 1)))
                    count++;
                else {
//                System.out.println(list.get(i)+count);
                    if (count > max) {
                        max = count;
                        chmostUsed = list.get(i).charAt(0);
                    }
                    count = 1;
                }
            }
            return chmostUsed;
        }
}