import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name;
        try {
            name = br.readLine();
            System.out.println("Your name is: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
