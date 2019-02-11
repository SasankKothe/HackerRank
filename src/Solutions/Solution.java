package Solutions;

/**
 * Created by sasank on 10.02.19.
 */
public class Solution {

    public Solution () {}

    public int solution(int N) {
        // write your code in Java SE 8

        int size = 1;
        int i = N;
        while(i != 1) {
            if(i % 2 == 0) {
                i = i / 2;
                ++size;
            } else {
                --i;
                ++size;
            }
        }

     return size;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(18));
    }


}
