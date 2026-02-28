import java.util.Scanner;
public class CountEvenOdd {
	public static void main(String args[]) {
		 Scanner sc= new Scanner(System.in);
	     int n=sc.nextInt();
	     
	     int arr[]=new int[n];
	     //int arr[] = new int[n];
	     int even=0, odd=0;
	     System.out.println("enter array elements");
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 if(arr[i]%2==0) {
	    		 even++;
	    	 }
	    	 else {
	    		 odd++;
	    	 }
	     }
	        
	     
	  //   for(int i=0;i<arr.length;i++) {
	    	 System.out.println("odd count "+ odd);
	    	 System.out.println("even count "+ even);

	    	 
	   //  }
	     
	     
		
	}

}
