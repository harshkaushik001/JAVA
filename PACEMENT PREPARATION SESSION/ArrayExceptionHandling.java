import java.util.Scanner;

class ArrayExceptionHandling {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[5];
            System.out.println("START ENTERING VALUES:");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                System.out.println();
            }

            System.out.println("Enter the index you want to access => ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered. Please enter a valid index between 0 and 4.");
        }
    }
}
