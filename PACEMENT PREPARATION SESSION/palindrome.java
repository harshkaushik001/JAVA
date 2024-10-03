import java.util.Scanner;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int temp=a;
        int b,sum=0;
        while(temp!=0){
        b=temp%10;
        temp=temp/10;
        sum=(sum*10)+b;
    }
         if(sum==a){
        System.out.println("Number is palindrome");
    }
        else{
        System.out.println("Number is not palindrome");
    }

    }
}