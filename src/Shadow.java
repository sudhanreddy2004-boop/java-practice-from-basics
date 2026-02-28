class Dupe{
	 private String name;
	private int id;
	
	private long num;
//	public void setData(String y,int k,long z) {
//	name=y;
//	id=k;
//	num=z;
//	}
	public void setData(String name,int id,long num) {
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
public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dupe d=new Dupe();
		d.setData("madhu",101,618210);
		System.out.println(d.getName()+" "+d.getId()+" "+d.getNum());
		

	}

}
