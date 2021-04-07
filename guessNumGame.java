/*
    Create a class Game, which allows a user to play "Guess the Number"
    game once.
*/
import java.util.Random;
import java.util.Scanner;

class Game{
    public int num; //number to guess
    public int inputNum; //user inputed number
    public int noOfGuesses = 0;

    Game(){ //constructor to generate random number upto 100
        Random rand = new Random();
        this.num = rand.nextInt(100);
        // System.out.println("NUMBER: "+num);
    }
    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNum==num){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", num, noOfGuesses);
            return true;
        }
        else if(inputNum<num){
            System.out.println("Too low...");
        }
        else if(inputNum>num){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class guessNumGame {
    public static void main(String[] args) {
        Game g = new Game(); //Game object
        boolean res= false;

        while(!res){ //repeat until user inputs correct number
        g.takeUserInput();
        res = g.isCorrectNumber();
        }

    }
}
