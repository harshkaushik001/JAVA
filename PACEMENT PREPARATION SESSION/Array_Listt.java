import java.util.ArrayList;
import java.util.Scanner;

public class Array_Listt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input and creation of the first list
        System.out.print("Enter the size of the first list: ");
        int size1 = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>(size1);
        System.out.println("Enter strings for the first list:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.next());
        }

        // Input and creation of the second list
        System.out.print("Enter the size of the second list: ");
        int size2 = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>(size2);
        System.out.println("Enter strings for the second list:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.next());
        }

        ArrayList<String> mergedList = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }
        

        System.out.println("Merged list: " + mergedList);

    }
}
