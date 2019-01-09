import java.util.Scanner;

/**
 * Created by sasank on 10.05.18.
 */
public class LoopII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            solveProblem(a,b,n);
        }
    }

    private static void solveProblem(int a, int b, int n) {
        int ini = (int) (a + Math.pow(2,0) * b);
        for (int i = 1; i < n+1; i++) {
            System.out.print(ini+" ");
             ini =(int) (ini + Math.pow(2,i) * b);
        }
        System.out.println();
    }
}
