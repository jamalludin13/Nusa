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
public class Exercise2 {
    public static void main(String[] args){
 
        Calendar cal = Calendar.getInstance();
        
            
        System.out.println();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println();
    }
}
