import java.util.Scanner;

public class SecondLarArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
        	if(arr[i]>lar) {
        		sec=lar;
        		lar=arr[i];
        	}
        	else if(arr[i]>sec && arr[i]!=lar) {
        		sec=arr[i];
        	}
        }

        if (sec == Integer.MIN_VALUE) {
        	// here we are alredy using the sec  number if sec are intializing first so sec== intialize value not found
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest element is: " + sec);
        }

        sc.close();
    }
}
