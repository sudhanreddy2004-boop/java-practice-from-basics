import java.util.Scanner;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
	    
        String[] words = s.trim().split("\\s+");
        System.out.println("Word count: " + words.length);

	}

}
