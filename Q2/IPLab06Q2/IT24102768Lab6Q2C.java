import java.util.Scanner;
public class IT24102768Lab6Q2C
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);


		System.out.println("Please enter 10 numbers:");

		System.out.print("Enter number 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		int num2 = input.nextInt();

		System.out.print("Enter number 3: ");
		int num3 = input.nextInt();

		System.out.print("Enter number 4: ");
		int num4 = input.nextInt();

		System.out.print("Enter number 5: ");
		int num5 = input.nextInt();

		System.out.print("Enter number 6: ");
		int num6 = input.nextInt();

		System.out.print("Enter number 7: ");
		int num7 = input.nextInt();

		System.out.print("Enter number 8: ");
		int num8 = input.nextInt();

		System.out.print("Enter number 9: ");
		int num9 = input.nextInt();

		System.out.print("Enter number 10: ");
		int num10 = input.nextInt();

		int num = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10);
		float avg = num/10;
			
		System.out.println("\nThe numbers you entered are:\n"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10);

		System.out.print("\nSum of the numbers: "+num);
		System.out.print("\nAvarage of the numbers: "+avg);
		
	}
}