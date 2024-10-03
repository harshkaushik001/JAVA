import java.util.ArrayList;
import java.util.Scanner;

public class Array_Listtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first list: ");
        int size1 = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>(size1);
        System.out.println("Enter strings for the first list:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.next());
        }

        System.out.print("Enter the size of the second list: ");
        int size2 = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>(size2);
        System.out.println("Enter strings for the second list:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.next());
        }
        ArrayList<String> mergedList = new ArrayList<>(list1);
        int ss=size1+size2;
        for(int i=0;i<size1;i++){
            mergedList.add(list1(i));
        }
        
        /*
        mergedList.addAll(list2);
        ArrayList<String> uniqueList = new ArrayList<>();
        for (int i = 0; i < mergedList.size(); i++) {
         String str = mergedList.get(i);
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }*/

        System.out.println("Merged list with unique strings: " + uniqueList);

    }
}
