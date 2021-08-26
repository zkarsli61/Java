package day35lambdacourse;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("David", 50000));
        list.add(new Employee("John", 30000));
        list.add(new Employee("Mary", 20000));

        // Function
        Function<Employee, Integer> f = e -> e.salary * 10 / 100;
        // Predicate
        Predicate<Integer> p = a -> a >= 5000;
        //Consumer
        Consumer<Employee> c = e -> {
            System.out.println(e.ename+" "+e.salary+" ");
        };

        for (Employee e:list) {
            int bonus = f.apply(e);
            if (p.test(bonus))
                c.accept(e);
        }
    }
}

