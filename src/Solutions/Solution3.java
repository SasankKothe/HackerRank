package Solutions;



/*
* Question:
*
* Consider a integer stack handler that does operations on a string which contains commands written as POP, +, -,
* <a number> and DUP. Consider the following input and output and gives the top element of the stack as output.
* Input: "13 10 DUP + - 14 POP 12 10"
* Output: 10
* Calculation:
*
* Input String: "13 10 DUP + - 14 POP 12 10"
*    -------------------------------
*  | Input to stack      | Stack    |
*  | -------------------------------
*  | 13                  | 13       |
*  | 10                  | 13 10    |
*  | DUP                 | 13 10 10 |
*  | +                   | 13 20    |
*  | -                   | 7        |
*  | 14                  | 33 14    |
*  | POP                 | 33       |
*  | 12                  | 33 12    |
*  | 10                  | 33 12 10 |
*  ----------------------------------
*/


import java.util.Stack;

/**
 * Created by sasank on 10.02.19.
 */
public class Solution3 {

    public int solution(String S) {
        // write your code in Java SE 8

        String[] splitS = S.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < splitS.length; i++) {

            String temp = splitS[i];

            if(temp.matches("-?\\d+"))
                stack.push(Integer.parseInt(temp));
            else if(temp.equals("DUP")) {
                int tempi = stack.pop();
                stack.push(tempi);
                stack.push(tempi);
            }
            else if(temp.equals("POP")) stack.pop();
            else if(temp.equals("+")) {
                if(stack.size() <= 1) continue;
                else {
                    int tempi = stack.pop();
                    int tempj = stack.pop();
                    stack.push(tempi + tempj);
                }
            }
            else {
                if(stack.size() <= 1) continue;
                else {
                    int tempi = stack.pop();
                    int tempj = stack.pop();
                    if (tempi > tempj) stack.push(tempi - tempj);
                    else stack.push(tempj - tempi);
                }
            }
        }

        if (stack.size() <= 1) return -1;
        else return stack.pop();
    }


    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution("5 - -"));
    }

}
