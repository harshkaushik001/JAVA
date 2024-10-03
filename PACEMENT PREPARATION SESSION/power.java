import java.util.Scanner;
public class power{
    public static void main(String args[]){

        System.out.println("Enter the number to be checked");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int c=0;
        while(b!=0){
            c=b%2;
            b=c;
            if(c==0){
                continue;
            }
            else{
                break;
            }
        }
        boolean x;
        if(c==0){
            x=true;
            System.out.println("number is power of 2");
        }
        else{
            x=false;
            System.out.println("number is not power of 2");
        }
    }
}