package day35lambdacourse;

import java.util.function.Predicate;

public class FunctionalInterfacePredicate {
    public static void main(String[] args) {
        int a[] = {5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};


        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i < 30;
        Predicate<Integer> p3 = i -> i % 2 == 0;

        for (int w : a) {
//15 20 25 30 40 50 60
            if (p1
                    .and(p2)
                    .or(p3)
                    .negate()
                    .test(w))
                System.out.print(w + " ");
        }
    }
}
