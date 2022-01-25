package Questions;

public class Q1 {

	public static void main(String[] args) {
		/*
        1)toUppercase()  2)toLowercase()  3)contains()  4)charAt()  5)next()  6)nextLine() 
        7)equals()    8) equalIgnoreCse()   9)indexOf()   10)length()  11)lastIndex()  
        */
       
    String str1 = "Learn coding by typing";
   //12 startswith() is used for to check if this String starts with the specific prefix
    //startswith()  can be used with only String. We can't use it with char
    //startswith() can be used with more than one characters
    //startswith()  returns boolean
    
    
   System.out.println(str1.startsWith("L"));//true
   System.out.println(str1.startsWith("l"));//false
   System.out.println(str1.startsWith("Le"));//true
   System.out.println(str1.startsWith("c",6));//true
   System.out.println(str1.startsWith("by", 13));//true
   System.out.println(str1.startsWith("typ",16));
   
   //13 endswith() is used for to check if this String ends with the specific suffix
        //endswith()  can be used with only String. We can't use it with char
        //endswith() can be used with more than one characters
        //endswith()  returns boolean
   System.out.println(str1.endsWith("g"));//true
   System.out.println(str1.endsWith("n"));//false
   System.out.println(str1.endsWith("ping"));//true
   
   //14 )isEmpty() returns boolean , true means the length of the String is equal to 0
   System.out.println(str1.isEmpty());//false
   String s = "";
   System.out.println(s.isEmpty());//true
   
   //15) replace() 
   // to replace all occurrences of a specific character I can use replace()
   String str2 = "Java is easy";
   System.out.println(str2.replace("a", "e"));//Jeve is eesy
   System.out.println(str2);//Java is easy
   System.out.println(str2.replace("a", "??????"));//J??????v?????? is e??????sy
   System.out.println(str2.replace("a", str2));//JJava is easyvJava is easy is eJava is easysy
   //How can I delete all "a" ? 
   System.out.println(str2.replace("a", ""));//Jv is esy
   //How can I put ! before and after each character ? 
   System.out.println(str2.replace("", "!"));//!J!a!v!a! !i!s! !e!a!s!y!
   System.out.println(str2.replace('a', 'e'));//Jeve is eesy
   
   
   //16) replaceAll()
   // replaceAll() and replace() does the same thing
   // But there are some differences : 1) In replaceAll() you cannot use chars 
                                   //  2) In replaceAll() you can use regular expressions
   
   
   String str3 = "Teach_more, learn123 more!!!  ..";
   
    /* Regular Expressions ==>  
     *1) \\s: space character
      2) \\S: all characters except space character
      3) \\w: a->z  A->Z _    0->9
      4) \\W: All characters except a->z    A->Z _    0->9
      5) \\d: 0 -> 9
      6) \\D: All characters except 0 -> 9
*/
   //\\s: space character :
   System.out.println(str3.replaceAll("\\s", "*"));// Teach_more,*learn123*more!!!**..
   //\\S: all characters except space character
   System.out.println(str3.replaceAll("\\S", "*"));// *********** ******** *******  **
   //\\w: a->z  A->Z _    0->9
   System.out.println(str3.replaceAll("\\w", "&"));// &&&&&&&&&&, &&&&&&&& &&&&!!!  ..
   //\\W: All characters except a->z    A->Z _    0->9
   System.out.println(str3.replaceAll("\\W", "%"));// Teach_more%%learn123%more%%%%%%%
   //\\d: 0 -> 9
   System.out.println(str3.replaceAll("\\d", "+"));// Teach_more, learn+++ more!!!  ..
   //\\D: All characters except 0 -> 9
   System.out.println(str3.replaceAll("\\D", "*"));// *****************123************
   
   //17) replaceFirst()
   // replaceFirst() changes just the first occurrance of the character
   System.out.println(str3.replaceFirst("a", "e")); //Teech_more, learn123 more!!!  ..
       
   }
}








