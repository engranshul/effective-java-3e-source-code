## static methods instead of constructors

A constructor always creates a new object in heap. It's not possible to return a cached 
instance of a class from Constructor. On other hand, Factory methods can take advantage 
of caching.


Advantages
* Unlike constructors,static factory methods have names 
* Unlike constructors,they are not required to create a new object each time they are called
* Unlike constructors,static methods can return an object of any subtype
* class of the returned object can vary from call to call as a function of input parameters
* class of the returned object need not exist

Disadvantages
* do not stand out in api documentation 
* classes with public or ptotected constructors can not be subclasssed