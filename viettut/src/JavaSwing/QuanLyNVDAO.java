/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class QuanLyNVDAO {
    List<QuanLyNV> ls = new ArrayList<>();
    public int add(QuanLyNV nv){
    ls.add(nv);
    return 1;
    }
    public int count(){
    return ls.size();
    }
    public QuanLyNV findBYID(String maNV){
        for (QuanLyNV nv: ls) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }
    public int edit(QuanLyNV n){
        for (QuanLyNV nv : ls) {
            if (nv.getMaNV().equalsIgnoreCase(n.getMaNV())) {
                nv.setTenNV(n.getTenNV());
                nv.setNgaySinh(n.getNgaySinh());
                nv.setGioiTinh(n.isGioiTinh());
                nv.setPhongBan(n.getPhongBan());
                return 1;
            }
        }
        return -1;
    }
    public int del(String maNV){
    QuanLyNV nv = findBYID(maNV);
        if (nv != null) {
            ls.remove(nv);
            return 1;
        }
        return -1;
    }
    public QuanLyNV getOneQuanLyNVAtPosition(int pos){
        return ls.get(pos);
    }
    public List<QuanLyNV> getALLQuanLY(){
    return ls;
    }
}