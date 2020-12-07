### obey general contract while overriding equals
* you can generate equals and hashcode while the help of ide.
  you will have to choose wat fields shd be included in equals
  and hashcode
* when u override equals you shd override hashcode
* The default implementation provided by the JDK is based on memory 
  location — two objects are equal if and only if they are stored 
  in the same memory address.  
* hashcode(): a method provided by java.lang.Object that returns an
  integer representation of the object memory address. 
  By default, this method returns a random integer that is unique 
  for each instance. This integer might change between several 
  executions of the application and won't stay the same  
* If two objects are equal according to the equals(Object) method,
  then calling the hashcode() method on each of the two objects 
  must produce the same integer result.  
* HashSet stores its elements in memory buckets. 
  Each bucket is linked to a particular hash code.    
  Now when HashSet searches for an element inside it, it first 
  generates the element's hash code and looks for a bucket which 
  corresponds to this hash code.  
* Rules :
  If two objects are equal, they MUST have the same hash code.
  If two objects have the same hash code, it doesn't mean that they are equal.
  Overriding equals() alone will make your business fail with hashing 
  data structures like: HashSet, HashMap, HashTable ... etc.  
* The performance of the equals method may be affected by the order in which
  fields are compared. For best performance, you should first compare fields that
  are more likely to differ, less expensive to compare, or, ideally, both. You must
  not compare fields that are not part of an object’s logical state, such as lock
  fields used to synchronize operations. You need not compare derived fields,
  which can be calculated from “significant fields,” but doing so may improve
  the performance of the equals method. If a derived field amounts to a summary
  description of the entire object, comparing this field will save you the expense
  of comparing the actual data if the comparison fails. For example,
  suppose you have a Polygon class, and you cache the area. If two polygons
  have unequal areas, you needn’t bother comparing their edges and vertices.  
* The principle defines that objects of a superclass shall be 
  replaceable with objects of its subclasses without breaking 
  the application. That requires the objects of your subclasses 
  to behave in the same way as the objects of your superclass  
* https://www.artima.com/lejava/articles/equality.html  
  
  
  