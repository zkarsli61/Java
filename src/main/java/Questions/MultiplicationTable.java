package Questions;

public class MultiplicationTable {
	  public static void main(String[] args) {
	        /*
	       Multiplication Table
	———————————————————————————————————————
	1 |    1   2   3   4   5   6   7   8   9
	2 |    2   4   6   8  10  12  14  16  18
	3 |    3   6   9  12  15  18  21  24  27
	4 |    4   8  12  16  20  24  28  32  36
	5 |    5  10  15  20  25  30  35  40  45
	6 |    6  12  18  24  30  36  42  48  54
	7 |    7  14  21  28  35  42  49  56  63
	8 |    8  16  24  32  40  48  56  64  72
	9 |    9  18  27  36  45  54  63  72  81
	*/
	        System.out.println("          Multiplication Table");
	        System.out.println("---------------------------------------------");
	        for (int i =1 ;i<11 ; i++){
	            System.out.print(i + " | ");
	          
	            for (int j = 1 ;j<11 ; j++){
	                //System.out.print(" " + i*j);
	               System.out.printf("%4d", i*j); //1234, _123, __12,
	            }
	            System.out.println();
	            /*The %4d specifier means a minimum width of three spaces,
	             *  which, by default, will be right-justified.
                     %4d Specifies the field width for outputting the argument 
                     and represents the minimum number of characters to be 
                     written to the output. Include space for expected commas
                      and a decimal point in the determination of the width for numerical values.
	             * 
	             */
	            
	        }
	    }
	}