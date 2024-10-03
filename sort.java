import java.util.Scanner;
class sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size=sc.nextInt();
        System.out.println("START ENTERING THE ELEMENTS");
        int x[]=new int[size];
        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(x[j]>x[i]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("SORTED ARRAY IN DECENDING ORDER IS AS FOLLOWS :: ");
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.println(x[i]);
        }
        System.out.println();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(x[j]<x[i]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY IN ASCENDING ORDER IS AS FOLLOWS :: ");
        for(int i=0;i<size;i++){
            System.out.println(x[i]);
        }
    }
}
