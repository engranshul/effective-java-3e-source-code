### always override toString()
* While Object provides an implementation of the toString method, the string that
  it returns is generally not what the user of your class wants to see. It consists of the
  class name followed by an “at” sign (@) and the unsigned hexadecimal representation
  of the hash code, for example, PhoneNumber@163b91. The general contract for
  toString says that the returned string should be “a concise but informative representation
  that is easy for a person to read.”
* The toString method is automatically invoked when an object is passed to
  println, printf, the string concatenation operator, or assert, or is printed by a
  debugger. Even if you never call toString on an object, others may. For example,
  a component that has a reference to your object may include the string representation
  of the object in a logged error message. If you fail to override toString, the
  message may be all but useless.
* A particularly annoying penalty for failing to include all of an 
  object’s interesting information in its string representation is test
  failure reports that look like this:
  Assertion failure: expected {abc, 123}, but was {abc, 123}.
* One important decision you’ll have to make when implementing a toString
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
* The disadvantage of specifying the format of the toString return value is that
  once you’ve specified it, you’re stuck with it for life, assuming your class is
  widely used. Programmers will write code to parse the representation, to generate
  it, and to embed it into persistent data. If you change the representation in a future
  release, you’ll break their code and data, and they will yowl. By choosing not to
  specify a format, you preserve the flexibility to add information or improve the
  format in a subsequent release.
* Whether or not you specify the format, provide programmatic access to the
  information contained in the value returned by toString. For example, the
  PhoneNumber class should contain accessors for the area code, prefix, and line
  number. If you fail to do this, you force programmers who need this information to
  parse the string. Besides reducing performance and making unnecessary work for
  programmers, this process is error-prone and results in fragile systems that break
  if you change the format. By failing to provide accessors, you turn the string format
  into a de facto API, even if you’ve specified that it’s subject to change    
* It makes no sense to write a toString method in a static utility class (Item 4).
  Nor should you write a toString method in most enum types (Item 34) because
  Java provides a perfectly good one for you. You should, however, write a
  toString method in any abstract class whose subclasses share a common string
  representation. For example, the toString methods on most collection implementations
  are inherited from the abstract collection classes.  
        