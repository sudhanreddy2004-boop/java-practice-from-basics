import java.util.Scanner;
public class ProductofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a  number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int mul=1;
		while(a>0) {
			mul=mul*a%10;
			a=a/10;
					
		}
		System.out.println(mul);
			
		
		




	}

}
