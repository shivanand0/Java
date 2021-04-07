import java.util.Scanner;
public class reverseNum {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = inp.nextInt();
        System.out.println("Entered number: "+num);

        int revNum = 0;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            revNum = revNum*10+rem;
            num = num/10;
            sum = sum+rem;
        }

        System.out.println("Reversed Number: "+revNum);
        System.out.println("Sum: "+sum);
    }
}
