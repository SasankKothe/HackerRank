package Solutions;

import sun.text.resources.lt.CollationData_lt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

/**
 * Created by sasank on 10.02.19.
 */
public class Solution2 {


    public int solution(String S) {
        // write your code in Java SE 8
        ArrayList<Integer> words = new ArrayList<>();

        String[] splitS = S.split("[.?!]");

        for (int i = 0; i < splitS.length; i++) {
            if(splitS[i].startsWith(" ")) {
                words.add(splitS[i].split("\\s+").length - 1);
            }
            else {
                words.add(splitS[i].split("\\s+ ").length);
            }
        }
            return Collections.max(words);

        }


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("Forget  CVs..Save time . x x"));
    }
}
