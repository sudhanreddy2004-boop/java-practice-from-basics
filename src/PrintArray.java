import java.util.Scanner;
public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     
     int arr[]=new int[n];
     //int arr[] = new int[n];
     System.out.println("enter array elements");
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
        
     
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("array "+arr[i]);
     }
     
     
     
     
	}

}
