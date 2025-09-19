import java.util.Scanner;
class Calc
{
	int sum,sub,mul,div,option,f,s;
	Scanner scan = new Scanner(System.in);
	public void Calc()
	{
		do
		{
			System.out.println("\n1. Addition 2. Substract 3. Multiplication 4. Division\n");
			System.out.print("Write the OPTION you want to choose :-");
			option=scan.nextInt();
			if(option>=1 && option<=4)
			{
				System.out.println("Write the FIRST Number :-");
				f=scan.nextInt();
				System.out.println("Write the SECOND Number :-");
				s=scan.nextInt();
				switch(option)
				{
					case 1 :
					{
						sum=f+s;
						System.out.println("RESULT :- "+sum);
						break;
					}
					case 2 :
					{
						sub=f-s;
						System.out.println("RESULT :- "+sub);
						break;
					}
					case 3 :
					{
						mul=f*s;
						System.out.println("RESULT :- "+mul);
						break;
					}
					case 4 :
					{
						div=f/s;
						System.out.println("RESULT :- "+div);
						break;
					}
				}
			}
			else
			{
				System.out.println("This OPTION is not in the Record...!");
			}
		}
		while(option!=0 && option<4);
	}
}
class Calculator
{
	public static void main(String[] args)
	{
		Calc c = new Calc();
		c.Calc();
	}
}