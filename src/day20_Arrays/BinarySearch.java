package day20_Arrays;

// Java implementation of recursive Binary Search
/*
Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.
1-Compare x with the middle element.
2-If x matches with the middle element, we return the mid index.
3-Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
4-Else (x is smaller) recur for the left half.
 */
public class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


   public static void binarySearch1(int v[], int To_Find)
    {
        int lo = 0, hi = v.length - 1;
        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (v[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (v[lo] == To_Find) {
            System.out.println("Found At Index " + lo );
        }
        else if (v[hi] == To_Find) {
            System.out.println("Found At Index " + hi );
        }
        else {
            System.out.println("Not Found" );
        }
    }


    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;

        System.out.println("-----with Recursive Method--- ");

        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);


        System.out.println("----- with Iterative Method ---- ");

        binarySearch1(arr, x);

    }


}
/* This code is contributed by Rajat Mishra */
/*
Binary Search Algorithm can be implemented in the following two ways

Iterative Method
Recursive Method
1. Iteration Method

    binarySearch(arr, x, low, high)
        repeat till low = high
               mid = (low + high)/2
                   if (x == arr[mid])
                   return mid

                   else if (x > arr[mid]) // x is on the right side
                       low = mid + 1

                   else                  // x is on the left side
                       high = mid - 1
2. Recursive Method (The recursive method follows the divide and conquer approach)

    binarySearch(arr, x, low, high)
           if low > high
               return False

           else
               mid = (low + high) / 2
                   if x == arr[mid]
                   return mid

               else if x > arr[mid]        // x is on the right side
                   return binarySearch(arr, x, mid + 1, high)

               else                        // x is on the left side
                   return binarySearch(arr, x, low, mid - 1)
 */