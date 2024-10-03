import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size=sc.nextInt();
        System.out.println("START ENTERING THE ELEMENTS");
        int x[]=new int[size];
        int count,pr=0,a,b,rem;
        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
            b=x[i];
            count=0;
            for(int j=1;j<=b;j++){
                rem=b%j;

                if(rem==0){
                    count++;
                }
            }
            if(count==2){
                pr++;
            }
        }
        System.out.println();
        System.out.println("There are "+pr+" prime numbers in the array");
        System.out.println();
        int k=0;
        int y[]=new int[pr];
        for(int i=0;i<size;i++){
            count=0;
            for(int j=1;j<=x[i];j++){
                a=x[i];
                rem=a%j;
                if(rem==0){
                    count++;
                }
            }
            if(count==2){
                y[k]=x[i];
                k++;
            }
        }
        System.out.println("ORIGINAL ARRAY :: ");
        for(int i=0;i<size;i++){
            System.out.println(x[i]);
        }
        System.out.println();
        System.out.println("ARRAY OF PRIME NUMBERS :: ");
        for(int i=0;i<pr;i++){
            System.out.println(y[i]);
        }
    }
}

        