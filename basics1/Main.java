public class Main {
    public static void main(String[] args) {
int x = 7;
    String myAnimal;
    // int num=3; 
     //   Pluralize("dog",num);
    //   Pluralize("cat",num);
    //   Pluralize("turtle",num);
    // int num =(int)(Math.random()*10) ;

        Pluralize("dog",(int)(Math.random()*10)
        );
      Pluralize("cat",(int)(Math.random()*10)
      );
      Pluralize("turtle",(int)(Math.random()*10)
      );
      flipNHeads((int)(Math.random()*10));

      clocks();
  

    //   int count=3;
    //   char coin="h";

    }
  
   
    public static void Pluralize(String animal ,int n){
            if (n==1){
              System.out.println("I own " +n+" "+animal+".");
            }
            else
            {
             System.out.println("I own " +n+" "+animal+"s."); 
            }
                }
                public static void flipNHeads(int c){
                    
                    int hCount = 0;
                    int totalCount = 0;

                    // for (int i = 1; i <=c ; i++) {  }
                    String current;
                    // String[] arr=[c];

                    do{
                        double random = Math.random();
                        // Random currentFlip = new Random();
                        if(random>=0.5 ){
                            // if(random>=0.5&&current="heads"){                        

                            hCount++;
                            totalCount++;
                            current="heads";
                            System.out.println(current); 
                            // break;
                        }
                        else{   
                            current="tails";                          
                            System.out.println(current);
                            

                            totalCount++;

                        }
                    }while(hCount<c);
                    System.out.println( "It took "+ totalCount+" flips to flip "+c+ " heads in a row.");
                        }
               
                        public static void clocks(){
                            while (true)
        {
//   LocalDateTime now = LocalDateTime.now();

// //  int hour = now.getHour();
// //  int minute = now.getMinute();
// //  int second = now.getSecond();
// //  // or, if you're feeling fancy

//  String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
// //  System.out.println(hour+":"+minute+":"+second);

// System.out.println(time);
        }
    }


}