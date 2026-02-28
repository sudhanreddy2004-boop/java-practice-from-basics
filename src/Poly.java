class Customer {
    char gender;
    String Loc;
    int cid;
    Long mobile;

    void setDetails(char g) {
        gender = g;
    } 

    void setDetails(String c) {
        Loc = c;
    }

    void setDetails(Long l) {
        mobile = l;
    }
}

public class Poly {
    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setDetails('M');
        c1.setDetails("atp");
        c1.setDetails(85451724L);

        System.out.println(c1.gender);
        System.out.println(c1.Loc);
        System.out.println(c1.mobile);
    }
}