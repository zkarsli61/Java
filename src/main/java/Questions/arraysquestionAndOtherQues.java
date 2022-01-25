package Questions;
import java.util.ArrayList;
import java.util.List;

public class arraysquestionAndOtherQues {

	public static void main(String[] args) {
        //Ask user to enter long sentences. Then type a program to count
        // all “words” in the sentences.
        // For example; if user enters
        // “Java is easy, if you study. Nothing is easy, if you do not study”
        // output will be 14.
        // Hint: Use split()
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the long sentence");
//        String word1 = scanner.nextLine();
//
//        String[] word1toArray = word1.split("\\s+");  // or you can use  "\\s+"
//
//        System.out.println("Your Sentence have; " + word1toArray.length + " words");
        //Write a Java program to remove a specific element from an array.
//        int[] myNums = {23,45,15,75,28,48}; // our created array
//        int[] myNums_removed = new int[myNums.length-1]; // our new array after remove the specific element
//
//        System.out.println("my original array stores: " + Arrays.toString(myNums));
//
//        int removeTheIndex = 2;
//        int j =0;
//
//        for (int i = 0 ; i<myNums.length ; i++){
//            if(i==removeTheIndex){
//                continue;
//            }else {
//                myNums_removed[j] = myNums[i];
//                j++;
//            }
//        }
//
//        System.out.println("After remove the specific element " + Arrays.toString(myNums_removed));
//
        //Why do we need ArrayList?
    // While we create an array, we have to declare the size of an Array.The size of an Array cannot be modified.
        //If you want to add elements to an Array or remove elements from an Array, you have to create a new Array.
        //However, we can add elements to an ArrayList and remove elements from ArrayList whenever we want.
                    // No need to create a new ArrayList
        // array int [] nums = {3,4,5};
        ArrayList<String> listOfNames = new ArrayList<String>();
        ArrayList<String> listOfToys = new ArrayList<>();
        List<String> listOfCars = new ArrayList<>();
        //ArrayList<String> listOfTrees = new List<String>(); //Does not Compile
        // add() and size()
        ArrayList<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("Cat");
        listOfAnimals.add("Dog");
        listOfAnimals.add(" Wolf");
        listOfAnimals.add("hawk");
        System.out.println(listOfAnimals.size()); //4
        //isEmpty() --> isEmpty() method looks at the ArrayList whether if it is empty or not
        //System.out.println(listOfAnimals.isEmpty()); // if it is empty--> true, if it is not empty --> false
        //remove() --> The remove() methods remove a value in the ArrayList.
        System.out.println(listOfAnimals.remove("hawk"));
        System.out.println(listOfAnimals.remove("rat"));
        //remove() with index number
        System.out.println(listOfAnimals.remove(1));
        System.out.println(listOfAnimals);
        //System.out.println(listOfAnimals.remove(54)); // IndexOutOfBoundsException
        //set()--> The set() method changes one of the elements of the ArrayList without changing the size.
        listOfAnimals.add("Train");
        System.out.println(listOfAnimals);
        listOfAnimals.set(2,"bird");
        System.out.println(listOfAnimals);
        //clear() -->The clear() method provides an easy way to discard all elements of the ArrayList.
        //Returns nothing, its return type is void
        System.out.println(listOfAnimals);
        listOfAnimals.clear(); // removed all elements
        System.out.println(listOfAnimals);
        listOfAnimals.add("eagle");
        System.out.println(listOfAnimals);
        //contains() --> The contains() method checks whether a certain value is in the ArrayList.
        System.out.println(listOfAnimals.contains("eagle"));//true
        System.out.println(listOfAnimals.contains("Paris"));//false
        System.out.println(listOfAnimals.contains("hawk"));//false b/c we used clear() to remove all elements...

	}

}
