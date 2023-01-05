/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spetest;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Arrays;
import static jdk.internal.org.objectweb.asm.util.Printer.TYPES;

/**
 *
 * @author Etrio Widodo
 */
public class SpeSkillTest {

    /**
     * @param args the command line arguments
     */
     static int countDig(int num) {
      if (num == 0)
         return 0;
         return 1 + countDig(num / 10);
   }
     
    static boolean checkNarcissistic(int num) {
      
        
      //declare a variable and store the counts of digits
      int p = countDig(num);
      
      //declare a variable and temporary store the input number
      int temp = num;
      
      //Declare a variable which store the sum value and initiate it with 0
      int sum = 0;
      
      //execute the loop
      while(temp > 0) {
         
         //extarct digits and find power of it
         
         //continuously add it to sum value
         sum+= pow(temp % 10, p);
         
         //removes the digit which is already calculated
         temp = temp / 10;
      }
      
      //return true if original number is equal to the sum value
      return (num == sum);
   }
    
    static int cekNeedle(String[] arrayNeedle,String findIndex){
        
        return Arrays.asList(arrayNeedle).indexOf(findIndex);
    }
    
    static ArrayList<Integer> cekBlue(int[] arrayBlue,int[] arrayBlueRem){
        
         ArrayList<Integer> arr_new = new ArrayList<Integer>();
         
         for(int i = 0 ;i<arrayBlue.length;i++){
             arr_new.add(arrayBlue[i]);
         }
         
         for(int j = 0 ;j<arrayBlue.length;j++){
                for(int k = 0 ;k<arrayBlueRem.length;k++){
                    if(arrayBlue[j]==arrayBlueRem[k]){
                      arr_new.remove(j);  
                    }
                    
                }
         }
        return arr_new;
    }
    
    public static void main(String[] args) {
        // Narsistik
        int inputNumber = 111;
        System.out.println(checkNarcissistic(inputNumber));    
        
        
        //PARITY OUTLIER
        int[] Parity = {2, 4, 0, 100, 4, 11, 2602, 36};
        
        //NEEDLE IN THE HAYSTACK
        String[] arrayNeedle = {"red","blue","yellow","black","grey"};
        String findIndex    = "red";
        System.out.println(cekNeedle(arrayNeedle,findIndex));
        
        //THE BLUE OCEAN REVERSE
        int[] arrayBlue     = {1,2,3,4,6,10};
        int[] arrayBlueRem  = {2,3};
        System.out.println(cekBlue(arrayBlue,arrayBlueRem));
        
        
        
    }
    
    
    
}
