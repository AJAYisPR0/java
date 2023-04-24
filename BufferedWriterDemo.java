import java.io.*;

public class BufferedWriterDemo {

    public static void main(String args[]) {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            writer.write("Hello, Gais");
            writer.flush();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
