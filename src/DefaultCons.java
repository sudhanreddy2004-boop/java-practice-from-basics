class Dupe1{
	 private String name;
	private int id;
	private long num;
//	public void setData(String y,int k,long z) {
//	name=y;
//	id=k;
//	num=z;
//	}
	public  Dupe1() {
//		name="aril";
//		id=101;
//		num=54659539;
		
	}
	//when we create one object without creating creating constructor java  will provide but we 
	//craete two objects java will not provide dafult constructor we have to create two constuctor
	public Dupe1(String name,int id,long num) {
		this.name=name;
		this.id=id;
		this.num=num;
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
public class DefaultCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dupe1 d=new Dupe1("madhu",1010,87199181);
	
		//"madhu",101,618210);
		System.out.println(d.getName()+" "+d.getId()+" "+d.getNum());
	Dupe1 d1=new Dupe1("madhu",100,99959959);
		//System.out.println(d1.getName()+" "+d1.getId()+" "+d1.getNum());

		

	}

}
