/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class SinhvienDAO {
   public static List<Sinhvien> ls = new ArrayList<>();
   public SinhvienDAO(){
       
       ls.add(new Sinhvien("SV01", "Hong phong", "", "", true, "", ""));
       ls.add(new Sinhvien("SV02", "Le loi", "", "", true, "", ""));
       ls.add(new Sinhvien("SV03", "Le lai", "", "", true, "", ""));
       ls.add(new Sinhvien("SV04", "Nguyen trai", "", "", true, "", ""));
       ls.add(new Sinhvien("SV05", "Nguyen hue", "", "", true, "", ""));
       
   }
   public int add(Sinhvien sv){
    ls.add(sv);
    return 1;

    }
  public List<Sinhvien> getALlSinhvien(){    
  return ls;
  }
  public int count(){
      return ls.size();}

  public int findByMasv(String msv){
  int pos =-1;
      for (int i = 0; i < ls.size(); i++) {
          if (ls.get(i).getMaSV().equalsIgnoreCase(msv)) {
              pos=i;
          }
      }
      return pos;
  }
          
        
  public int del(int a){
  ls.remove(a);
  return 1;
  }
  public int editSinhvein(Sinhvien sv){
      for (Sinhvien st : ls) {
          if (st.getMaSV().equals(st.getMaSV())) {
              st.setTenSV(sv.getTenSV());
              st.setEmail(sv.getEmail());
              st.setPhone(sv.getPhone());
              st.setGioitinh(sv.isGioitinh());
              st.setDiachi(sv.getDiachi());
              st.setImages(sv.getImages());
              break;
          }
      }
      return 1;
      
  
  }
}
