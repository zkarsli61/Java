package lambdacourse;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExamples {
    public static void main(String[] args) {

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
    public static int findSum(int a){
        return IntStream.range(3,a).filter(x->x%3==0 || x%5==0).sum();
    }

    public int[] plusTwo(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }
}
