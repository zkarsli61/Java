package day19Loop;

public class StringManipulations {
    public static void main(String[] args) {
        String s1 = new String("pankaj");
        String s2 = new String("PANKAJ");
        System.out.println(s1 = s2);
//        System.out.println(reverseStatement("zafer gelsene buraya"));
        // System.out.println(isDigit(stn));
        // System.out.println(vowelConsonant(stp));
//        System.out.println(longestSubstring("abcdaklsmkekatlkestanxyzp"));
    }

// print name to the console
    public static void printName(String name) {
        name = name.trim();

        if (name.isBlank()) {
            System.out.println("Just space characters or nothing invalid");
            System.exit(0);
        }

        if (!name.contains(" ")) {
            System.out.println("Space is not used between first and last name");
            System.exit(0);
        }

        String first = name.substring(0, name.indexOf(" "));
        first = first.substring(0, 1).toUpperCase() + first.substring(1);
        String last = name.substring(name.lastIndexOf(" ") + 1);
        last = last.substring(0, 1).toUpperCase() + last.substring(1);

        System.out.println(first + " " + last);

    }
//		 1- reverses a String
    static String reverseStr (String s){
        String reverse="";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    //3- checks if a String contains only digits
    public static boolean isDigit(String s) {
//        boolean result = false;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                result = false;
                break;
//            }else {
//                result=true;
//            }
            }
        }
        return result;
    }

    //4-returns the number of vowels and consonants in a given String
    public static String vowelConsonant (String s){
        int v = 0;
        int c = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        return "The number of vowels is: " + v + " The number of consonants is: " + c;
    }

    //6- finds the length of the longest substring without repeating characters
    // abcdaklsmkekatlkestanxyzp -- abcd ,  aklsm  ,  ke  ,  katl  ,  kestanxyzp
    public static int longestSubstring (String s){
//        List<String> list = new ArrayList<>();
        String sub = "";
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!sub.contains("" + s.charAt(i))) {
                sub = sub + s.charAt(i);
            } else {
//                list.add(sub);
                System.out.println(sub);
                if (sub.length()>len)
                        len=sub.length();
                sub = "" + s.charAt(i); // reset word.
            }
        }
//        list.add(sub);
//        int len = 0;
//        for (String w : list) {
//            if (w.length() > len) {
//                len = w.length();
//            }
//        }
        return len;
    }

    // 7- reverses each word in a given sentence
    // without using any library method
    static String reverseStatement (String s){
        String[] words = s.split(" ");
        String reverse="";
        for (int i = words.length-1; i >=0 ; i--) {
            reverse+=words[i]+" ";
        }
        return reverse;

    }

    // 8- prints all permutations of a String

}

