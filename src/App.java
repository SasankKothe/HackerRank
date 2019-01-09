import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static long count = 0L;
    static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) { ++count; return true;}
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        ++count;
        return true;
    }
    public static void main( String[] args )
    {
        for (long i = 1; i < 1000; i++) {
            isPrime(i);
        }
        File file = new File("/Users/sasank/Desktop/Hackerrank/src/output.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.write(""+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}


