/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NusaSort;

import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
import java.util.ArrayList;

public class LinearSearch {
    private ArrayList<Nasabah> person;
    private String key;

    /**
     * @param person the person to set
     */
    public void setPerson(ArrayList<Nasabah> person) {
        this.person = person;
    }

    public int LinearSearch(){
        int size=person.size();
        
        for(int i=0; i<size; i++){
            if(person.get(i).getNama().compareTo(key)==0){
               return i; 
            }
        }
        return -1;
        
    }

    public void setKey(String key) {
        this.key = key;
    }
}
