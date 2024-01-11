import java.util.*;

class Binary_Search
{
    public static void main(String arg[])
    {
       Scanner sc = new Scanner(System.in);

        int n, num, low, high, mid, index = -1;
        int arr[];

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the elements(IN SORTED): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        

        System.out.println("Enter the number to search: ");
        num = sc.nextInt();

        low = 0;
        high = n-1;

        while(low <= high)
        {
            mid = (low + high)/2;

            if(arr[mid] == num)
            {
                index = mid;
                break;
            }
            else if(arr[mid] < num)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at @index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }
}