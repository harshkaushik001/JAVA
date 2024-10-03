//Given an array of integers. Sort the array in such a way thata they alternate betweeb bigger and smaller numbers.
//Eg: 2,9,4,10,5,20,3
//Answer - 3,2,5,4,10,9,20

/*
import java.util.Scanner;
import java.util.Arrays;
class medium{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Start entering the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i<size;i=i+2){
            if(i==(size-1)){
                break;
            }
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            temp=0;

        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
}
*/

/*
//Write a function void beautify.....
import java.util.Scanner;
import java.util.Arrays;
class medium{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="The world is beautiful";
        int x=str.length();
        int count =0,sp=0,z=0,y,xx,k=0;
        String temp=" ";
        for(int i=0;i<x;i++){
            char c=str.charAt(i);
            if(c == ' '){
                count ++;
            }
        }
        System.out.println("No of words : "+(count+1));
        int arr[]=new int[count+1];
        for(int i=0;i<x;i++){
            char c=str.charAt(i);
            temp=temp+c;
            if(c == ' '){
                arr[k]=temp.length();
                k++;
                temp=" ";
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr[count+2];i++){
            System.out.print("*");
        }
        for(int i=0;i<x;i++){
            char c=str.charAt(i);
            temp=temp+c;
            if(c == ' '){
                System.out.println(temp);
            }
        }
        for(int i=0;i<arr[count+2];i++){
            System.out.print("*");
        }

        
    }
}
*/

/*
public class medium {
    public static void main(String[] args) {
        String text = "the world is beautiful";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        // Print Words inside the box
        int Max_string = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > Max_string) {
                Max_string = words[i].length();
            }
        }
        for (int i = 0; i < Max_string + 4; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for (int i = 0; i < words.length; i++) {

            System.out.print("* " + words[i]);
            for (int j = 0; j < Max_string - words[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i < Max_string + 4; i++) {
            System.out.print("*");
        }
    }
}
*/
