
import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[] args){

//Here we will declare our strings and integers

        int myNum;
        String paper;
        String rock;
        String scissors;

//Here we will create a random generator for the computer's choice

        Random rand = new Random();
        int comNum = rand.nextInt(3);

//Here we will create our scanner in order to get input from user


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissors, 1 for rock, and 2 for paper: ");
        myNum = input.nextInt();


        while(myNum < 0 || myNum > 2){
            System.out.println("Please enter a valid number: ");
            myNum = input.nextInt();

        }

//Here we will determine what each number will be for the user

        String myStr = "myNum";
        if (myNum == 0)
            myStr = "scissors";
        else if (myNum == 1)
            myStr = "rock";
        else if (myNum == 2)
            myStr = "paper";

//Here we determine what each number will mean for the computer

        String comStr = "comNum";
        if (comNum == 0)
            comStr = "scissors";
        else if (comNum == 1)
            comStr = "rock";
        else if (comNum == 2)
            comStr = "paper";

//Here we will determine the winner and get an output

        if (comNum == myNum)
            System.out.print("The computer is " + comStr + ", you are " + myStr + ", it's a tie!\n");
        else if (comNum == 1 && myNum == 0 || comNum == 2 && myNum == 1 || comNum == 0 && myNum == 2)
            System.out.print("The computer is " + comStr + ", you are " + myStr + ", computer won!\n");
        else
            System.out.print("The computer is " + comStr + ", you are " + myStr + ", you won!\n");


    }
}