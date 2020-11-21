package effectivejava.chapter2.item2.practice;

public class AllAboutBoolean {
    public static void main(String[] args) {

        boolean isClosed = false;

        // this converts a primitive boolean to wrapper Boolean but this way is discouraged..
        // As per documentation : It is rarely appropriate to use this constructor. The static
        // factory valueOf(boolean) is generally a better choice, as it is
        // likely to yield significantly better space and time performance.
        Boolean flag = new Boolean(isClosed);


        // recommended way..
        // this method should generally be used in preference to the constructor
        // to yield significantly better space and time performance.
        // Boolean.valueOf never creates an object..it can greatly improve performance
        // if equivalent objects are requested often,especially if they r expensive to
        // create..checkout code of valueOf
        Boolean flag1 =Boolean.valueOf(isClosed);
    }
}
