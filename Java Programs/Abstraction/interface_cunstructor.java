interface  Shape
{
	 void area();
}
class Rectangle implements Shape
{
	int x1,y1,a1;
	Rectangle(int x1,int y1)
	{
		a1=x1*y1;
	}
	public	void area()
	{
		System.out.println(a1);
	}	
}
class Circle implements Shape
{
	int x2;
	float y2,a2;
	Circle(int x2,float y2)
	{
		a2=y2*(x2*x2);
	}
	public	void area()
	{
		System.out.println(a2);
	}	
}
class Square implements Shape
{
	int x3,a3;
	Square(int x3)
	{
		a3=x3*x3;
	}
	public	void area()
	{
		System.out.println(a3);
	}	
}
class Main
{
	public static void main(String []args)
	{
		Shape s1=new Rectangle(10,20);
			s1.area();
		 s1=new Circle(10,3.14f);
			s1.area();
		 s1=new Square(10);
			s1.area();
	}
}