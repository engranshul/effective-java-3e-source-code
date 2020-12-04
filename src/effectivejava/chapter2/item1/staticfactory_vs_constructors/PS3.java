package effectivejava.chapter2.item1.staticfactory_vs_constructors;



import effectivejava.chapter2.item1.staticfactory_vs_constructors.helpers.*;

import java.util.*;

public class PS3 {
    public static void main(String[] args) {
        // returns supertype user
        User user=newUser(UserEnum.ADMIN);

        // same behaviour in Enumset class..this call has all static methods
        EnumSet<UserEnum> otherset=EnumSet.noneOf(UserEnum.class);
    }
    public static User newUser(UserEnum type){
        switch (type){
            case ADMIN: return new Admin();
            case STAFF: return new StaffMember();
            default:
                throw new IllegalArgumentException("Unsupported user");
        }
    }
}

/*
Static method can return an object of any subtype of their return type
The existence of these two implementation classes is invisible to clients. If
ceased to offer performance advantages for small enum types, it
RegularEnumSet could be eliminated from a future release with no ill effects.
Similarly, a future release could add a third or fourth implementation of
if it proved beneficial EnumSet.for performance. Clients neither know nor care
about the class of the object they get back from the factory; they care only
that it is some subclass of EnumSet
*/
