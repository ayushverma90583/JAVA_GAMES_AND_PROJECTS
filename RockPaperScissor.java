import java.util.Scanner;
import java.util.Random;
class RockPaperScissor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int num1;
        System.out.println("\n<-----START THE GAME----->\n");
// Random number by the Computer
        System.out.print("Random Option By Computer :- ");
        num1=r.nextInt(3);
// Condtions by the ( if - else if - else ) Statements
// 0 = ROCK , 1 = PAPER , 2 = SCISSOR
        if(num1==0)
        {
            System.out.println("ROCK\n");
        }
        else if(num1==1)
        {
            System.out.println("PAPER\n");
        }
        else
        {
            System.out.println("SCISSOR\n");
        }
// Declaration of User and Takes Input...
        int num2;
        System.out.print("Users Turn  :- ");
        num2=scan.nextInt();
// Condtions by the ( if - else if - else ) Statements
        if(num2==5)
        {
            num2=r.nextInt(3);
            if(num2==0)
            {
                System.out.println("ROCK\n");
            }
            else if(num2==1)
            {
                System.out.println("PAPER\n");
            }
            else
            {
                System.out.println("SCISSOR\n");
            }
            scan.close();
//Final Condtions by the ( if - else if - else ) Statements , this Gives The Result to us...
            if(num1==0 && num2==2 || num1==1 && num2==0 || num1==2 && num2==1)
            {
                System.out.println("YOU LOOSE !");
            }
            else if(num1==0 && num2==1 || num1==1 && num2==2 || num1==2 && num2==0)
            {
                System.out.println("YOU WIN !");
            }
            else
            {
                System.out.println("EQUAL !");
            }
        }
        else
        {
            System.out.println("Please Click The \"START\" Button...");
        }
    }
}