//Java program to print FIbonacci series upto n numbers
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n, t1=0, t2=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = inp.nextInt();

        System.out.println("Upto " + n + ": ");
        while(t1 <= n)
        {
            System.out.print(t1 + "\t");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
