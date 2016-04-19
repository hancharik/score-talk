/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretalk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program reads data files of country populations and areas and prints the
 * population density for each country.
 */
public class PlayerScoreCalculator {

    
              static  int from;// = line1.indexOf("h");
                static int to;// = line1.lastIndexOf("f");
                static int from2;// = line1.indexOf("f");
                static int to2;// = line1.lastIndexOf("\t");
                 static String line1;
                 /* HungryLikeTheWolf:    "wereWolf.Wolf";////"lee0814.Wolf";//"ribau.Wolf";//
                    I ate granny: //"joe.Wolf";//"vella.Wolf";//"thesnake.Wolf";//
                 */
                 
                static String line2 = "wereWolf.Wolf";//"zeke.Wolf";//"rickyBobby.Wolf";//"hancharik.Wolf";//
                static String line3 = line2.substring(0);
                
                static int kfcs = 0;
                static ArrayList<String> names = new ArrayList();
                
               int intHolder = 0;
               String stringHolder = "";
    String date = "";
    String tempDate = "";
    int time = 777;
    
    public PlayerScoreCalculator() throws FileNotFoundException {
        
        
        names.add("wereWolf.Wolf");
       names.add("zeke.Wolf");
      names.add("rickyBobby.Wolf");
      names.add("thesnake.Wolf");
        
        
        for(int nextName = 0; nextName < names.size(); nextName++){
            
       line2 = names.get(nextName);
       line3 = line2.substring(0);
        
         scoretalk.TestTTS.jaby.sayWords("reading scores for " + line2);
        
        
        // Construct Scanner objects for input files
    
        ArrayList<String> fileNames = new ArrayList();
        ArrayList<Double> numbers = new ArrayList();
        
        File folder = new File("files/");
      File[] listOfFiles = folder.listFiles();

    for (int i = 0; i < listOfFiles.length; i++) {
      if (listOfFiles[i].isFile()) {
          String temp = listOfFiles[i].getName();
          fileNames.add(temp);
        System.out.println("this is the date we are recording "+listOfFiles[i].getName());
        tempDate = listOfFiles[i].getName();
      } else if (listOfFiles[i].isDirectory()) {
        System.out.println("Directory " + listOfFiles[i].getName());
      }
    }
        
        
        
        
        
        
     for(int i = 0; i < fileNames.size(); i++){   
        String temp = fileNames.get(i).toString();
         System.out.println();
        System.out.println(temp);
        Scanner in1 = new Scanner(new File("files/"+temp));

        // Construct PrintWriter for the output file
       // PrintWriter out = new PrintWriter("world_pop_density.txt");
        //System.out.println();
        // Read lines from each file

        while (in1.hasNextLine()) {
            line1 = in1.nextLine();
            if (line1.contains(line2)) {
                 from = line1.indexOf(line3);//from = line1.indexOf("z");
                 to = line1.lastIndexOf("f");//to = line1.lastIndexOf(line2.length()-1);//
                 //from2 = line1.indexOf("f");
                 //to2 = line1.lastIndexOf("\t");
                 //extractName(line1.substring(from, to + 11));
                numbers.add(extractValue(line1.substring(to + 6, to + 11)));
                  System.out.println(line1.substring(from, to + 11));//System.out.println(extractName(line1.substring(from, to + 11)));
               // System.out.println(line1.substring(to + 6, to + 11));
            }

            // System.out.println(line1);
            //extractName(line1);
            //System.out.println(line1.substring(from, to));
        }

        in1.close();
        if(numbers.size()>0){
            int temp45 = (int)(numbers.get(0) / numbers.get(1));
            if(temp45 > kfcs){
               kfcs = temp45; 
              if(kfcs > intHolder){
                 intHolder = kfcs;
                 stringHolder = line2;
                 date = temp;
              }
            }
            
            
          System.out.println("score/time: " + (int)(numbers.get(0) / numbers.get(1)));  
           
        }
   
   numbers.clear();
    }
     
      // scoretalk.TestTTS.frank.sayWords("   the k f c s. or kung fu calculation score. for " + line2 + " is " +  kfcs); 
      //  scoretalk.TestTTS.frank.sayWords(" k f c s.  an anagram for kung fu calculation high score. the high score in the category is " +  kfcs); 
      //   scoretalk.TestTTS.frank.sayWords("there is a new high score in the k f c s category. the new kung fu calculation high score is " + (int)(numbers.get(0) / numbers.get(1)));  
      }  
         scoretalk.TestTTS.jaby.sayWords("   the highest kung fu calculation score was " + kfcs + ". this was attained by " + line2 + " on april " +  getDay(date) + " at " + convertTime(time)); 
        // scoretalk.TestTTS.frank.sayWords("   the tournament champion is " + line2 + " with a score of " +  kfcs); 
    }  // end constructor

    /**
     * Extracts the country from an input line.
     *
     * @param line a line containing a country name, followed by a number
     * @return the country name
     */
    public static String extractName(String line) {
        int i = 0; // Locate the start of the first digit
        while (!Character.isWhitespace(line.charAt(i))) {
            i++;
        }
        return line.substring(0, i).trim(); // Extract the country name
    }

    /**
     * Extracts the value from an input line.
     *
     * @param line a line containing a country name, followed by a value
     * @return the value associated with the country
     */
    public double extractValue(String line) {
        int i = 0; // Locate the start of the first digit
        while (!Character.isDigit(line.charAt(i))) {
            i++;
        }
        // Extract and convert the value
        return Double.parseDouble(line.substring(i).trim());
    }
    
       public double stringToDouble(String line) {
        int i = 0; // Locate the start of the first digit
        while (Character.isDigit(line.charAt(i))) {
            i++;
        }
        System.out.println("i = " + i);
        // Extract and convert the value
        return Double.parseDouble(line.substring(0, i).trim());
    }
    
           public int getDay(String line) {
        
                System.out.println("here is line = " + line);
               System.out.println("here is line.substring(2, 4) = " + line.substring(2, 4));
                System.out.println("this should be the time = " + line.substring(4, 6));
               time = Integer.parseInt(line.substring(4, 6));
        // Extract and convert the value
        return Integer.parseInt(line.substring(2, 4)); // this should return 
           }
           
   public String convertTime(int time){
       System.out.println("THIS SHOULD BE 13 = " + time);
       switch(time){
           
           case 1 : return "one a m in the morning"; 
           case 3 : return "three a m in the morning";
           case 5 : return "five a m in the morning";
           case 7 : return "seven a m in the morning";
           case 9 : return "nine a m in the morning";
           case 11 : return "eleven a m in the morning"; 
           case 13 : return "one p m in the afternoon"; 
           case 15 : return "three p m in the afternoon"; 
           case 17 : return "five p m in the evening"; 
           case 19 : return "seven p m in the evening";
           case 21 : return "nine p m in the evening";
           case 23 : return "eleven p m in the evening";
           
           default : return "i do not have that number" + time + " in my translation tables";
       }
       
       
       
       
       
   }       
           
           
           
           
           
}
