import java.util.Arrays;

public class FindMax<E extends Comparable<E>> {

    //Generic Array To Take Multiple Inputs
    E[] arrayElements;

    //Default Constructor
    public FindMax(){
    }

    // Parameterize constructor
    public FindMax(E[] array) {
        this.arrayElements=array;
    }

    //function for check maximum of given inputs
    public static <E extends Comparable> E checkMaximum(E... arrayElements )
    {
        Arrays.sort(arrayElements);
        return arrayElements[arrayElements.length-1];
    }

    //Main Method
    public static void main(String args[])
    {
        System.out.println("Welcome To Find and Test Maximum Problem Using Generics");
    }

}