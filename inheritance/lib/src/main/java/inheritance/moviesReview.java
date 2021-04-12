package inheritance;

public class moviesReview extends Review{
    private String movieName;
    public moviesReview(String author,int numberOfStarsGiven,String movieName){
        super(author,numberOfStarsGiven);
        this.movieName=movieName;
    }

    @Override
    public String toString() {
        return  movieName + " Has a New Review From "+super.author+'\n'+
                "Rate is: "+super.numberOfStarsGiven;
    }
}
