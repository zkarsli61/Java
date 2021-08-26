package day35lambdacourse;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> f = n -> n * n;
        Function<String, Integer> f2 = s -> s.length();

        System.out.println(f.apply(5));
        System.out.println(f2.apply("Welcome JAva"));


        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("David", 50000));
        list.add(new Employee("John", 30000));
        list.add(new Employee("Mary", 20000));

        Function<Employee, Integer> fn = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return sal * 10 / 100;
            else if (sal > 20000 && sal <= 30000)
                return sal * 20 / 100;
            else if (sal > 30000 && sal <= 50000)
                return sal * 30 / 100;
            else
                return sal * 40 / 100;
        };

        Predicate<Integer> p4 = b-> b>5000;

        for (Employee e:list) {
            int bonus=fn.apply(e);

            if (p4.test(bonus)) {
                System.out.print(e.ename+" "+e.salary);
                System.out.println(" Bonus is:"+bonus);
            }
        }

        Function<Integer,Integer> f1=n->n*2;
        Function<Integer,Integer> f11=n->n*n*n;

        // Function chaining
        System.out.println(f1.andThen(f11).apply(2));
        System.out.println(f1.compose(f11).apply(2));


    }
}
