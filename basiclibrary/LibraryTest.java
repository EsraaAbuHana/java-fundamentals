package test05;/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
//    @Test public void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//
////        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
//    }
    @Test
    public void testRoll(){
        ArrayList<Integer> testArray = new ArrayList<>();


        Library rollClassUnderTest = new Library();
        ArrayList<Integer> rollArray= rollClassUnderTest.roll(4);

//        assertEquals("The first item is equal to 5","5",reversed.get(3));

        assertEquals("Both sizes are the same", rollArray.size(),4);
    }
@Test
public void testcontainsDuplicates() {

    Library containsDuplicatesTest = new Library();
    int []arr={1,2,1};
    assertTrue("the array has duplicate elements 'true'",containsDuplicatesTest.containsDuplicates(arr));

}//end testcontainsDuplicates()

    @Test
    public void testAvg(){
        Library avgClassUnderTest = new Library();
        int[]array={2,3,8,5};
//        Double average= 4.5;

//        assertEquals("The first item is equal to 5","5",reversed.get(3));
        assertEquals("the expected average is right'4.5'",4.5,avgClassUnderTest.avg(array));

    }
    public void testSum(){
        int a[][] = {
                {1, 2, 3},//i=0
                {4, 5, 6},
                {7, 8, 9}
        };
        Integer result=45;
        Library sumClassUnderTest = new Library();


//        assertEquals("the expected lowest average is '2'",2,sumClassUnderTest.sumMatrix(a));

    }



}
