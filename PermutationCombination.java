// Java program to calculate Permutation and Combination of 2 numbers.
//nPr = n!/(n-r)!
//nCr = nPr/r! or n!/((n-r)! * r!);
import java.util.Scanner;
public class PermutationCombination {
    static int fact(int num)
    {
        //Iterative method
        // int fact = 1, i;
        // for(i = 1; i <= num; i++)
        // {
        //     fact = fact * i;
        // }
        // return fact;

        //recursive method
        if(num == 1)
            return 1;
        int op = fact(num - 1) * num;
        return op;
    }
    public static void main(String[] args) {
        int n, r;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = inp.nextInt();
        System.out.print("Enter value of r: ");
        r = inp.nextInt();

        //nCr & nPr of a number
        int nPr = (fact(n)/(fact(n-r)));
        int nCr = (fact(n) / (fact(n-r) * fact(r)));

        System.out.println("nCr: " + nCr);
        System.out.println("nPr: " + nPr);
    }
}
