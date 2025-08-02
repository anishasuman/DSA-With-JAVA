import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, insertIndex, valueToInsert;

        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();

        int[] orgArray = new int[n];
        int[] newArray = new int[n + 1];

        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            orgArray[i] = sc.nextInt();
        }

        System.out.println("Enter index number where to insert (0 to " + n + "): ");
        insertIndex = sc.nextInt();

//        if (insertIndex < 0 || insertIndex > n) {
//            System.out.println("❌ Invalid index!");
//            return;
//        }

        System.out.println("Enter new value to be inserted: ");
        valueToInsert = sc.nextInt();

        // ✅  logic:
        for (int i = 0; i < newArray.length; i++) {
            if (i < insertIndex) {
                newArray[i] = orgArray[i];
            } else if (i == insertIndex) {
                newArray[i] = valueToInsert;
            } else {
                newArray[i] = orgArray[i - 1];
            }
        }

        // Display
        System.out.println("Final array after Insertion: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
