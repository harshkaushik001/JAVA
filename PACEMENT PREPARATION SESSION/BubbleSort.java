import java.util.Scanner;
class BubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Start size of array ");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Start entering the numbers");
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<size;i++){
            boolean f=true;
            for(int j=1;j<size;j++){
                temp=0;
                if(arr[j-1]>arr[j]){
                
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    
                    
                }
                else{
                    f=false;
                }
                if(f==false){
                    break;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}