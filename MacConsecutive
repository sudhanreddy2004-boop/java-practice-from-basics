import java.util.*;
public class MacConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
	
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count=0;
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter which number to know consecutive count");
		int m=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==m) {
				count++;
			}
			else {
				count=0;
			}
			if(count>maxcount) {
				maxcount=count;
			}
		}
		
		System.out.println(maxcount);

	}

}
