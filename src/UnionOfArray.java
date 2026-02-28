import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Integer>set=new HashSet<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		System.out.println("union of two arrays:");
		for(int value: set) {
			System.out.print(value+" ");
		}

	}

}
