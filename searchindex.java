import java.util.Scanner;
class searchindex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int x[]=new int[10];
        System.out.println("START ENTERING THE VALUES");
        for(int i=0;i<10;i++){
            x[i]=sc.nextInt();
        }
        System.out.println("Enter the number whose index number you want");
        int y=sc.nextInt();
        for(int i=0;i<10;i++){
            if(x[i]==y){

                System.out.println("index number of the given number is==> "+i);
            }
        }

    }
}
