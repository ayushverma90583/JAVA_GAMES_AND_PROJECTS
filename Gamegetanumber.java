import java.util.Scanner;
import java.util.Random;
class Getanumber
{
    int usersinput ;
    int Computernumber ;
    int Chances = 0;
    Getanumber()
    {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\n<-----START THE GAME----->\n");
// Set the random Number from 1 - 100 By the Computer...
        Computernumber=r.nextInt(100);

        // We dont need to print the Computers Input Because It makes GAME Complex...
        //System.out.println("Computers Input :- "+Computernumber);

// Do-While loop for Continuing the Statements And The Functions...
        do
        {
// Users Input
            System.out.print("Enter The Number :- ");
            usersinput=scan.nextInt();
// Condtions by the ( if - else if - else ) Statements
            if(usersinput<Computernumber)
            {
                System.out.println(usersinput+" is Lesser then Computer Input...\n");
                Chances=Chances+1;
            }
            else if(usersinput>Computernumber)
            {
                System.out.println(usersinput+" is More then Computer Input...\n");   
                Chances=Chances+1;
            }
            else if(usersinput==Computernumber)
            {
                System.out.println("\nYOU WIN ! , Yours Number Is Equalls To The Computers Input...");
                System.out.println("YOU TAKES "+Chances+" Chances To WIN The Game...");
            }
        }
// Here Do-While loop ends where we put the conditions in while statement...
        while(usersinput!=Computernumber);
        scan.close();
    }
    public void thanks()
    {
        System.out.println("\n\nThanks for Playing the game...\n");
    }
}
class Gamegetanumber
{
    public static void main(String[] args)
    {
        Getanumber game = new Getanumber();
        game.thanks();
    }
}