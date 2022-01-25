package Questions;

  //Write a method that accepts an array and prints the sum of all elements in the array

    
 
public class sumOfTheArray {

	
		public static void main(String[] args) {
	        //Write a method that accepts an array and prints the
	        // sum of all elements in the array
	        int[] num1 = {1,2,3,4,5}; //15
	        int[] num2 = {-10,5,67}; //62
	        int[] num3 = {-3,-5,-6};//-14
	        System.out.println(sumOfArray(num1));
	        System.out.println(sumOfArray(num2));
	        System.out.println(sumOfArray(num3));
	    }
	    public static int sumOfArray(int[] arr){
	        int sum = 0;
	        for (int i = 0 ;i<arr.length ; i++){ // for(int nums : arr) { sum+=nums;}
	            sum +=arr[i];
	        }
	        return sum;
	    

	}

}
