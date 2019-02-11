package Solutions;

/*
*
* Question:
*
* A paragraph handler does divide a paragraph into different sentences on . ? and ! as delimiters and outputs a number
* which is the number of words in largest sentence. Write a efficient code for this handler.
*
* Input: "I am Sasank? And I am a hit Coder. Coding! is fun fun. and fun."
* Output: 6
*
* Calculation:
* Following are the sentences obtained after analysing:
* 1. I am Sasank --> (3 words)
* 2. And I am a hit coder --> (6 words)
* 3. Coding --> (1 word)
* 4. is fun fun --> (3 words)
* 5. and fun --> (2 words)
*
* */
import java.util.ArrayList;
import java.util.Collections;

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
