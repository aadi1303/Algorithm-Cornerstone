import java.util.*;

class Linear_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, num, index = -1;
        int arr[];

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search: ");
        num = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                index = i;
                break; // Exit the loop if the element is found
            }
        }

        if (index != -1) {
            System.out.println("Element found at @index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
