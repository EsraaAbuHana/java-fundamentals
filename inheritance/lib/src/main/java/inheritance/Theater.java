package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Place{
//    String name;
    public ArrayList<String>movies;
//    public List<Review>reviews;
    public Theater(){}

public Theater(String name,ArrayList<String> moviesList){
    this.name=name;
    this.movies=moviesList;
//    this.reviews=new ArrayList<>();
    this.stars=0;
}
//public String toString() {
//    ArrayList<String> moviesInfo = new ArrayList<>();
//    for (int i = 0; i<this.movies.size(); i++) {
//        moviesInfo.add(this.movies.get(i));
//    }
//    System.out.println(this.reviews);
//    if (this.reviews.size() != 0) {
//        System.out.println(this.reviews);
//    }
//    return moviesInfo.toString();
//}
public void addMovie(String newMovie){

    this.movies.add(newMovie);
}
public void removeMovie(String newMovie) {
//    for (int i = 0; i < this.movies.size(); i++) {
//        if (this.movies.get(i).equals(newMovie)) {
//            this.movies.remove(newMovie);
//        }
//    }
                this.movies.remove(newMovie);

}

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies=" + movies.toString() +
                '}';
    }
//    public String addReview(String author,int newRate,String movieName) {
//        moviesReview movieReview = new moviesReview(author, newRate, movieName);
//        String moviesInfo = "";
//        if (this.movies.contains(movieName)) {
//            moviesInfo += movieName + " Has A New Review : " + movieReview;
//        } else {
//            this.movies.add(movieName);
//
//        moviesInfo="This Movie Has Been Added!!";
//    }
////        System.out.println(moviesInfo);
//        return moviesInfo;
//}

}