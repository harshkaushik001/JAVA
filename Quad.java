//practical 2 question 1
import java.lang.Math;
import java.util.Scanner;
class Quad
{
	public static void main(String[] args)
	{
		double a,b,c,d,x1,x2;
		Scanner sn=new Scanner(System.in);
		System.out.print("enter a value= ");
		a=sn.nextDouble();
		System.out.print("enter b value=");
		b=sn.nextDouble();
		System.out.print("enter c value=");
		c=sn.nextDouble();

		d=((b*b)-4*a*c);


		if(d==0.0)
		{
			x1=-b/2*a;
			System.out.println("\nroot="+x1);
		}
		else if(d>0.0)
		{
			x1=-b+Math.sqrt((b*b)-4*a*c)/2*a;
            x2=-b-Math.sqrt((b*b)-4*a*c)/2*a;
            System.out.println("root 1="+x1+"root 2="+x2);
		}
		else
		{
			System.out.println("ROOTS ARE NOT REAL");
		}

	}
}
