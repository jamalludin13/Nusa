
package NusaSort;

/**
 *
 * @author Jamalludin
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BinarySearch {
    private ArrayList<Nasabah> person;
    private String key;
    

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    

    public ArrayList<Nasabah> getPerson() {
        return person;
    }

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
}



