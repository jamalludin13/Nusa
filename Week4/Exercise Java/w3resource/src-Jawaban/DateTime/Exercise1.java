/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTime;
import java.util.*;
/**
 *
 * @author Jamalludin
 */
public class Exercise1 {
    public static void main(String [] args){
        int date =1;
        int month= 1;
        int year = 2020;
        
        Calendar cal = Calendar.getInstance();
        
        cal.clear();
         cal.clear();
     System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

     System.out.println(cal.getTime());
     System.out.println();
	 }
}
  