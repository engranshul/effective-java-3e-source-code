package effectivejava.chapter2.dummy;

public class EnumSetClass {

/*
* The EnumSet class (Item 36) has no public constructors, only static factories.
In the OpenJDK implementation, they return an instance of one of two subclasses,
depending on the size of the underlying enum type: if it has sixty-four or fewer
elements, as most enum types do, the static factories return a RegularEnumSet
instance, which is backed by a single long; if the enum type has sixty-five or more
elements, the factories return a JumboEnumSet instance, backed by a long array.
The existence of these two implementation classes is invisible to clients. If
RegularEnumSet ceased to offer performance advantages for small enum types, it
could be eliminated from a future release with no ill effects. Similarly, a future
release could add a third or fourth implementation of EnumSet if it proved beneficial
for performance. Clients neither know nor care about the class of the object they get
back from the factory; they care only that it is some subclass of EnumSet.
*/
}
