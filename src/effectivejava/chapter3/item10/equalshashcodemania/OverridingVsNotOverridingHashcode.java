package effectivejava.chapter3.item10.equalshashcodemania;

import java.util.*;

public class OverridingVsNotOverridingHashcode extends Object {
    String name;
    int rollNo;
    String school;

    public OverridingVsNotOverridingHashcode(String name, int rollNo, String school) {
        this.name = name;
        this.rollNo = rollNo;
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OverridingVsNotOverridingHashcode that = (OverridingVsNotOverridingHashcode) o;
        return rollNo == that.rollNo &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    public static void main(String[] args) {
        Set<OverridingVsNotOverridingHashcode> set = new HashSet<>();
        OverridingVsNotOverridingHashcode dummyClass1 = new OverridingVsNotOverridingHashcode("ans",122,"law");
        OverridingVsNotOverridingHashcode dummyClass2 = new OverridingVsNotOverridingHashcode("ans",122,"lw");
        set.add(dummyClass1);
        set.add(dummyClass2);
        System.out.println(set.size());
    }
}

/*
in this if u comment hashcode then size will come as 2..coz even if equals
return true for dummyClass1 and dummyClass2..hashcode will be different
leading to saving objects in different buckets..

if u override hashcode properly,size will come as 1
*/