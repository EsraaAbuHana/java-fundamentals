package inheritance;

public class Restaurant extends Place {

    public String priceCategory;

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.stars = 0;
        this.priceCategory = priceCategory;

    }

    public String toString() {
        String restaurantInfo = "Restaurant Name Is: " + this.name + "\n" +
                "Restaurant Rate Is: " + this.stars + "\n" +
                "Restaurant Price Category Is: " + this.priceCategory + "\n" +
                reviews.size();
        return restaurantInfo;

    }

}
