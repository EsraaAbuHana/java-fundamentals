package inheritance;

public class Restaurant {

     String name;
    int  numberOfStars;
     String priceCategory;
    Restaurant(){}
   public Restaurant(String name,   int  numberOfStars,String priceCategory){
        this.name=name;
        this.numberOfStars=numberOfStars;
        this.priceCategory=priceCategory;
    }
public  String toString(){
  String restaurantInfo= "Restaurant Name Is: "+this.name+"\n"+
            "Restaurant Rate Is: "+this.numberOfStars+"\n"+
            "Restaurant Price Category Is: "+this.priceCategory+"\n";
//    System.out.println(restaurantInfo);
return restaurantInfo;


}
    public void addReview(){}

public void addReview (Review newReview){
        newReview=new Review();
        if(newReview==null ){
           newReview.numberOfStarsGiven=1;
           newReview.numberOfStars=(numberOfStars+newReview.numberOfStarsGiven)/2;
        }
        newReview.toString();
//    System.out.println(newReview.toString());

}

}
