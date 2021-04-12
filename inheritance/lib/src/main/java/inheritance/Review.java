package inheritance;

    public class Review {

          String author;
         int numberOfStarsGiven;
        public Review(){}
        public Review(  String author, int numberOfStarsGiven){
            this.author= author;
            this.numberOfStarsGiven= numberOfStarsGiven;
//            this.body=body;

        }

public String toString(){
        String reviewInfo=
            "Restaurant New Given  Rate Is: "+numberOfStarsGiven+"\n"+
            "Reviewed by : "+author+"\n";



    System.out.println(reviewInfo);
    return reviewInfo;
}

    }
