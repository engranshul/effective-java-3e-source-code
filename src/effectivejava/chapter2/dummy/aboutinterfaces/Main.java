package effectivejava.chapter2.dummy.aboutinterfaces;

public class Main {
    public static void main(String[] args) {
        StaticInInterfaceCheck.process();
        System.out.println(StaticInInterfaceCheck.number);

        new Subclass().process();

        // try updating static final number field present in interface...will get compilation error
        // StaticInInterfaceCheck.number=20;
    }
}
