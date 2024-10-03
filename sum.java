import java.util.Scanner;
class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size=sc.nextInt();
        System.out.println("START ENTERING THE ELEMENTS");
        int x[]=new int[size];
        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
        if(i%2!=0){
        sum=sum+x[i];
        }
        else{
        continue;
        }
        }
        System.out.println("Sum of the alternate numbers in the array is==> "+sum);
    }
}