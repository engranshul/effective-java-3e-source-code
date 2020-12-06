### dependency injection
* Dependency injection (DI) is the concept in which objects get 
  other required objects from outside. DI can be implemented in
  any programming language. The general concept behind dependency
  injection is called Inversion of Control. A Java class has a 
  dependency on another class, if it uses an instance of this 
  class.
* In summary, do not use a singleton or static utility class to implement a class
  that depends on one or more underlying resources whose behavior affects that of
  the class, and do not have the class create these resources directly. Instead, pass
  the resources, or factories to create them, into the constructor (or static factory or
  builder). This practice, known as dependency injection, will greatly enhance the
  flexibility, reusability, and testability of a class.  
  