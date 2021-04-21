package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Place{
//   public   String name;
//   public int  numberOfStars;
   public   String priceCategory;
//   public List<Review>reviews;

//    Restaurant(){}
   public Restaurant(String name,String priceCategory){
        this.name=name;
        this.stars=0;
        this.priceCategory=priceCategory;
//        this.reviews=new ArrayList<>();

    }
public  String toString(){
  String restaurantInfo= "Restaurant Name Is: "+this.name+"\n"+
            "Restaurant Rate Is: "+this.stars+"\n"+
            "Restaurant Price Category Is: "+this.priceCategory+"\n"+
          reviews.size();
//    System.out.println(restaurantInfo);
return restaurantInfo;


}

//public void addReview (String newReview,int newRate){
////        numberOfStars+= (newReview.numberOfStarsGiven)/reviews.size();
//    Review review=new Review(newReview,newRate);
//    this.reviews.add(review);
//
//}

}
