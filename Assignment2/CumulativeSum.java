import java.util.Arrays;
import java.util.Scanner;

public class CumulativeSum {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        int sum[] = cumulativeSum(arr);
        System.out.println(Arrays.toString(sum));
        scan.close();
    }

    public static int[] cumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i]; 
            arr[i] = sum; 
        }
        return arr;
    }
}