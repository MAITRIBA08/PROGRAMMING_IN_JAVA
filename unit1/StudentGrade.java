import java.until.Scanner;

class StudentGrade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter marks:");
		int marks=sc.nextInt();

		if(marks>=90)
		{
			System.out.println("Grade: A");
		}
		if(marks>=75&& marks<90)
		{
			System.out.println("Grade: B");
		}
		if(marks>=60&&marks<75)
		{
			System.out.println("Grade C");
		}
		if(marks>=40&&marks<60)
		{
			System.out.println("Grade D");
		}
		if(marks<40)
		{
			system.out.println("Result: Fail");
		}
		sc.close();
	}
}