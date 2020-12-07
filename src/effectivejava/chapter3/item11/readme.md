### Always override hashcode when u override equals
* The Objects class has a static method that takes an arbitrary number of
  objects and returns a hash code for them. This method, named hash, lets you write
  one-line hashCode methods whose quality is comparable to those written according
  to the recipe in this item. Unfortunately, they run more slowly because they
  entail array creation to pass a variable number of arguments, as well as boxing and
  unboxing if any of the arguments are of primitive type. This style of hash function
  is recommended for use only in situations where performance is not critical. Here
  is a hash function for PhoneNumber written using this technique:
  // One-line hashCode method - mediocre performance
  @Override public int hashCode() {
  return Objects.hash(lineNum, prefix, areaCode);
  }
* Do not be tempted to exclude significant fields from the hash code computation
  to improve performance. While the resulting hash function may run
  faster, its poor quality may degrade hash tables’ performance to the point where
  they become unusable. In particular, the hash function may be confronted with a
  large collection of instances that differ mainly in regions you’ve chosen to ignore.
  If this happens, the hash function will map all these instances to a few hash codes,
  and programs that should run in linear time will instead run in quadratic time.
* Don’t provide a detailed specification for the value returned by hashCode,
  so clients can’t reasonably depend on it; this gives you the flexibility to
  change it. Many classes in the Java libraries, such as String and Integer, specify
  the exact value returned by their hashCode method as a function of the instance
  value. This is not a good idea but a mistake that we’re forced to live with: It
  impedes the ability to improve the hash function in future releases. If you leave
  the details unspecified and a flaw is found in the hash function or a better hash
  function is discovered, you can change it in a subsequent release
* In summary, you must override hashCode every time you override equals, or
  your program will not run correctly. Your hashCode method must obey the general
  contract specified in Object and must do a reasonable job assigning unequal hash
  codes to unequal instances. This is easy to achieve, if slightly tedious, using the
  recipe on page 51. As mentioned in Item 10, the AutoValue framework provides a
  fine alternative to writing equals and hashCode methods manually, and IDEs also
  provide some of this functionality.


