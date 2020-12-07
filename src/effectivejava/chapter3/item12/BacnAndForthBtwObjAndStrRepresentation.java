package effectivejava.chapter3.item12;

import java.math.*;

public class BacnAndForthBtwObjAndStrRepresentation {
    public static void main(String[] args) {
        BigInteger obj = new BigInteger("10000");
        String str = obj.toString();
        BigInteger obj1 = new BigInteger(str);

        System.out.println(obj.equals(obj1));
    }
}

/*
One important decision you’ll have to make when implementing a toString
method is whether to specify the format of the return value in the documentation.
It is recommended that you do this for value classes, such as phone number or
matrix. The advantage of specifying the format is that it serves as a standard,
unambiguous, human-readable representation of the object. This representation
can be used for input and output and in persistent human-readable data objects,
such as CSV files. If you specify the format, it’s usually a good idea to provide a
matching static factory or constructor so programmers can easily translate back
and forth between the object and its string representation. This approach is taken
by many value classes in the Java platform libraries, including BigInteger,
BigDecimal, and most of the boxed primitive classes.

The disadvantage of specifying the format of the toString return value is that
once you’ve specified it, you’re stuck with it for life, assuming your class is
widely used. Programmers will write code to parse the representation, to generate
it, and to embed it into persistent data. If you change the representation in a future
release, you’ll break their code and data, and they will yowl. By choosing not to
specify a format, you preserve the flexibility to add information or improve the
format in a subsequent release.
*/
