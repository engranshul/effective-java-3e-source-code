package effectivejava.chapter2.item1.staticfactory_vs_constructors;

import java.math.*;
import java.util.*;

public class PS2 {
    public static void main(String[] args) {

        /* Constructs a randomly generated positive BigInteger that is probably
           prime, with the specified bitLength */

        Random ran = new Random();

        // we are not sure what obj object is by looking at constructor..
        BigInteger obj = new BigInteger(10,1,ran);
        System.out.println(obj);

        // here static method states that the returned object is a probable prime
        BigInteger obj1 = BigInteger.probablePrime(10,ran);
        System.out.println(obj1);
    }
}

/*
Parameters to a constructor do not describe the object being returned
,a static factory with a well-chosen name is easier to use and the
resulting client code easier to read
*/
