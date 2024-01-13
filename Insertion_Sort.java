import java.util.*;

class Insertion_Sort {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int arr[];

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position in sorted order
            arr[j + 1] = key;
        }

        // Print the sorted array
        System.out.println("Array after Insertion Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
