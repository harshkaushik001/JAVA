import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first list: ");
        int size1 = sc.nextInt();

        ArrayList<String> list1 = new ArrayList<>(size1);

        System.out.println("Enter strings for the first list:");
        for (int i = 0; i < size1; i++) {
            String input = sc.next();
            list1.add(input);
        }

        System.out.print("Enter the size of the second list: ");
        int size2 = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>(size2);

        System.out.println("Enter strings for the second list:");
        for (int i = 0; i < size2; i++) {
            String input = sc.next();
            list2.add(input);
        }

        // Displaying the lists
        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);

    }
}
