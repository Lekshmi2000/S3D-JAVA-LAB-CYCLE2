public class question1 {
public static void main(String[] args) {
	shapes values=new shapes();
	values.area(5,2);
	values.area(4.0);
}
}
class shapes
{
	void area(int x,int y)
	{
		System.out.println("AREA OF RECTANGLE="+(x*y));
	}
	void area(double x)
	{
		System.out.println("AREA OF CIRCLE="+(3.14*x*x));
	}
}
