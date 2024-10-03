import java.util.Scanner;
class oddeven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER ");
        int size=sc.nextInt();
        int x[]=new int[size];
        System.out.println("START ENTERING THE VALUES");
        for(int i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        int odd=0,even=0;
        for(int i=0;i<size;i++){
        if(x[i]%2==0){
        even++;
        }
        else{
        odd++;
    }
        }
        System.out.println("number of odd elements in array is==> "+odd);
        System.out.println("number of even elements in array is==> "+even);
    }
}
