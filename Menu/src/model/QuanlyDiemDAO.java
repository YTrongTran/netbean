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
public class QuanlyDiemDAO {
    List<QuanlyDiiemPanel> lsDiem = new ArrayList<>();
    public int add(QuanlyDiiemPanel d){
    lsDiem.add(d);
    return 1;
    
    }
    public List<QuanlyDiiemPanel> getDiiemPanels(){  
        return lsDiem;
       
    }

    public QuanlyDiiemPanel find(String id){
        for (QuanlyDiiemPanel ql : lsDiem) {
            if (ql.getSv().getMaSV().equalsIgnoreCase(id)) {
                return ql;
            }
        }
    return null;
    }
    public int del(String id){
        QuanlyDiiemPanel ql =find(id);
        if (ql != null) {
            lsDiem.remove(ql);
            return 1;
            
        }
        return -1;
    }
    
    public int editQuanLydiem(QuanlyDiiemPanel ql){
        for (QuanlyDiiemPanel qld : lsDiem) {
            if (qld.getSv().getMaSV().equals(ql.getSv())) {
                qld.setDiemAV(ql.getDiemAV());
                qld.setDiemGDTC(ql.getDiemGDTC());
                qld.setDiemTin(ql.getDiemTin());
                break;
            }
        }
        return 1;
    }
    public QuanlyDiiemPanel getAtDiem(int position){
    
    return lsDiem.get(position);
    
    }
    
}
