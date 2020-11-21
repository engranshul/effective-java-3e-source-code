package effectivejava.chapter2.item1.aboutinterfaces;

public interface StaticInInterfaceCheck {

    static final int number =10;             // by default fields are static final

    // static methods we not allowed before java 8 that why u can see Collection interface and Collections
    // class...all static factory methods in Collections class
    static void process(){
        System.out.println("processing in interface");
    }
}

/*
* interface can have static fields and methods..
*/