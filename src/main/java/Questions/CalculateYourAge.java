package Questions;

public class CalculateYourAge {
	public static void main(String[] args) {
        //Create a method as name of "age" with two integer
        // parameters and calculates your age
        age(1989, 2020);
        age(1976, 2020);
        age(1999, 2020);
        int birthYear = 1990;
        int thisYear = 2020;
        age(birthYear, thisYear);//more dynamic way
    }
    public static void age(int birthYear, int thisYear){
        int age = thisYear-birthYear;
        System.out.println("You are "+ age + " years old.");
    }
}