import java.util.Scanner;

public class Fabinoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.println("enter A  limit");
          int n=sc.nextInt();
          int a=0,b=1;
          for(int i=1;i<=n;i++) {
        	  int c=a+b;
        	  System.out.println("a is  " +a);
        	  a=b;
        	  b=c;
          }
    }
}
