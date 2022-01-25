package Questions;

public class RemoveExtraSpace {
	 //Write Java code to get rid of multiple spaces from a string
    //String given = "   Try    to       remove      extra   spaces  .   "
    //output; Try to remove extra spaces.
    public static void main(String[] args) {
//        String given = "   Try    to       remove      extra   spaces.   ";
 //       StringTokenizer strTkn = new StringTokenizer(given, " ");
//        StringBuffer sb = new StringBuffer();
//
//        while (strTkn.hasMoreElements()){
//            sb.append(strTkn.nextElement()).append(" ");
//        }
//        System.out.println("Given Sentence with Extra Space; " + given);
//        System.out.println("Removed Extra Spaces in Given Sentences; " + sb.toString().trim());
        // Option 2;
//        String given = "   Try    to       remove      extra   spaces.   ";
//        String output = given.trim().replaceAll("\\s+", " ");
//        System.out.println("Given Sentence with Extra Space; " + given);
//        System.out.println("Removed Extra Spaces in Given Sentences; " + output);
        // Option 3;
        String given = "   Try    to       remove      extra   spaces.   ";
        String output = given.replaceAll("( +)", " ");
        System.out.println("Given Sentence with Extra Space; " + given);
        System.out.println("Removed Extra Spaces in Given Sentences; " + output);
    }
}





