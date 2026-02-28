import java.util.Scanner;
public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String res=s.replace(" ","");
	    System.out.println("after removing:" +res);

	}

}
