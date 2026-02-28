import java.util.Scanner;
public class Factnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			 fact=fact*i;
		}
		System.out.println("factorial  :" +fact);
	}

}
