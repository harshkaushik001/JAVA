import java.util.Scanner;
class max_min{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER ");
        int size=sc.nextInt();
        int x[]=new int[size];
        System.out.println("START ENTERING THE VALUES");
        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        int min=x[0];
        int max=x[0];
        for(int i=0;i<size;i++){
        if (x[i]<min){
        min=x[i];
        }
        if(x[i]>max){
        max=x[i];
        }
        }
        System.out.println("MAXIMUM VALUE IN THE ARRAY IS==> "+max);
        System.out.println("MINIMUM VALUE IN THE ARRAY IS==> "+min);
    }
}
