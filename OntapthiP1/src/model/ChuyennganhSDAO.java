/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class ChuyennganhSDAO {
    List<ChuyennganhS> cns = new ArrayList<>();
    public int add(ChuyennganhS cn){
    cns.add(cn);
    return 1;
    }
   public List<ChuyennganhS> getAllChuyenNganhS(){
       return cns;
   }
    public ChuyennganhSDAO(){
    cns.add(new ChuyennganhS("1", "JAVA"));
    cns.add(new ChuyennganhS("2", "HTML"));
    cns.add(new ChuyennganhS("3", "C++"));
    cns.add(new ChuyennganhS("4", "CSS"));
    cns.add(new ChuyennganhS("5", "CS6"));
    cns.add(new ChuyennganhS("6", "JAVA CAO CAP"));
    
    }

    public int find(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
