/*class App1{
    {
    new App2();
}
static class App2{
    {
        new App1().new App3();
    }
}
class App3{
    {
        System.out.println("S");
    }
}
}
public static void mainCCCC(String args[]){
    new App1();
}
*/


/*class App1 {
    static String s = "s1";     
    class App2 {
        String s = "s2";         
        void methodApp2() {
            System.out.println(s);
        }
    }
} 
public class mainCCCC {
    public static void main(String[] args) {
        App1 a = new App1();         
        System.out.println(a.s);         
        App1.App2 b = a.new App2();         
        System.out.println(b.s);         
        b.methodApp2();
    }
}
*/


/*class App1 {
    String s = "PPP";     
    {
        System.out.println(s);
    }     
    String methodApp1() {
        class App2 {
            String s = App1.this.s+"QQQ";
            {
                System.out.println(s);
            }
        }         
        return new App2().s+s;
    }
} 
public class mainCCCC {
    public static void main(String[] args) {
        App1 p = new App1();         
        System.out.println(p.methodApp1());
    }
}
*/


/*class App1 {
    {
        System.out.println("1");
    }     
    class App2 { 
		{
            System.out.println("2");
        }
    }     
    static {
        System.out.println("3");
    }     
    static class App3 { 
		{
            System.out.println("4");
        }         
        static {
            System.out.println("5");
        }
    }
}
 
public class mainCCCC {
    public static void main(String[] args) {
        App1 one = new App1();
        App1.App2 two = one.new App2();         
        App1.App3 three = new App1.App3();
    }
}
*/

//ERRORR

/*import java.util.Scanner;
class mainCCCC{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){

            if(i==0 || i==(a-1)){
                if(arr[0]<arr[1]){
                    count ++;
                }
                if(arr[a-1]>arr[i-1]){
                    count++;
                }
                
            }
            if(i!=0 && i!=(a-1)){
            if((arr[i]>arr[i-1]) && (arr[i]<arr[i+1])){
                count ++;
            }
            }

        }

        System.out.println("Number of such elements is = "+count);

    }
}
*/

/*import java.util.Arrays;
import java.util.Scanner;
class mainCCCC{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter the Nth no : ");
        int x=sc.nextInt();
        System.out.println("Nth smallest no in the array is  : "+arr[x-1]);
    }
}
*/

//Given an unsorted array of integers, print the occurance count of each element in the array
/*import java.util.Scanner;
class mainCCCC{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Answer = ");
        
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            System.out.print("[ "+arr[i]+","+count+" ]");
        }
    }
}*/

/*import java.util.Scanner;
import java.util.Arrays;

class mainCCCC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Answer = ");

        Arrays.sort(arr);

        for (int i = 0; i < a; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < a; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.print("[ " + arr[i] + "," + count + " ]");
        }
    }
}
*/


//Given an array of integers, find subset in array (subarray) which sums to given number. Print the index or index range.
//EX: 3,4,5,6,7,8  N=18
//Answer: 2,3,4 or 2-4
import java.util.Scanner;
class mainCCCC{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Sum : ");
        int N=sc.nextInt();
        

        System.out.println("Answer = ");

        int sum=0;
        int count=0;

        for(int i=0;i<a;i++){
            for(int j=;j<i;+j++){
            sum=sum+arr[j];
            count++;
            if(sum==N){
                System.out.println(count);
            }
            }
            sum=0;
            count=0;
        }

    }
}


