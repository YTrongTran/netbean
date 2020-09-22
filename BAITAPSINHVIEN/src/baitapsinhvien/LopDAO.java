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
public class LopDAO {
    List<Lop> lsl = new ArrayList<Lop>();
 public LopDAO(){
 lsl.add(new Lop(1, "18O1"));
  lsl.add(new Lop(2, "18OM1"));
   lsl.add(new Lop(3, "18SC1"));
    lsl.add(new Lop(4, "18LT1"));
 }   
 public int add(Lop Lp){
 lsl.add(Lp);
 return 1;
 }
 public List<Lop> getALLLOP(){
 return lsl;
 }
}
    
