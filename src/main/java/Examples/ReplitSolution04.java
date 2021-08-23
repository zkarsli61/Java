//====================For_while_1=========================================
//import java.util.Scanner;
//
////
//// Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
//        e.g:
//
//        char ch1= 'a' ;
//
//        String name =“John came late"
//
//        Expected Output: Number of a = 2
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a string");
//        String str=scan.nextLine();
//
//        System.out.println("Please enter a char");
//        char ch=scan.next().charAt(0);
//        int counter=0;
//        for(int i=0; i<str.length();i++) {
//        if(str.charAt(i)==ch) {
//        counter++;
//        }
//        }
//        System.out.println("number of "+ch+" = "+counter);
//
//        scan.close();
//
//
//        ====================For_while_2=========================================
//
//
//        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
//
//        Input :
//
//        30 and 40
//
//        Expected OutPut:
//
//        GCD for 30 and 40 = 10
//        LCM for 30 and 40 = 120
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter 2 numbers ");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        int gcd = num1;
//        int lcm = num1;
//
//        // gcd
//
//        for (int i = num1; i >1; i--) {
//
//        if (num1%i==0 && num2%i==0) {
//        System.out.println("GCD for " + num1 + " and " + num2 + " = " + i);
//        break;
//        }
//
//        }
//
//        //lcm
//
//        for (int i = num1; i <num1*num2 ; i++) {
//
//        if (i%num1==0 && i%num2==0) {
//        System.out.println("LCM for " + num1 + " and " + num2 + " = " + i);
//        break;
//        }
//
//        }
//
//
//
//
//
//
//
//        ====================For_while_3=========================================
//
//import java.util.Scanner;
//
//Write a code that returns the duplicate chars in a String array.(interview Question)
//
//        Input :
//
//        String str=“Javaisalsoeasy”
//
//        Output: a s
//
//
//
//        String str = "Javaisalsoeasy";
//        char[] ch = str.toCharArray();
//
//        List<Character> uniqueChars = new ArrayList<>();
//        Arrays.sort(ch);
//
//        for (int i = 0; i < ch.length - 1; i++) {
//        if (ch[i] == ch[i + 1] && !uniqueChars.contains(ch[i])) {
//        uniqueChars.add(ch[i]);
//        }
//        }
//
//        System.out.println(uniqueChars);
//
//
//
//
//        ====================For_while_4=============================================
//
//        Write a return method that accepts an integer as input and calculates factorial and prints like output.
//
//        Input : 6
//
//        Output: 6!=6*5*4*3*2*1=720
//
//
//        int input =6;
//        factorial(input);
//        }
//
//public static void factorial(int input) {
//
//        System.out.print(input + "!=");
//        int fact=1;
//        for (int i = input; i >1; i--) {
//
//        System.out.print(i+"*");
//        fact*=i;
//        }
//        System.out.print("1=" + fact);
//
//
//
//
//        ====================For_while_5=========================================
//
//        Print even numbers from 100 to 0 but do not use decrement(i--).
//
//        OUTPUT  : 100 98 96 94 92 … … … … 2 0
//
//        System.out.print("Even Numbers from 100 to 0 are: ");
//        for (int i = 100; i >=0; i--) {
//        //if number%2 == 0 it means its an even number
//        if (i % 2 == 0) {
//        System.out.print(i + " ");
//        }
//        }
//
//
//
//        ====================For_while_6=========================================
//
//
//        Print Alphabet on the console.
//
//        OUTPUT  : a b c .. .. .. .. y z
//
//        char ch;
//
//        for( ch = 'a' ; ch <= 'z' ; ch++ )
//        System.out.println(ch);
//
//
//
//        ====================For_while_7=========================================
//
//        Write java code checking the number is Perfect number or not.
//
//        * Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
//
//        Input :6
//        Output:6 is Perfect Number
//        Input :7
//        Output:7 is not Perfect Number
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input a digit");
//        int n = scan.nextInt();
//        int sum = 0;
//
//        for(int i = 1; i < n ; i++){
//        if(n%i==0){
//        sum = sum+i;
//        }
//        }
//
//        System.out.println(sum);
//
//        if(sum==n){
//        System.out.println(n + " mukemmel sayidir");
//        }else{
//        System.out.println(n + " mukemmel sayi degildir");
//        }
//
//
//
//        ====================For_while_8=========================================
//
//        Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
//
//
//        for (int i = 'a'; i <= 'z'; i++) {
//
//        System.out.println( "Ascii value of " + (char)i + " = " + (int)i);
//        }
//
//
//
//
//        ====================For_while_9=========================================
//
//
//        Write a java program to reverse the number which user entered.
//
//        Input  :1238
//        Output :Reverse Of The Number: 8321
//
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter a number : ");
//        int num = scan.nextInt();
//
//        int reverse = reverseOfTheNumber(num);
//
//        System.out.println("Reverse Of The Number: " + reverse);
//
//        }
//
//
//public static int reverseOfTheNumber(int n) {  // 1654 - 456
//        //	4000
//        //	500
//        //	60
//        // 1
//        int result = 0;
//        while(n>0) {
//        int num = n % 10;  	//  4				5		   6
//        n/=10;              	//  65				6		   0
//        result = result*10+num;	// 0*10 + 4 = 4;    45	      456
//        }
//        return result;
//
//        }
//
//
//        ====================For_while_10=========================================
//
//        Write a Program to find the sum of natural numbers from 1 to 100.
//
//        INPUT      	:
//        OUTPUT 		:   Sum of Natural Numbers =
//        */
//
//        int sum = 0;
//        int i = 1;
//        while(i<=100) {
//        sum += i;
//        i++;
//        }
//
//        System.out.println("Sum of Natural Numbers "+ sum);
//        }
//
//
//
//
