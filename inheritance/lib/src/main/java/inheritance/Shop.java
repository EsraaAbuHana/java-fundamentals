package inheritance;

import java.util.ArrayList;

public class Shop extends Place{
//should have a name, description, and number of dollar signs.

//    ArrayList<Review> reviewsShop=new ArrayList<>();
//    String name;
  String description;
  String priceCategory;
//  ArrayList<Review>reviews;

    public Shop(String name,   String  description,String priceCategory){
        this.name=name;
        this.description=description;
        this.priceCategory=priceCategory;
//        this.reviews=new ArrayList<>();
        this.stars=0;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory='" + priceCategory + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    //    public  String toString(){
//        String ShopInfo= "Shop Name Is: "+this.name+"\n"+
//                "Description: "+this.description+"\n"+
//                "Shop Price Category Is: "+this.priceCategory+"\n";
////    System.out.println(ShopInfo);
//        return ShopInfo;
//    }



//    public void addReview(String newReview ,int newRate){
//        Review review =new Review(newReview,newRate);
//        this.reviews.add(review);
//    }
}
