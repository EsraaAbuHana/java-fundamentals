package inheritance;

    public class Review extends Restaurant{

        String body;
        String author;
        int numberOfStarsGiven;
        public Review(){}
        public Review(  String body, String author, int numberOfStarsGiven,String name, int  numberOfStars, String priceCategory){
            this.body= body;
            this.author= author;
            this.numberOfStars= numberOfStars;
            this.numberOfStarsGiven= numberOfStarsGiven;
            this.name= name;
            this.priceCategory= priceCategory;

        }
public String toString(){
    String reviewInfo= "Restaurant Name Is: "+name+"\n"+
            "Restaurant Rate Is: "+numberOfStars+"\n"+
            "Restaurant Price Category Is: "+priceCategory+"\n"+
            "Restaurant New Given  Rate Is: "+numberOfStarsGiven+"\n"+
            "Reviewed by : "+author+"\n"+
            "Review Is : "+body;



//    System.out.println(reviewInfo);
    return reviewInfo;
}

    }
