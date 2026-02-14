import java.util.Scanner;
public class MaxsubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int wsum=0;
		for(int i=0;i<k;i++){
			wsum+=arr[i];
		}
		int maxsum=wsum;
           
		 for(int i=k;i<arr.length;i++) {
			 wsum+=arr[i];
			 wsum-=arr[i-k];
		 }
		 if(wsum>maxsum) {
			 maxsum=wsum;
		 }
		 System.out.println("maxsub arrays is :"+maxsum);
	}

}
