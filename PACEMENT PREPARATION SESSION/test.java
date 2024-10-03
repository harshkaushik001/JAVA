import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUMBER");
        System.out.println("ENTER THE 2ND NUMBER");
        int a=sc.nextInt();
        
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("SUM OF THE NUMBERS IS => "+sum);
    }
}
