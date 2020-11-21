package effectivejava.chapter2.item1.classneednotexist;

// see jdbc architecture to understand this..
public class Main {

    public static void main(String[] args) {
        process();
    }

    // concept that as of now there is no implementation of Response class still we are above to return
    // Advantage of static factories is that the class of the returned object need not exist when the
    // class containing the method is written.
    static Response process() {

        System.out.println("hello");
        return null;
    }
}

/*
It means that the API of your static factory method can return an interface type, of which the
implementation won't be written or generated until later.

As an example:

public static MyInterface getMyInterfaceInstance() {
    //load instance dynamically and return it.
}
In this case, the factory method only needs the MyInterface interface to exist when it's being
compiled. The actual implementation can be loaded dynamically at runtime in many ways, including:

Creating a proxy object
Reflection (configurable implementation class name loaded at runtime)
Looking up a service loader

In particular, the last two options simply mean that the implementation class can be written in a
different module (and many modules can provide an implementation of the interface), and these
implementation classes will be discovered at runtime - which makes it possible for the static
factory method to be written before the actual implementation class.
*/

/*
The DriverManager class(in java.sql package) acts as an interface between user and drivers. It keeps
track of the drivers that are available and handles establishing a connection between a database and
the appropriate driver. The DriverManager class maintains a list of Driver classes that have registered
themselves by calling the method DriverManager.registerDriver().

Useful methods of DriverManager class
Method	Description
1) public static void registerDriver(Driver driver):	is used to register the given driver with DriverManager.
2) public static void deregisterDriver(Driver driver):	is used to deregister the given driver (drop the driver from the list) with DriverManager.
3) public static Connection getConnection(String url):	is used to establish the connection with the specified url.
4) public static Connection getConnection(String url,String userName,String password):	is used to establish the connection with the specified url, username and password.
*/