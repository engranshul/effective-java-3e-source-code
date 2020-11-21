package effectivejava.chapter2.item1;

import java.util.*;

public class CollectionsFrmk {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);
    }
}
/*
Collection is a interface present in java.util.package. It is used to represent a group of individual
objects as a single unit. The collection is considered as the root interface of the collection framework.
It provides several classes and interfaces to represent a group of individual objects as a single unit.
The List, Set, and Queue are the main sub-interfaces of the collection interface. The map interface is
also part of the java collection framework, but it doesn’t inherit Collection interface. The add(),
remove(), clear(), size(), and contains() are the important methods of the Collection interface.
*/

/*
Collections: Collections is a utility class present in java.util.package. It defines several utility
methods like sorting and searching which is used to operate on collection. It has all static methods.
These methods provide much-needed convenience to developers, allowing them to effectively work with
Collection Framework. For example, It has a method sort() to sort the collection elements according
to default sorting order, and it has a method min(), and max() to find the minimum and maximum value
respectively in the collection elements.
*/

/*
as of java 8,restriction that interfaces can not contain static methods was eliminated, so there is
typically little reason to provide a non instantiable companion class for an interface..
*/