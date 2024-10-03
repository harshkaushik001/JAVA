import java.util.Scanner;
class search_zero{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Start entering the elements : ");
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        int arr1[]=new int[size];
        for(int i=0;i<count;i++){
            arr1[i]=0;
        }

        for(int i=0;i<size;i++){
            if(arr[i]==0){
                continue;
            }
            else{
            arr1[count]=arr[i];
            }
           
        }

        for(int i=0;i<size;i++){
            System.out.print(arr1[i]);
        }
    }
}