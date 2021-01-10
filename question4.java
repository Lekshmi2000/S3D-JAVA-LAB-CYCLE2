import java.util.Scanner;
public class question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		double l=sc.nextDouble();
		System.out.println("\nenter breadth:");
		double b=sc.nextDouble();
		Area obj=new Area(l,b);
		double area=obj.returnArea();
		System.out.println("area of rectangle="+area);
		
	}

}
class Area{
	double AREA;
	Area(double l,double b)
	{
		AREA=l*b;
	}
	double returnArea()
	{
		return AREA;
	}
}
