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
public class FrThongTinDAO {
    List<FrThongTin> lsTT = new ArrayList<>();
    public int add(FrThongTin tt){
    lsTT.add(tt);
    return 1;
    }
    public List<FrThongTin> getAllThongtin(){
    return lsTT;
    }
    public FrThongTin findBYID(String id){
        for (FrThongTin tt : lsTT) {
            if (tt.getmSach().equalsIgnoreCase(id)) {
                return tt;
            }
        }
        return null;
    
    }
public int edit(FrThongTin t){
    for (FrThongTin tt : lsTT) {
        if (tt.getmSach().equalsIgnoreCase(t.getmSach())) {
            tt.settSach(t.gettSach());
            tt.setChuyenNganh(t.getChuyenNganh());
            tt.setNgayNhap(t.getNgayNhap());
            tt.setSoLuong(t.getSoLuong());
            tt.setGiaBan(t.getGiaBan());
            return -1;
        }
    }
return 1;    
}
public int del(String id){
FrThongTin t =findBYID(id);
    if (t != null) {
        lsTT.remove(t);
        return 1;
    }
return -1;

}
public FrThongTin getOneFrThongTinATPosition(int pos){
return lsTT.get(pos);
}
    
}
