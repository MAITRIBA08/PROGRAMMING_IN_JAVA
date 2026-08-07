class Father
{
	void house()
	{
		System.out.println("father house");
	}	
}
class Son extends Father
{
	void bike()
	{
		System.out.println("its my bike");
	}
	public static void main(String Args[])
	{
		Son ob=new Son();
		ob.house();
		ob.bike();
	}
	
}
class Mother extends Father
{
	void car()
	{
		System.out.println("mother has her own car.");
	}
	public static void main(String Args[])
	{
		Mother ob=new Mother();
		ob.house();
		ob.car();
	}
}