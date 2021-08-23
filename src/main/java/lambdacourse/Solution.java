package lambdacourse;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

interface Operation {
    boolean test(int a);
}

class OperationBody {
//    public static boolean checker(Operation p, int num) {return p.test(num);}
    Operation isOdd() {return x->x % 2 == 1;}
    Operation isPrime (){return p -> {if(p<3)return true;
            if((p % 2)==0)return false;
            for(int i=3;i<Math.sqrt(p);i+=2)
                if((p % i)==0)
                    return false;
            return true;};}
    Operation isPalindrome () {return a -> Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        Operation op;
        OperationBody opBody = new OperationBody();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = opBody.isOdd();
                ret = op.test(num);
//                ret = opBody.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = opBody.isPrime();
                ret = op.test(num);
                //ret = opBody.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = opBody.isPalindrome();
                //ret = opBody.checker(op, num);
                ret = op.test(num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }

}
