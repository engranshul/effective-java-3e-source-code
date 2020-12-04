package effectivejava.chapter2.item1.staticfactory_vs_constructors;

public class PS1 {
    public static void main(String[] args) {

        /*Both of below ways returns instance of class..*/

        // traditional way of creating object..new object created everytime
        Character obj = new Character('a');

        // static method..can get objects from cache..
        // more efficient..
        Character obj1= Character.valueOf('a');
    }
}

/*
A constructor always creates a new object in heap. It's not possible to return
a cached instance of a class from Constructor. On other hand, Factory methods
can take advantage of caching.
*/
