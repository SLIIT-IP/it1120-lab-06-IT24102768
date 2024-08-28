import java.util.Scanner;
public class IT24102768Lab6Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		float S_QR,S_QRT;
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		S_QR = (float)Math.pow(num,2);
		S_QRT = (float)Math.sqrt(num);

		System.out.print("\nThe square of "+(float)num+" is : "+S_QR);
		System.out.print("\nThe square root of "+(float)num+" is : "+S_QRT);
		
	}



}