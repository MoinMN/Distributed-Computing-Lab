import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SharedMemory {
    static int a = 50;
    static int count = 0;

    public static int getA(PrintStream cout) {
        count++;
        cout.println(a);
        return a;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        while (true) {
            Socket sk = ss.accept();
            BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            PrintStream cout = new PrintStream(sk.getOutputStream());
            System.out.println("Client from " + sk.getInetAddress().getHostAddress() + " Accepted");
            String s = cin.readLine();
            if (s.equalsIgnoreCase("show")) {
                getA(cout);
            } else {
                cout.println("Check syntax");
                // break;
            }
            System.out.println("Client count" + count);
        }
    }
}
