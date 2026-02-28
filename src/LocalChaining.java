class Dupe3{
	 private String name;
	private int id;
	private long num;

	public  Dupe3() {
		name="aril";
		id=101;
		num=54659539;
		
	}
	public Dupe3(String name,int id,long num) {

		this();
		 this.name = name;    // override default
		    this.id = id;
		    this.num = num;
	}
	public String  getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public long  getNum() {
		return num;
	}
	
}
public class LocalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dupe3 d=new Dupe3("madhu",1010,87199181);
	
		//"madhu",101,618210);
		System.out.println(d.getName()+" "+d.getId()+" "+d.getNum());
//	Dupe1 d1=new Dupe1("madhu",100,99959959);
//		System.out.println(d1.getName()+" "+d1.getId()+" "+d1.getNum());

		

	}

}
