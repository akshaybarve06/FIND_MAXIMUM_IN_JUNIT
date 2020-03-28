import org.junit.Assert;
import org.junit.Test;

public class TestMax {

    FindMax maxObject ;

    //1.1 = Find Max of Three Integers Where Max Integer is first Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
        maxObject=new FindMax(5,2,3);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 5, maxInteger);
    }
    //1.2 = Find Max of Three Integers Where Max Integer is Second Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax(15,22,13);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 22, maxInteger);
    }
    //1.3 = Find Max of Three Integers Where Max Integer is Third Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax(5,12,33);
        Integer maxInteger = (Integer)maxObject.checkMaximum();
        Assert.assertEquals((Integer) 33, maxInteger);
    }

    //2.1 = Find Max of Three Floats Where Max Integer is First Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        maxObject=new FindMax(55.36f,22.1f,3.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 55.36f, maxFloat);
    }
    //2.2 = Find Max of Three Floats Where Max Integer is Second Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax(15.36f,22.1f,13.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 22.1f, maxFloat);
    }
    //2.3 = Find Max of Three Floats Where Max Integer is Third Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax(5.36f,27.1f,33.54f);
        Float maxFloat = (Float) maxObject.checkMaximum();
        Assert.assertEquals((Float) 33.54f, maxFloat);
    }

    //3.1 = Find Largest of Three Strings Where Largest String is First
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        maxObject=new FindMax("Strawberry", "Apple", "Banana");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    //3.2 = Find Largest of Three Strings Where Largest String is Second
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumTwo() {
        maxObject=new FindMax("Apple", "Strawberry", "Banana");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    //3.3 = Find Largest of Three Strings Where Largest String is Third
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumThree() {
        maxObject=new FindMax("Apple", "Berries", "Strawberry");
        String largestString = (String) maxObject.checkMaximum();
        Assert.assertEquals((String) "Strawberry", largestString);
    }
}