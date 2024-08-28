import java.util.Scanner;
public class IT24102768Lab6Q2B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num,count,sum;
		count = 1;
		num = 0;
		sum  = 0;

		System.out.println("Please enter 10 numbers");

		while(count<=10)
		{
			System.out.print("\nEnter number "+count+": ");
			num = input.nextInt();
			count = count + 1;

		}
		
		System.out.println("The numbers you entered are: ");
			System.out.print(num + " ");			
	}
}