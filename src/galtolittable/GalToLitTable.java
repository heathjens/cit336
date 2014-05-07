/*
Book example 1-2 on page 27
 */

package galtolittable;

/**
 *
 * @author heatherjensen
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double gallons, liters;
       int counter;
       
       counter=0;
       for (gallons=1; gallons <= 100; gallons++){
           liters=gallons * 3.7854;
           System.out.println(gallons + " gallons is " + liters + " liters.");
           
           counter++;
           if(counter==10){
           System.out.println();
           counter=0;
       }
     }
   }
 }
