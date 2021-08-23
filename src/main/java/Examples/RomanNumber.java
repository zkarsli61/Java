package Examples;

import java.util.ArrayList;

public class RomanNumber {
    public static void main(String[] args) {
//        System.out.println(romanNumbers(874));
         System.out.println(fromRomans("MDCLXXIV"));
        System.out.println(convertRomans("MDCLXXIV"));
   }
    static String romanNumbers(int a) {
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        String s = "";
        while (a > 0) {
            n = a % 10;
            list.add(n);
            a = a / 10;
        }
        if (list.size() == 3) {
            s = hundreds[list.get(2)] + tens[list.get(1)] + ones[list.get(0)];
        } else if (list.size() == 2) {
            s = tens[list.get(1)] + ones[list.get(0)];
        } else if (list.size() == 1) {
            s = ones[list.get(0)];
        }
        return s;
    }
    static int fromRomans(String s) {
        int h = 0;
        int t = 0;
        int o = 0;
        String f = "";
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        for (int i = 0; i < 10; i++) {
            if (i == 5 && h == 4) {
                continue;
            }
            if (s.startsWith(hundreds[i])) {
                h = i;
                f = hundreds[i];
            }
        }
        s = s.replaceFirst(f, "");
        for (int i = 0; i < 10; i++) {
            if (i == 5 && o == 4) {
                continue;
            }
            if (s.endsWith(ones[i])) {
                o=i;
                f=ones[i];
            }
        }
        s=s.replaceFirst(f, "");
        for (int i=0; i<10; i++) {
            if (i==5 && t==4) {
                continue;
            }
            if (s.contains(tens[i])) {
                t=i;
                f=tens[i];
            }
        }
        s=s.replaceFirst(f, "");
        return h*100+t*10+o;
    }
    static int convertRomans(String s) {
        int sum=0;
        // In the first loop we are checking and adding the values of ascending numbers (the ones in the brackets in the example),
        // after using those, we remove them from String because they are useless.

        for(int i=0; i<s.length()-1; i++) {
            System.out.println(s+" "+s.charAt(i)+"-"+s.charAt(i+1));
            if(valueOf(s.charAt(i))<valueOf(s.charAt(i+1))) {
                System.out.println(s+"*"+s.charAt(i)+"-"+s.charAt(i+1));
                sum+=valueOf(s.charAt(i+1))-valueOf(s.charAt(i));
                System.out.println(sum+" "+valueOf(s.charAt(i+1))+" "+valueOf(s.charAt(i)));
                s=s.replace(s.substring(i, i+2), "");
                i--; // when we remove two characters from String, we adjust the index not to miss any any char.
            }
        }
		/* After removing the annoying characters(ascending numerals), we have the regular characters which are in descending order.
		   With the for loop we add the values to our 'sum' container. */
        for(int i=0; i<s.length(); i++) {
            sum+=valueOf(s.charAt(i));
        }
        return sum;
    }
    // assign the values for each character of Roman numerals
    static int valueOf(char a) {
        if(a=='I') return 1;
        if(a=='V') return 5;
        if(a=='X') return 10;
        if(a=='L') return 50;
        if(a=='C') return 100;
        if(a=='D') return 500;
        if(a=='M') return 1000;
        return 0;
    }
}
