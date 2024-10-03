//{8,8,8}{8,8,0}{8,0,8}
//{9,9,9}{9,9,0}{9,0,8}
import java.util.Scanner;

class Walkable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { {8, 8, 8}, {8, 8, 0}, {8, 0, 8} };

        System.out.println("Enter the start position (X Y):");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println("Enter the number to be replaced:");
        int yy = sc.nextInt();

        int Array[][] = Walkable.find(arr, X, Y, yy);

        System.out.println("ARRAY WITH REPLACEMENTS : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] find(int arr[][], int aa, int bb, int out) {
    int current = arr[aa][bb];
    arr[aa][bb] = out;

    int movable [][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    for (int movable[] : movable) {
        int newRow = aa + movable[0];
        int newCol = bb + movable[1];

        if (newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr[0].length) {

            if (arr[newRow][newCol] == current) {
                find(arr, newRow, newCol, out);
            }
        }
    }

    return arr;
}

}
