import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		sum=sum+i;
		System.out.println(sum);
		System.out.println("for multiplication");
           int m=sc.nextInt();
           int mul=1;
           
           for(int i=1;i<=m;i++) 
        	   mul=mul*i;
        	   System.out.println(mul);
        	   
           
           
	}

}
