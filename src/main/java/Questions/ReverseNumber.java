package Questions;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //Write a function to reverse a number in Java
        // Ex; input; 1258
            // output; 8521
        long givenNum = 1258;
        ReverseNumber input = new ReverseNumber();
        System.out.println("Before Reverse; " + givenNum);
        System.out.println("After Reverse; " + input.doReverse(givenNum));
    }
    public long doReverse(long num) {
        long reverse = 0;
        while (num!=0){
            reverse = (reverse*10) + (num%10);
        }
        return reverse;
		
    }
    
}
	
