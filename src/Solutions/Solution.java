package Solutions;

/**
 * Created by sasank on 10.02.19.
 */

/*
*
* Write a code that calculates a smallest array possible with the last element of the array as the input number with
* always the starting number to be 1 and outputs the lenght of the array. For example if the Array is 'A'. First element
* that is A[0] = 1 and the further
* elements are generated using either of the following operations:
* 1. A[i] = A[i-1] * 2
* 2. A[i] = A[i-1] + 1
*
 * Input: 18
 * Output: 6
 * Array: 1  2  4  8  9  18
* */

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
