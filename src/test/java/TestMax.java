import org.junit.Assert;
import org.junit.Test;

public class TestMax {

    FindMax maxObject ;

    //1.1 = Find Max of Integers Where Max Integer is first Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumOne() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(5,2,1,3);
        Assert.assertEquals((Integer) 5, maxInteger);
    }
    //1.2 = Find Max of Integers Where Max Integer is Second Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumTwo() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(15,22);
        Assert.assertEquals((Integer) 22, maxInteger);
    }
    //1.3 = Find Max of Integers Where Max Integer is Third Number
    @Test
    public void givenThreeIntegers_FindMaxOfThem_ReturnMaximumThree() {
        Integer maxInteger = (Integer)maxObject.checkMaximum(5,12,33,54);
        Assert.assertEquals((Integer) 54, maxInteger);
    }

    //2.1 = Find Max of Floats Where Max Integer is First Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumOne() {
        Float maxFloat = (Float) maxObject.checkMaximum(55.36f,22.1f,3.54f,32.25f,27.35f);
        Assert.assertEquals((Float) 55.36f, maxFloat);
    }
    //2.2 = Find Max of Floats Where Max Integer is Second Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumTwo() {
        Float maxFloat = (Float) maxObject.checkMaximum(15.36f,22.1f);
        Assert.assertEquals((Float) 22.1f, maxFloat);
    }
    //2.3 = Find Max of Floats Where Max Integer is Third Number
    @Test
    public void givenThreeFloatNumber_FindMaxOfThem_ReturnMaximumThree() {
        Float maxFloat = (Float) maxObject.checkMaximum(5.36f,27.1f,32.5f,33.54f);
        Assert.assertEquals((Float) 33.54f, maxFloat);
    }

    //3.1 = Find Largest of Strings Where Largest String is First
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumOne() {
        String largestString = (String) maxObject.checkMaximum("Strawberry", "Apple", "Banana","Cherries");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    //3.2 = Find Largest of Strings Where Largest String is Second
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumTwo() {
        String largestString = (String) maxObject.checkMaximum("Apple", "Strawberry");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
    //3.3 = Find Largest of Strings Where Largest String is Third
    @Test
    public void givenThreeStrings_FindMaxOfThem_ReturnMaximumThree() {
        String largestString = (String) maxObject.checkMaximum("Apple","Mangoes", "Berries", "Strawberry");
        Assert.assertEquals((String) "Strawberry", largestString);
    }
}