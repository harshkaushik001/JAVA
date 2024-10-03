import java.util.Scanner;
class sumofarray {
   static int x[] = new int[5];

    
    static int sum()
    {
        int sum = 0; 

        for (int i = 0; i<5; i++)
            sum =sum+ x[i];

        return sum;
    }

    
    static int alternatesum(){
        int alt=0;
        for(int i=0;i<5;i++){
            if(i%2==0){
                alt=alt+x[i];
            }
        }
        return alt;
    }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("START ENTERING THE VALUES ");
        for(int i=0;i<5;i++){
        x[i]=sc.nextInt();
        }
        System.out.println("Sum of given array is "   + sum());
        System.out.println("Sum of given array is "   + alternatesum());
    }
}