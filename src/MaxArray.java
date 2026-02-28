import java.util.Scanner;
public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		//int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		

	}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("max is "+max);

}
}
