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

}
class Mother extends Son
{
	void car()
	{
		System.out.println("mother has her own car.");
	}
	public static void main(String Args[])
	{
		Son ob=new Son();
		ob.bike();
		ob.house();
		ob.car();
	}
}
