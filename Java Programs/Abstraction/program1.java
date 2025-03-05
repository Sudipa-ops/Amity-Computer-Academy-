abstract class A
{
	abstract void show();
	void view()
	{
		System.out.println("Hello view");
	}	
}
class B extends A
{
		void show()
	{
		System.out.println("Hello Show");
	}	
}
class Main
{
	public static void main(String []args)
	{
	B ob=new B();
	ob.show();
	ob.view();
	}
}