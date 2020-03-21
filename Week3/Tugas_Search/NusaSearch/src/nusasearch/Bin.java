/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusasearch;

/**
 *
 * @author Jamalludin
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Bin {
    private ArrayList<Nasabah> person;
    private String key;
    

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
    

    /**
     * @return the person
     */
    public ArrayList<Nasabah> getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(ArrayList<Nasabah> person) {
        this.person = person;
    }
    
    
    public int BinarySearch(){
        int size=person.size();
        int first=0;
        int last=size-1;
        int middle=(first+last)/2;
        
        while( first <= last ){
                     
            if ( key.compareToIgnoreCase(person.get(middle).getNama()) < 0 ){
                last = middle - 1;
            }
            else if ( key.compareToIgnoreCase(person.get(middle).getNama()) > 0 ){
              first=middle+1;
            }
            else if (key.compareToIgnoreCase(person.get(middle).getNama())==0 ){
                return middle;  
            }             

          middle = (first + last)/2;
        }
        if ( first > last ){
          JOptionPane.showMessageDialog(null, "The  name you entered cannot be found in the database.", 
                  "Error", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }

    Bin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Bin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}