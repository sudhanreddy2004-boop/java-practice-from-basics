import java.util.*;
public class Intersection2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Set<Integer>set=new HashSet<>();
		int n=sc.nextInt();
		int m= sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		System.out.println("intersection of arrays");
		for(int value:set) {
			System.out.print(value+" ");
		}


	}

}
