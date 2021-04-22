package inheritance;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TheaterTest {
    ArrayList<String> movies = new ArrayList<>(Arrays.asList("12 angry men", "BEE", "pay it forward"));
    Theater theaterTest = new Theater("My PC", movies);
    Review rev = new Review("fine one", "Shoroq", 3);

    @Test
    public void testTheaterConstructor() {
        assertEquals( 3, theaterTest.movies.size());
        assertEquals( "My PC", theaterTest.name);
        assertEquals( 0, theaterTest.stars, 0.0);
    }

    @Test
    public void testAddMovie() {
        theaterTest.addMovie("batman");

        assertEquals( 4, theaterTest.movies.size());
        assertTrue( theaterTest.movies.contains("batman"));
    }

//    @Test
//    public void testAddMovieDuplicate() {
//        theaterTest.addMovie("BEE");
//
//        assertEquals("Movie set should not increase in size", 3, theaterTest.movies.size());
//    }

    @Test
    public void testRemoveMovie() {
        theaterTest.removeMovie("BEE");

        assertEquals(2, theaterTest.movies.size());
        assertFalse( theaterTest.movies.contains("BEE"));
    }

    @Test
    public void testToString() {
        assertEquals( "Theater{name='My PC', stars=0.0, movies=[12 angry men, BEE, pay it forward]}", theaterTest.toString());
    }

    @Test
    public void testAddReview() {
        theaterTest.addReview(rev);

        assertEquals( 3, theaterTest.stars, 0.0);
        assertEquals( 1, theaterTest.reviews.size());
        assertTrue(theaterTest.reviews.contains(rev));
        assertEquals( theaterTest, rev.place);
        assertEquals( "Theater{name='My PC', stars=3.0, movies=[12 angry men, BEE, pay it forward]}", theaterTest.toString());
    }

}
