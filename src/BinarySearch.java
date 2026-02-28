import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = 0;
        int last = arr.length - 1;
        int index = -1;

        while(first <= last) {
            int mid = (first + last) / 2;

            if(arr[mid] == target) {
                index = mid;
                break;
            }
            else if(arr[mid] < target) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }

        if(index != -1) {
            System.out.println("elemnt found at index: " + index);
        } else {
            System.out.println("not found");
        }

    }
}