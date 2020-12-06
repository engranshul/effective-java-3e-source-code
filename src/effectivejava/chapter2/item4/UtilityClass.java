package effectivejava.chapter2.item4;

// Noninstantiable utility class (Page 19)
public class UtilityClass {
    // Suppress default constructor for noninstantiability
     private UtilityClass() {
        throw new AssertionError();
    }

    // Remainder omitted
}
// Below line will give error as utility class constructor is private
/*class Subclass extends UtilityClass {

}*/
