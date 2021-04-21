package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Place implements NewReview {
    public String name;
    public double stars;
    public List<Review> reviews = new ArrayList<>();

    public void addReview(Review newReview) {
        reviews.add(newReview);
        newReview.place = this;
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += (double) review.stars;
        }
        stars = totalStars / (double) reviews.size();
    }
}
