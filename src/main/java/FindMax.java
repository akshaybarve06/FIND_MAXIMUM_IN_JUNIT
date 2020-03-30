import java.util.Arrays;

public class FindMax <E extends Comparable> {

    E[] arrayElements;

    // parameterized constructor
    public FindMax(E[] arrayElements) {
        this.arrayElements=arrayElements;
    }
    //function to sort and Find Maximum of inputs
    public static  <E extends Comparable> E checkMaximum(E... arrayElements )
    {
        Arrays.sort(arrayElements);
        E maxResult=arrayElements[arrayElements.length-1];
        printMax(maxResult);
        return arrayElements[arrayElements.length-1];
    }

    // method for Printing Result
    private static <E> void printMax(E maxResult) {
        System.out.println("Largest Among all is..."+maxResult);
    }

    // Main Method
    public static void main(String args[])
    {
        System.out.printf("Welcome To Test Maximum Problem");
    }

}