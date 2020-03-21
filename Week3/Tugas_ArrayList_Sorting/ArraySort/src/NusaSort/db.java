/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NusaSort;

/**
 *
 * @author Jamalludin
 */ 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import NusaSort.Nasabah;
 
public class db {
    public static void main(String[] args) throws SQLException {
        ArrayList<Nasabah> nasabahlist = new ArrayList<Nasabah>();
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_nusa";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();
            ResultSet srs = st.executeQuery("SELECT * FROM Nasabah");
            while (srs.next()) {
                Nasabah nasabah = new Nasabah();
                nasabah.setId(srs.getInt("id_nasabah"));
                nasabah.setNama(srs.getString("nama"));
                nasabah.setNik(srs.getInt("nik"));
                nasabahlist.add(nasabah);
            }
 
            System.out.println(nasabahlist.size());
            System.out.println(nasabahlist.get(1).getName());
            System.out.println(nasabahlist.get(2).getName());
            System.out.println(nasabahlist.get(3).getName());
            System.out.println(nasabahlist.get(4));
 
        //System.out.println(namelist.);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

}
