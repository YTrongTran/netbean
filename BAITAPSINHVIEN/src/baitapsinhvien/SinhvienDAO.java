/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapsinhvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SinhvienDAO {
    List<BAITAPSINHVIEN> lssv = new ArrayList<>();
   
  
    public int add(BAITAPSINHVIEN BTSV){
    lssv.add(BTSV);
    return 1;
    }
  
    public int count(){
    
    return lssv.size();
    }
    public List<BAITAPSINHVIEN> getALLBTSINHVIEN(){
    return lssv;
    
    }
  
    
    
}
