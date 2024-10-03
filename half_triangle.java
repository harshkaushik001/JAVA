import java.util.Scanner;
class half_triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int a=sc.nextInt();
        for (int i= 0; i<= a; i++)
        {
            for (int j=1; j<=a-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("$");
            } 
            System.out.println("");
        }
    }
}