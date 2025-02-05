import java.rmi.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String args[]) {
        try {
            Scanner sc= new Scanner(System.in);
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println("==============Performed By Moin MN (211P030)=====================");
            System.out.println("Enter 1st Number: ");
            int a=sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b=sc.nextInt();
            System.out.print("Addition of two numbers are => ");
            System.out.println(stub.add(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}