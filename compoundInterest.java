import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt();

        double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

        System.out.println("\nPrincipal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time+"\n");
        System.out.println("Number of Time interest Compounded: " + number);
        System.out.println("\nCompound Interest: " + interest);
    }
}
