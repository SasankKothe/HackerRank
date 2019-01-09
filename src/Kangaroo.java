/**
 * Created by sasank on 11.05.18.
 */
import java.util.*;
import java.util.concurrent.TimeoutException;

public class Kangaroo extends Exception {

    static String kangaroo(int x1, int v1, int x2, int v2) throws TimeoutException {
        // Complete this function
        String returnString = "";
        if (v2 >= v1) {
            if(x2>=x1) returnString = "NO";
        } else {
            for (int i = 1; ; i++) {

                x1 = x1 + v1;
                x2 = x2 + v2;
                if(x1 == x2) {
                    returnString = "YES";
                    break;
                }
            }
        }
        return returnString;
    }

    public static void main(String[] args) throws TimeoutException{
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}