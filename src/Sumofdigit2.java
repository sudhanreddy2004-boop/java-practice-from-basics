import java.util.Scanner;
public class Sumofdigit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a  number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
					
		}
		System.out.println(sum);
			
		
		

	}

}
