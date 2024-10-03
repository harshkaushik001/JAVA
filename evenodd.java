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

        System.out.println();

        System.out.println("number of even elements in array is==> "+even);
        System.out.println("number of odd elements in array is==> "+odd);

        System.out.println();

        int OddArray[]=new int[odd];
        int EvenArray[]=new int[even];
        int m=0,n=0;
        for(int i=0;i<size;i++){
            if(x[i]%2==0){
                EvenArray[m]=x[i];
                m++;
            }
            else{
                OddArray[n]=x[i];
                n++;
            }
        }
        System.out.println("ORIGINAL ARRAY IS AS FOLLOWS ::  ");
        for(int i=0;i<size;i++){
            System.out.println(x[i]);
        }

        System.out.println();

        System.out.println("ARRAY FOR EVEN NUMBERS IS AS FOLLOWS :: ");
        for(int i=0;i<even;i++){
            System.out.println(EvenArray[i]);
        }

        if(even==0){
            System.out.println("NONE ELEMENT BEACUSE OF ZERO EVEN ELEMENTS IN ORIGINAL ARRAY");
        }
        System.out.println();

        System.out.println("ARRAY FOR ODD NUMBERS IS AS FOLLOWS :: ");
        if(odd==0){
            System.out.println("NONE ELEMENT BEACUSE OF ZERO ODD ELEMENTS IN ORIGINAL ARRAY");
        }

        for(int i=0;i<odd;i++){
            System.out.println(OddArray[i]);
        }
    }

}