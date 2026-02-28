import java.util.Scanner;
public class Countovelcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine().toLowerCase();
		int con=0,vov=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vov++;
			}
			else {
				con++;
			}
		}
		System.out.println("vov  "+vov + "  con " +con);

	}

}
