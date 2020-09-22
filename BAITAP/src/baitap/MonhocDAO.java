/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class MonhocDAO {
    List<Monhoc> ls = new ArrayList<>();
    public int add(Monhoc mh){
    ls.add(mh);
    return 1;
    }
    public int findById ( String id){
    int pos =-1;
            for (int i = 0; i <ls.size(); i++) {
                if (ls.get(i).getMaMonhoc().equalsIgnoreCase(id)) {
                    pos=i;
                }
            }
            return pos;
    }
    public Monhoc findMonhocById(String id){
    Monhoc mh= null;
        for (Monhoc l : ls) {
            if (l.getMaMonhoc().equalsIgnoreCase(id)) {
                mh=l;
                break;
            }
        }
    return mh;
    }
    public int del(String id){
    int pos = findById(id);
        if (pos >=0) {
            ls.remove(pos);
        }
        return pos;
    
    }
    public int count(){
    return ls.size();
    }
}
