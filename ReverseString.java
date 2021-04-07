import java.util.Scanner;
public class ReverseString {

    static String reverseString(String str){ //method of reversing string
        String revStr = "";
        for(int i=str.length(); i>0; i--){
            revStr = revStr + str.charAt(i-1);
        }
        return revStr;
    }
    public static void main(String[] args) {
        ReverseString rev = new ReverseString();

        Scanner str = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String oriStr = str.nextLine();

        String revStr = rev.reverseString(oriStr);
        System.out.print("Reversed String is: " + revStr);
    }
}
