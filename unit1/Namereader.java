import java.lang.*;
import java.util.Scanner;

class Namereader
{
	public static void main(String args[])
	{
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your full Name: ");
		String fullName=scanner.nextLine();
		
		System.out.println("welcome to your java class"+fullName+"!");

		Scanner.close();
		
	}
}