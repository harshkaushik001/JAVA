import java.lang.Math;
import java.util.Scanner;
class Squarer{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double x;
        x=sc.nextDouble();
        double y;
        y=Math.sqrt(x);
        System.out.println("y= "+y);
    }
}