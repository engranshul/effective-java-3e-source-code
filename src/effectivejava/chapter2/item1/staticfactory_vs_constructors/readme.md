### static methods vs constructors

#### advantages of static factory methods 
* Unlike constructors,static factory methods have names
* A constructor always creates a new object in heap. It's not possible to return a cached
  instance of a class from Constructor. On other hand, Factory methods can take advantage
  of caching.
* Unlike constructors,static methods can return an object of any subtype
* class of the returned object can vary from call to call as a function of input parameters
* class of the returned object need not exist

#### disadvantages of static factory methods 
* do not stand out in api documentation
* classes with public or protected constructors can not be subclasssed

#### conclusion
static factory methods and public constructors both have their
uses, and it pays to understand their relative merits. Often static factories
are preferable, so avoid the reflex to provide public constructors without
first considering static factories.