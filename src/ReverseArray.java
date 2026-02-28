import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	     int n=sc.nextInt();
	     
	     int arr[]=new int[n];
	     //int arr[] = new int[n];
	     //int even=0, odd=0;
	     System.out.println("enter array elements");
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 
	     }
	     for(int i=arr.length-1;i>=0;i--) {
	    	 System.out.println("rev arr is" +arr[i]);
	     }

	}

}
