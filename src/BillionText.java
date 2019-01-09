import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class BillionText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("primenumbers.txt", "UTF-8");
            for (int i = 0; i < 1000000000; i++) {
                pw.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
