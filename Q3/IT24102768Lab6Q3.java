import java.util.Scanner;
public class IT24102768Lab6Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int count=0;
		int sum=0;
		
		System.out.println("Enter positive integers (terminate input with -99):");

		while (true)
		{
			System.out.print("Enter a number: ");
			int no = input.nextInt();
			sum += Math.pow(no,2);
			count = count + 1;
			


			if(no==-99)
			{
				break;
			}
			
			if(no<0)
			{
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");

			}
			else
			{
				continue;
				
			}
			

		}

		int PO_W = (sum - (-99*-99));
		int N_count = (count-1);
		int MS = PO_W /N_count;
		double RMS = Math.sqrt(MS);

		System.out.println("\nThe Root Mean Square (RMS) is: "+RMS);


	}
}

