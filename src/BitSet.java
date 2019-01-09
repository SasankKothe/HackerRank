import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by sasank on 10.05.18.
 */


public class BitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashSet<Boolean>[] b = new HashSet[2];
        for (int i = 0; i <b.length ; i++) {
            b[i] = new HashSet<Boolean>();
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < input.charAt(0) ; j++) {
                b[i].add(false);
            }
        }
        System.out.println(b.toString());
    }
}