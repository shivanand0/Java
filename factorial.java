//Java program to calculate a Factorial of a number.
import java.util.Scanner;
public class factorial {
    static int fact(int n)
    {
        if(n==1)
            return 1;
        int op = fact(n-1) * n;
        return op;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = inp.nextInt();

        int factorialIs = fact(num);
        System.out.println("Factorial of number " + num + " is: "+factorialIs);
    }
}
