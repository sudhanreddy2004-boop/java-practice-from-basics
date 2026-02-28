import java.util.ArrayList;
public class ArraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(21);
		al.add(31);
		al.add("madhu");
		al.add('m');
		//System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("madhu");
		al1.add('m');
		//al1.addAll(al);
		//System.out.println(al1);
		//al1.addAll(0,al);
		//System.out.println(al1);
		//al1.addAll(3,al);
		//System.out.println(al1);
		//al1.retainAll(al);
		System.out.println(al1);
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al.size());
		System.out.println(al1.size());
		System.out.println(al);
		al.add(2,100);
		System.out.println(al);
        al.set(2, 101);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.indexOf(11));






		
	}

}
