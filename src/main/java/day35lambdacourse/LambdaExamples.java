package day35lambdacourse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//import day27_JavaPractice.*;


public class LambdaExamples {

    public static void main(String[] args) {
//        System.out.println(sumOf3(new int[]{2,2,5,3,6,3,7}));
//        System.out.println(findUnique(new int[]{2,2,5,3,6,3,7}));
        System.out.println(numberExtractor("za12f3e4r57"));
System.out.println(removeDuplicates("zaaaafeeeer"));

    }
    static void findMostFrequent(ArrayList<String> list){
       String mostFrequent = list.stream()
                .sorted(Comparator.comparingInt(a -> Collections.frequency(list, a)))
                .skip(list.size()-1)
                .findFirst().get();
        System.out.println(mostFrequent);
    }
    static List<Integer> findUnique(int[] arr) {
    List<Integer> al = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return al.stream().filter(x->Collections.frequency(al,x)==1)
            .collect(Collectors.toList());
    }
    static int[] sortedArray(int[] arr){
        return Arrays.stream(arr).sorted().toArray();
    }
    static boolean sumOf3(int[] arr){
        return Arrays.stream(arr).filter(x->x==3).count()==3;
    }
    static int[] generateArray(int x) {
		return Arrays.stream(new int[x]).map(e-> new Random().nextInt(100)).toArray();
	}
    static List<String> numberExtractor(String str){
        return str.chars()
                .filter(Character::isDigit).mapToObj(c->String.valueOf((char)c)).collect(Collectors.toList());
//
//        return  str.chars()
//                .filter(Character::isDigit)
//                .collect(ArrayList::new,
//                        (a,b)-> a.add(String.valueOf((char) b)),
//                        (b1,b2)-> b1.addAll(b2));
    }
    static void overview(){
        Stream.generate((ArrayList::new))
                .limit(60)
                .collect(Collectors.toList());

//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                //.map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);

        String[] languages = {"Java", "Python", "JavaScript"};
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(System.out::print);
        Stream.of(languages).forEach(System.out::print);

        // System.out.println(IntStream.of(1, 3, 5, 6, 7, 8, 9).sum());
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);
        List<Integer> newlist = list.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println(newlist);
        //System.out.println(findSum(2));
    }
    static int sumOfNumbers(int num) {return IntStream.rangeClosed(1,num).sum();}
    public static int findSum(int a){return IntStream.range(3,a).filter(x->x%3==0 || x%5==0).sum();}
    public static String removeDuplicates(String str) {

        return Arrays.stream(str.split(""))
            .distinct().reduce("",String::concat);

//        return Arrays.stream(str.split(""))
//            .distinct().collect(Collectors.joining("","Pre-", "-Post"));
    }
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();}
    public int[] plusTwo(int[] a, int[] b) {return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();}
    static int findMaxs(Integer[] arr){
        Integer max2 = Arrays.asList(arr).stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return max2;
    }
}
