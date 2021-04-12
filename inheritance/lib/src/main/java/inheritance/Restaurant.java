package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
   public   String name;
   public int  numberOfStars;
   public   String priceCategory;
   public List<Review>reviews;

//    Restaurant(){}
   public Restaurant(String name,   int  numberOfStars,String priceCategory){
        this.name=name;
        this.numberOfStars=numberOfStars;
        this.priceCategory=priceCategory;
        this.reviews=new ArrayList<>();
    }
public  String toString(){
  String restaurantInfo= "Restaurant Name Is: "+this.name+"\n"+
            "Restaurant Rate Is: "+this.numberOfStars+"\n"+
            "Restaurant Price Category Is: "+this.priceCategory+"\n"+
          reviews;
    System.out.println(restaurantInfo);
return restaurantInfo;


}

public void addReview (String newReview,int newRate){
//        numberOfStars+= (newReview.numberOfStarsGiven)/reviews.size();
    Review review=new Review(newReview,newRate);
    this.reviews.add(review);

}

}
