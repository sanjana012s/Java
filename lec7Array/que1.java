
import java.util.*;

class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("Enter the search number: ");
        int s = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == s) {
                    System.out.println("Found at: (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
}