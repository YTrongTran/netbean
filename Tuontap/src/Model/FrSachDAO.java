/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class FrSachDAO {
    List<FrSachclass> lsS= new ArrayList<>();
    public int add(FrSachclass s){
    lsS.add(s);
    return 1;
    }
    public int count(){
    return lsS.size();
    
    }
    public List<FrSachclass> getALLSach(){
    return lsS;
    }
   
//    public int del(String id){
//    FrSachclass sl = findByID(id);
//        if (sl != null) {
//            lsS.remove(sl);
//                    return 1;
//        }
//    return -1;
//    }
    public int delFrSachById(String id){
        for (FrSachclass s : lsS) {
            if (s.getMaSach().equalsIgnoreCase(id)) {
                lsS.remove(s);
                return 1;
                
            }
        }
        return -1;
    }
     public FrSachclass getFrSachclassByID(String id){
        for (FrSachclass sl : lsS) {
            if (sl.getMaSach().equalsIgnoreCase(id)) {
                return sl;
            }
        }
        return null;
    }
     
    public FrSachclass getFrSachclassAtPoint(int position){
    return lsS.get(position);
    }
    public int edit(FrSachclass sl){
        for (FrSachclass l : lsS) {
            if (l.getMaSach().equals(sl.getMaSach())) {
                l.setTenSach(sl.getTenSach());
                l.setNgayNhap(sl.getNgayNhap());
                l.setChuyenNganh(sl.getChuyenNganh());
                l.setSoLuong(sl.getSoLuong());
                l.setGiaBan(sl.getGiaBan());
                return 1;
            }
        }
        return -1;
    }
}
