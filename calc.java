import java.util.Scanner;
class clac{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER THE FIRST NUMBER");
        a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        b=sc.nextInt();
        int add=a+b;
        System.out.println("RESULT OF ADDITION==> "+add);
        int sub=a-b;
        System.out.println("RESULT OF SUBTRACTION==> "+sub);
        int div=a/b;
        System.out.println("RESULT OF DIVISION==> "+div);
        int mul=a*b;
        System.out.println("RESULT OF MULTIPLICATION==> "+mul);
        int mod=a%b;
        System.out.println("RESULT OF MODULUS==> "+mod);
    }
}