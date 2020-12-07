package effectivejava.chapter3.item12;

public class EnumDefaultToStringIsSufficient {
    public static void main(String[] args) {
        //no need to override toString() in Enum..
        // default one results in readable and
        // concise string
        System.out.println(EmployeeEnum.Permanent);
    }
}
