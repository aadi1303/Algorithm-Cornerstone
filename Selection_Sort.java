import java.util.*;

class Selection_Sort {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int arr[];

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];
        int arr_len = arr.length;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Algorithm
        for (int i = 0; i < arr_len-1; i++) {

                int min_val = i;

            for(int j=i+1; j < arr_len; j++)
            {
                if(arr[j] < arr[min_val])
                {
                    min_val = j;
                }
            }
            
            int temp = arr[min_val]; 
            arr[min_val] = arr[i]; 
            arr[i] = temp; 
        }

        System.out.println("Array after Insertion Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
