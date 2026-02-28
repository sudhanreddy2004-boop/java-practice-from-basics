class Demo{
	private long balance;
	public void setData(long amt) {
		if(amt>=0) {
		balance=amt;
		}
		else {
			System.out.println("Invaliid Amount!!");
			System.exit(0);
		}
	}
	public long getData() {
		return balance;
	}
}
public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		demo.setData(-10000);
		System.out.println(demo.getData());

	}

}
