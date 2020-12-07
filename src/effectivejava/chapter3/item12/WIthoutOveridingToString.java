package effectivejava.chapter3.item12;

public class WIthoutOveridingToString {
    int rollNo;

    public WIthoutOveridingToString(int rollNo) {
        this.rollNo = rollNo;
    }

   /* @Override
    public String toString() {
        return "WIthoutOveridingToString{" +
                "rollNo=" + rollNo +
                '}';
    }*/

    public static void main(String[] args) {
        WIthoutOveridingToString obj = new WIthoutOveridingToString(111);
        System.out.println(obj);
    }
}

//Try commenting/uncommenting out toString() method to see wat gets printed