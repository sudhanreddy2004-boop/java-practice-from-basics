import java.util.*;
public class RemoveduplicatesArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array size");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int arr[]=new int[n];
		Set<Integer>Set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			int num=arr[i];
			Set.add(num);
		}
		System.out.println("after removing duplicates" +Set);
		System.out.println("size "+Set.size());
		

	}

}
