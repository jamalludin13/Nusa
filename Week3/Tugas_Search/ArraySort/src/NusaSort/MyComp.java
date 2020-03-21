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

import java.util.Comparator;

public class MyComp implements Comparator<Nasabah> {

    @Override
    public int compare(Nasabah o1, Nasabah o2) {
        return o1.getNama().compareToIgnoreCase(o2.getNama());
    }

}