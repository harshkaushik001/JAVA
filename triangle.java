import java.util.Scanner;
class triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(i);

            }
            System.out.println();
        }
    }
}