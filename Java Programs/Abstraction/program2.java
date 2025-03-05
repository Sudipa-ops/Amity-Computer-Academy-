abstract class RBI
{
	abstract void roi();
}
class SBI extends RBI
{
		void roi()
	{
		System.out.println("5% of RBI");
	}	
}
class UBI extends RBI
{
		void roi()
	{
		System.out.println("7% of RBI");
	}	
}
class HDFC extends RBI
{
		void roi()
	{
		System.out.println("10% of RBI");
	}	
}
class Main
{
	public static void main(String []args)
	{
		SBI ob1=new SBI();
		UBI ob2=new UBI();
		HDFC ob3=new HDFC();
		ob1.roi();
		ob2.roi();
		ob3.roi();
	}
}