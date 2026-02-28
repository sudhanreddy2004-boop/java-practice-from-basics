import java.util.Scanner;
public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		//arr[0]=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			//arr[i+1]=arr[i];
		}
		int temp=arr[arr.length-1];
		//arr[0]=arr.length-1;
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		//arr[0]=arr.length-1;
		arr[0] = temp;
		
		System.out.println("after right rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
