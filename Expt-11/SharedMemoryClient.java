import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SharedMemoryClient {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("Localhost", 2000);
        BufferedReader sin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream sout = new PrintStream(sk.getOutputStream());
        Scanner stdin = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("Type show");
            System.out.println("Client: ");
            s = stdin.nextLine();
            sout.println(s);
            s = sin.readLine();
            System.out.println("Answer" + s);
        }
    }
}
