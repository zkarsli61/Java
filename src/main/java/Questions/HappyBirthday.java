package Questions;

public class HappyBirthday {

	public static void main(String[] args) {
		/*Create a method as name of "printString" with one String and one integer parameters
		and prints the String with given times of integer values*/
//		printString("Happy BirthDay!", 30);
//		“Happy BirthDay!”
//		“Happy BirthDay!”
//		“Happy BirthDay!”
//		“Happy BirthDay!”
//		“Happy BirthDay!”
//		“Happy BirthDay!”
//		….
	    
	        /*Create a method as name of "printString" with one
	        String and one integer parameters and prints the String
	        with given times of integer values*/
	        String givenStr = "Happy BirthDay!";
	        int givenNum = 5;
	        printString(givenStr, givenNum);
	    }
	    public static void printString(String givenStr, int givenNum){
	        String print = "";
	        for (int i = 0 ;i<givenNum ; i++){
	            print += givenStr + " ";
	        }
	        System.out.println(print);
	    }
	
	}


