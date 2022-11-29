import java.io.*;
import java.util.*;
 
public class Frequency {
   public static void main(String[] args) throws Exception {
      // create an empty hash map with integers as keys and integers as values
      HashMap<Integer, Integer> map = new HashMap<>();
 
      // create a Scanner object to read input from a file
      Scanner in = new Scanner(new File("filename.txt"));
 
      // read all numbers in the file and add them to the map
      while (in.hasNext()) {
         int num = in.nextInt();
         if (!map.containsKey(num)) {
            map.put(num, 1);
         }
         else {
            int count = map.get(num);
            map.put(num, count + 1);
         }
      }
 
      // print out the map
      for (int num : map.keySet()) {
         int count = map.get(num);
         System.out.println(num + "  " + count);
      }
 
      in.close();
	   
      // calculate the mean
      int sum = 0;
      int numValues = 0;
      for (int num : map.keySet()) {
         int count = map.get(num);
         sum += num * count;
         numValues += count;
      }
      double mean = (double) sum / numValues;
      System.out.println("The mean is: " + mean);
 
      // calculate the median
      int median = 0;
      int middle = numValues / 2;
      for (int num : map.keySet()) {
         int count = map.get(num);
         middle -= count;
         if (middle < 0) {
            median = num;
            break;
         }
      }
      System.out.println("The median is: " + median);
 
      // calculate the mode
      int mode = 0;
      int maxCount = 0;
      for (int num : map.keySet()) {
         int count = map.get(num);
         if (count > maxCount) {
            maxCount = count;
            mode = num;
         }
      }
      System.out.println("The mode is: " + mode);
 
      in.close();
   }
	
}

   