import org.junit.Assert;
import org.junit.Test;

public class TestMax {
    FindMax maxObject = new FindMax();
    ;
    //1.1 = Find Max of Three Integers Where Max Integer is first Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
        int integers = maxObject.findMaxInteger(5, 2, 3);
        Assert.assertEquals(5, integers);
        System.out.println("Maximum Among All is.."+integers);
    }
    //1.2 = Find Max of Three Integers Where Max Integer is Second Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        int integers = maxObject.findMaxInteger(12, 44, 23);
        Assert.assertEquals(4, integers);
        System.out.println("Maximum Among All is.."+integers);
    }
    //1.3 = Find Max of Three Integers Where Max Integer is Third Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        int integers = maxObject.findMaxInteger(7, 15, 23);
        Assert.assertEquals(23, integers);
        System.out.println("Maximum Among All is.."+integers);
    }

    //2.1 = Find Max of Three Floats Where Max Integer is First Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(55.36f, 22.1f, 3.54f);
        Assert.assertEquals((Float)55.36f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }
    //2.2 = Find Max of Three Floats Where Max Integer is Second Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(15.36f, 52.1f, 3.54f);
        Assert.assertEquals((Float)52.1f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }
    //2.3 = Find Max of Three Floats Where Max Integer is Third Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        Float maxfloatNumber = FindMax.findMaxFloatingNumber(15.36f, 12.1f, 43.54f);
        Assert.assertEquals((Float)43.54f, maxfloatNumber);
        System.out.println("Maximum Among All is.."+maxfloatNumber);
    }

    //3.1 = Find Max of Three Strings Where Max Integer is First Number
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        String largestString = FindMax.findLargestString("Pine-apple", "Peach", "Banana");
        Assert.assertEquals("Pine-apple", largestString);
        System.out.println("Maximum Among All is.."+largestString);
    }
}