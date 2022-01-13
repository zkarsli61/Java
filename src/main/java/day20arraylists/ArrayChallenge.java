package day20arraylists;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayChallenge {
    public static void main(String[] args) {
        String arr[] = {"[2, '2 ', '3,' 10, '6]","[5 ' ' ,' 2', '3   ']"};
//       // Arrays.stream(arr).map(x-> x.replaceAll("\"","")).;
//        String[] arr1 = arr[0].split(",");
//        //String[] arr2 = arr[1].split(", ");
//        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println(arrayManup(arr));
        //replace " character each element of array
        // convert to array  each element
        // compare 2 array
        //return 7 - 4 - 6 -10 - 6
    }

    static String arrayManup(String[] arr) {

        int[] first, second, small, big;

        // clean all chars except digit and "," -> [^\d,] as regexp
        arr[0] = arr[0].replaceAll("[^\\d,]", "");
        first = Arrays.stream(arr[0].split(",")).mapToInt(Integer::parseInt).toArray();

        arr[1] = arr[1].replaceAll("[^\\d,]", "");
        second = Arrays.stream(arr[1].split(",")).mapToInt(Integer::parseInt).toArray();

        small = (first.length < second.length) ? first : second;
        big = (first.length < second.length) ? second : first;

        // add each elements of small array to big array
        for (int i = 0; i < small.length; i++) {
            big[i] += small[i];
        }
        // add "-" delimiter and return a string
        return Arrays.stream(big).mapToObj(x -> x + "").collect(Collectors.joining("-"));
    }
}
