/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusasearch;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import nusasearch.db;
import nusasearch.Nasabah;
import nusasearch.Bin;

/**
 *
 * @author Jamalludin
 */
public class NusaSearch {

    private ArrayList<Nasabah> person;
    private String key;

    /**
     * @param person the person to set
     */
    public void setPerson(ArrayList<Nasabah> person) {
        this.person = person;
    }

    
    
    /**
     * Implement the binary search algorithm based on the fields above
     */
    public int NusaSearch(){
        int size=person.size();
        
        for(int i=0; i<size; i++){
            if(person.get(i).getNama().compareTo(key)==0){
               return i; 
            }
        }
        return -1;
        
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
}