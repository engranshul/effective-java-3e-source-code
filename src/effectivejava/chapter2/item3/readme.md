### Enforcing singleton..3 ways
* with an enum : a single element enum is often the best way
  to implement a singleton
* public static final instance with a private constructor
* private static final instance with a public constructor

#### serialization vs deserialization 
  Serialization is a mechanism of converting the state of an 
  object into a byte stream. Deserialization is the reverse 
  process where the byte stream is used to recreate the actual 
  Java object in memory.The byte stream created is platform 
  independent.

