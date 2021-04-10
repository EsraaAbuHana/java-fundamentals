/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static  ArrayList roll (int n){
        ArrayList<Integer>listOfNumbers=new ArrayList<>();

        for( int i=0;i<n;i++){
            listOfNumbers.add((int)(Math.random()*6)+1);

        }
        System.out.println(listOfNumbers);
        return listOfNumbers;
    }
    public  boolean containsDuplicates(int []arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i] == arr[j]) {
                    return true;
                }//end if

            }//end internal for

        }// end external for

        return false;
    }//end containsDuplicates()



    public static double avg (int[]arr){
        double sum=0.0;
        for( int i=0;i<=arr.length-1;i++){
            sum=sum+(double)arr[i];
        }
//        System.out.println(sum);
//        System.out.println(sum/arr.length);
        return sum/arr.length;
    }
    public static int lowestAverage(int [][]arr){
        ArrayList<Integer>listOfAvg=new ArrayList<>();
        int sum=0;
        int avg=0;
        int lowestAvg=0;
        int index=0;
        int i=0;
        for (i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                sum=sum+arr[i][j];
                listOfAvg.add(arr[i][j]);
            }//end internal for
            avg=sum/arr[i].length;
            System.out.println(sum);
            if(i==0){lowestAvg=avg;}
            if(avg<lowestAvg){lowestAvg=avg;index=i;

            }

            sum=0;
            avg=0;
        }// end external for
        System.out.println(lowestAvg);
        System.out.println("index="+index);
        return index;
    }
    public static String analyzingWeatherData(int[][] arr) {
        int maxTemp = arr[0][0];
        int minTemp = arr[0][0];
        String analyzedData = "";
        Set<Integer> tempretureData = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxTemp) {
                    maxTemp = arr[i][j];
                }
                if (arr[i][j] < minTemp) {
                    minTemp = arr[i][j];
                }
                tempretureData.add(arr[i][j]);
            }
            analyzedData = "High: " + maxTemp + "\n" + "Low: " + minTemp+"\n";


        }
        for (int i=minTemp;i<maxTemp;i++){
            if (!(tempretureData.contains(i))){
//                System.out.println(tempretureData.contains(i));
                analyzedData= analyzedData+"Never saw temperature: " + i+"\n";
            }

        }
//        System.out.println(analyzedData);
        return analyzedData;
    }
    public static String tally(List<String> passedVotes) {
        Map<String,Integer>votes=new HashMap<>();
        String winner="";
        int totalVotes=0;
        for (String i : passedVotes) {
            if (votes.containsKey(i)) {
                votes.put(i, votes.get(i) + 1);
            }
            else {
                votes.put(i, 1);
            }
        }
        for (String key : votes.keySet()) {
            if (votes.get(key) > totalVotes) {
                totalVotes = votes.get(key);
                winner = key;
            }
        }
        return winner;
    }


    }
