package effectivejava.chapter3.item11;

public class CheckOutIntegerHashCode {
    public static void main(String[] args) {
        Integer integer = new Integer(1);


    }
}
/*
Don’t provide a detailed specification for the value returned by hashCode,
so clients can’t reasonably depend on it; this gives you the flexibility to
change it. Many classes in the Java libraries, such as String and Integer, specify
the exact value returned by their hashCode method as a function of the instance
value. This is not a good idea but a mistake that we’re forced to live with: It
impedes the ability to improve the hash function in future releases. If you leave
the details unspecified and a flaw is found in the hash function or a better hash
function is discovered, you can change it in a subsequent release.
*/
