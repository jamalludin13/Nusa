/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NusaSort;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Jamalludin
 */

public class MainSearch {
    
    public static void main(String []args){
        
    }
    private String nama;
    private String searchType;
    private long startTime;
    private long endTime;


    public void setnama(String nama) {
        this.nama = nama;
    }

    /**
     * @param searchType the searchType to set
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
    
    /**
     *
     * @return
     */
    public Nasabah Search(){
        
        Nasabah personFound = null;
        /**
         * connect to db
         */        
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amatera", "root", "");
   
        }
        /**
         * Catch any error that occurs
         */
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong. Error Message: "+e.getMessage()
                    + "", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
      
            ArrayList<Nasabah> person=Person();
      
            
            switch (this.searchType) {
                case "Linear":
                    LinearSearch ln=new LinearSearch();
                    ln.setPerson(person);
                    ln.setKey(nama);
                   
                    
                    setStartTime(System.nanoTime());
                    int index=ln.LinearSearch();
                    setEndTime(System.nanoTime());

                 
                    personFound=person.get(index);
                    
                    break;
                case "Binary":
                              
                   Collections.sort(person, new MyComp());
                   BinarySearch bs=new BinarySearch();
                   bs.setKey(nama);
                   bs.setPerson(person);
                  
                    setStartTime(System.nanoTime());
                    int index2=bs.BinarySearch();
                    setEndTime(System.nanoTime());
                   
                     personFound=person.get(index2);
                    break;
                
            }
            return personFound;            
    }
   
    private ArrayList<Nasabah> Person(){
              
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_nusa", "root", "");
           
            ArrayList<Nasabah> person=new ArrayList<>();
            Statement stmt=con.createStatement();
            ResultSet rset=stmt.executeQuery("SELECT * FROM db_nusa");
            while(rset.next()){
                
                person.add(new Nasabah(rset.getString("nama"), rset.getString("alamatKantor"),
                rset.getString("alamatRumah"), rset.getString("password"), rset.getString("username")));
            }
           
            con.close();
            rset.close();
            
            return person;
        }
        catch(Exception e){
           
              e.printStackTrace();
        }
        return null;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    
    
}
