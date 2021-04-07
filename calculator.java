import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, %): ");
        char ope = inp.next().charAt(0);
        double result;

        switch(ope)
        {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", num1, ope, num2, result);
    }
}
