import java.util.Scanner;
public class PalindromString{

    public boolean checkPalindrom(String str){
        String oriStr = str;
        String revStr = "";

        for(int i=str.length(); i>0; i--){
            revStr = revStr + str.charAt(i-1);
        }

        return (oriStr.equals(revStr));
    }

    public static void main(String[] args) {
        PalindromString checkPan = new PalindromString();

        Scanner strIn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = strIn.nextLine();

        boolean result = checkPan.checkPalindrom(str);

        if(result){
            System.out.print("String "+str+" is Palindrome.");
        }
        else{
            System.out.print("String "+str+" is not a Palindrome.");
        }
    }
}
