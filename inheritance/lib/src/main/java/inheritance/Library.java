/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        //Restaurant
        Restaurant restaurant1 = new Restaurant("CLASSY", "$$");
        Review review = new Review("good", "BATOOL", 6);

        System.out.println(restaurant1.toString());
        System.out.println(review.toString());
        restaurant1.addReview(review);
        restaurant1.addReview(new Review("nice food", "OSAMA", 8));
        System.out.println(restaurant1.reviews);
        System.out.println(restaurant1.toString());
//Shop
        Shop shop = new Shop("pretty", "gift shop", "$$$");
        System.out.println(shop.toString());
        //MOVIE
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Bee");
        movies.add("12 angry men");
        movies.add("pay it forward");

        Theater theater = new Theater("MY PC", movies);
        Review reviewMovie = new Review("not bad", "ESRAA", 7, theater, "Bee");
        System.out.println(reviewMovie.toString());

    }
}
