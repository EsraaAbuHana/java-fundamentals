/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
        Restaurant restaurant1=new Restaurant();
//        Restaurant restaurant2=new Restaurant();
//        Restaurant restaurant3=new Restaurant();
        restaurant1.name="BB";
        restaurant1.priceCategory="$$";
        restaurant1.numberOfStars=5;
        restaurant1.toString();

//        restaurant2.toString();
//        restaurant3.toString();


        //review
        Review review1=new Review();
        review1.body= "very good";
        review1.author= "me";
        review1.numberOfStars= 5;
        review1.numberOfStarsGiven= 4;
        review1.name= "BB";
        review1.priceCategory= "$$";
        review1.toString();
        System.out.println(review1.toString());
        //add Review
      restaurant1.addReview();
//        System.out.println();
    }
}
