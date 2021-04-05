// Simpe Banking management system program in Java
/*
    It'll have following menu:
        -Display All
        -Search By Account
        -Deposit
        -Withdrawal
        -Exit

    -Initially we'll add some n customers to the bank
        user input: Account number, Name, Balance
    -Then show menu to the user
*/

import java.util.Scanner;
class Bank{

    String accNo;
    String name;
    long balance;

    Scanner inp = new Scanner(System.in);
    //method to open account
    void openAccount(){
        System.out.print("Enter Account Number: ");
        accNo = inp.next();
        System.out.print("Enter Name: ");
        name = inp.next();
        System.out.print("Enter Balance: ");
        balance = inp.nextLong();
        System.out.print("\n");
    }

    //method to display all accounts
    void displayAccount(int i){
        System.out.println("Customer "+i+":");
        System.out.println("Name: "+name+"\t| Account Number: "+accNo+"\t| Balance: "+balance+"\n");
    }

    void displayAccount(){
        System.out.println("Name: "+name+"\t| Account Number: "+accNo+"\t| Balance: "+balance+"\n");
    }
    //method to search account by account number acn
    boolean searchAc(String acn){
        if(accNo.equals(acn)){
            System.out.print("Account Found: ");
            displayAccount();
            return true;
        }
        return false;
    }

    //method to deposit amount
    void deposit(){
        long amnt;
        System.out.print("Enter Amount You Want to Deposit : ");
        amnt = inp.nextLong();
        balance = balance + amnt;
    }

    //method to withdraw amount
    void withdrawal(){
        long amnt;
        System.out.print("Enter Amount U Want to withdraw : ");
        amnt = inp.nextLong();
        if (balance >= amnt) {
            balance = balance - amnt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Create accounts
        System.out.print("Enter number of customers: ");
        int n = inp.nextInt();
        System.out.print("\n");
        Bank acc[] = new Bank[n]; //array of objects

        for(int i = 0; i < acc.length; i++){
            acc[i] = new Bank(); //Instantiate the array of objects
            acc[i].openAccount();
        }

        //Loop for menu
        int ope;
        do{
            System.out.println("*** Main Menu ***");
            System.out.println("1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
            System.out.print("Enter Your Choice: ");
            ope = inp.nextInt();
            System.out.print("\n");
            switch(ope){
                case 1:
                    for(int i = 0; i<acc.length; i++){
                        acc[i].displayAccount(i+1);
                    }
                
                case 2:
                    System.out.print("Enter Account Number to Search: ");
                    String acn = inp.next();
                    System.out.print("\n");
                    boolean foundAc = false;
                    for(int i = 0; i < acc.length; i++){
                        foundAc = acc[i].searchAc(acn);
                        if(foundAc){
                            break;
                        }
                    }
                    if(!foundAc){
                        System.out.println("Account Does Not Exist...\n");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter Account Number to Deposit Amount: ");
                    acn = inp.next();
                    foundAc = false;
                    for(int i = 0; i < acc.length; i++){
                        foundAc = acc[i].searchAc(acn);
                        if(foundAc){
                            acc[i].deposit();
                            break;
                        }
                        if(!foundAc){
                            System.out.println("Search Failed! Account Does Not Exist...\n");
                        }
                    }
                    break;

                case 4:
                System.out.print("Enter Account Number to Deposit Amount: ");
                acn = inp.next();
                foundAc = false;
                for(int i = 0; i < acc.length; i++){
                    foundAc = acc[i].searchAc(acn);
                    if(foundAc){
                        acc[i].withdrawal();
                        break;
                    }
                    if(!foundAc){
                        System.out.println("Search Failed! Account Does Not Exist...\n");
                    }
                }
                    break;

                case 5:
                    System.out.println("Thank You :)");
                    break;
            }
        }while(ope != 5);
    }
}