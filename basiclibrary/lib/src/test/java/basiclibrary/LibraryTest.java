/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.List;

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

        boolean checkValue=true;
        for(int i=0;i<4;i++){
            if(rollArray.get(i)>=1 &&rollArray.get(i)<=6){
               checkValue=true;
            }else checkValue=false;
        }
        System.out.println(rollArray);
        System.out.println("all numbers between[1-6] :"+checkValue);
        System.out.println("size of array:"+rollArray.size());

assertTrue(checkValue);
        assertEquals("Both sizes are the same", 4,rollArray.size());

    }
    @Test
    public void testContainsDuplicates() {

        Library containsDuplicatesTest = new Library();
        int []arr={1,2,1};
        assertTrue("the array has duplicate elements 'true'",containsDuplicatesTest.containsDuplicates(arr));

    }//end testcontainsDuplicates()

    @Test
    public void testAvg(){
        Library avgClassUnderTest = new Library();
        int[]array={2,3,8,5};
        double average= 4.5;
        System.out.println("The average value is : "+avgClassUnderTest.avg(array));
assertTrue("The average value is 4.5",average==avgClassUnderTest.avg(array));
    }
    @Test
    public void testLowestAverage(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
//        int result=45;
        Library classUnderTest = new Library();
        int lowest = classUnderTest.lowestAverage(weeklyMonthTemperatures);
//        System.out.println(a[0]);
        System.out.println("index for the lowest average array is"+lowest);
        System.out.println("the lowest average is :"+classUnderTest.avg(weeklyMonthTemperatures[lowest]));

        assertEquals("the lowest average array is",57,classUnderTest.avg(weeklyMonthTemperatures[lowest]),0);

        assertEquals("the index for the lowest average array is",2,lowest);

    }
    @Test
    public void testAnalyzingWeatherData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Library classUnderTest = new Library();
        String expectedData="High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n";
        String actualData = classUnderTest.analyzingWeatherData(weeklyMonthTemperatures);
        System.out.println("The actual Data is \n"+actualData);
        System.out.println("The expected Data is \n"+expectedData);
assertEquals(actualData,expectedData);
//assertTrue(1==1);

    }
    @Test public void testTally(){
        Library classUnderTest = new Library();

        // within your main method...
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
String winner=classUnderTest.tally(votes);
//        String winner = tally(votes);
        System.out.println(winner);
        System.out.println(winner + " received the most votes!");
        assertTrue("Bush"==winner);
    }

}
