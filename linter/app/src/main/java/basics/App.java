/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//*****************************************************
        System.out.println("Run the Pluralize method");
        Pluralize("dog",(int)(Math.random()*10)
        );
        Pluralize("cat",(int)(Math.random()*10)
        );
        Pluralize("turtle",(int)(Math.random()*10)
        );
//*****************************************************
        System.out.println("Run the flipNHeads method");
        flipNHeads((int)(Math.random()*10));
//*****************************************************
        System.out.println("Run the clocks method");
           clocks();
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

        String current;
        do{
            double random = Math.random();
            if(random>=0.5 ){
                hCount++;
                totalCount++;
                current="heads";
                System.out.println(current);
            }
            else{
                current="tails";
                System.out.println(current);

hCount=0;//add this line to make the flips in row
                totalCount++;

            }
        }while(hCount<c);
        System.out.println( "It took "+ totalCount+" flips to flip "+c+ " heads in a row.");

    }
// clocks() fix done
                             public static void clocks(){

                                 int second,nextSecond=0;
                                 while (true) {
                                     LocalDateTime now = LocalDateTime.now();
                                     second = now.getSecond();
                                     if (nextSecond!=second) {
                                         nextSecond = second;
                                         String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                                         System.out.println(time);
                                     }
                       }
         }
     }
