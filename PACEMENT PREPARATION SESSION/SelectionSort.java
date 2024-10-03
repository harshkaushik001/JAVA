import java.util.Scanner;
class SelectionSort{
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
        int temp=0;
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}