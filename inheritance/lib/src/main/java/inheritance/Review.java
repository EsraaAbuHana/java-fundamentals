package inheritance;

public class Review {

    public String author;
    public int stars;
    public String body;
    public Place place;
    public String movie;

    public Review() {
    }

    public Review(String body, String author, int stars) {
        this.author = author;
        this.stars = stars;
        this.body = body;

    }

    //review  restaurant
    public Review(String body, String author, int stars, NewReview place) {
        this.author = author;
        this.stars = stars;
        this.body = body;
        place.addReview(this);
    }

    //review  movie
    public Review(String body, String author, int stars, Theater place, String movie) {
        this.author = author;
        this.stars = stars;
        this.body = body;
        this.movie = movie;
        place.addReview(this);

    }
//    public  String toString(){
//        String restaurantInfo= "Restaurant Name Is: "+this.name+"\n"+
//                "Restaurant Rate Is: "+this.stars+"\n"+
//                "Restaurant Price Category Is: "+this.priceCategory+"\n"+
//                reviews.size();

    public String toString() {
        if(place != null) {
            if(movie != null) {
                return "Author: " + author + "\nMovie: " + movie + "\nTheater: " + place.name + "\nStars: " + stars + "\nReview: " + body;
            } else {
                return "Author: " + author + "\nPlace: " + place.name + "\nStars: " + stars + "\nReview: " + body;
            }
        }
        else {
            return "Author: " + author + "\nStars: " + stars + "\nReview: " + body;
        }
    }
//
//        @Override
//        public String toString() {
//            return "Review{" +
//                    "author='" + author + '\'' +
//                    ", numberOfStarsGiven=" + numberOfStarsGiven +
//                    ", body='" + body + '\'' +
//                    ", place=" + place +
//                    ", movie='" + movie + '\'' +
//                    '}';
//        }
    //public String toString(){
//        String reviewInfo=
//            "Restaurant New Given  Rate Is: "+numberOfStarsGiven+"\n"+
//            "Reviewed by : "+author+"\n";
//
//
//
//    System.out.println(reviewInfo);
//    return reviewInfo;
//}

}
