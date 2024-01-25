package rps;
import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
       
        char user_choice;
        char computer_choice;
        char game[] = {'p', 'r', 's'};
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Welcome to the Game");
        System.out.println("Computer is guessing, you guess (Paper, Rock, scissor) ");
        computer_choice = game[rd.nextInt(3)];
        System.out.println("Type P for paper, R for Rock or S for Scissor");
        user_choice = sc.next().charAt(0);
        System.out.println("computer_choice = "+ computer_choice);
        if (user_choice == computer_choice)
        {
            System.out.println("Equal");
        }
        else if(user_choice == 'p' && computer_choice == 'r')
        {
            System.out.println("You Win");
        }
        else if(user_choice == 'p' && computer_choice == 's')
        {
            System.out.println("You Lost");
        }
        else if(user_choice == 's' && computer_choice == 'r')
        {
            System.out.println("You Lost");
        }
       else if(user_choice == 's' && computer_choice == 'p')
        {
            System.out.println("You Win");
        }
       else if(user_choice == 'r' && computer_choice == 's')
        {
            System.out.println("You Win");
        }
       else if(user_choice == 'r' && computer_choice == 'p')
        {
            System.out.println("You Win");
        }
       else {
           System.out.println("Invalid Input");
       }
    }}