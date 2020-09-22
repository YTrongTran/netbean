/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monhoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MonhocDAO {
    List<Monhoc> ls = new ArrayList<Monhoc>();
    public int add(Monhoc mh) {
    ls.add(mh);
    return 1;
    
    
    }
    public int count (){
  return ls.size();
    
    }
    public List<Monhoc> getAllMonhoc(){
    return ls;
    
    }
    public int findByMaMon(String ma){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getMamon().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
        
    
    }
    public int edit(Monhoc m){
    int pos = findByMaMon(m.getMamon());
        if (pos>=0) {
            ls.set(pos, m);
            return pos;
        }
    return -1;
    
    }
    public List<Monhoc> getFind(String find){
    List<Monhoc> lsFind = new ArrayList<Monhoc>();
        for (Monhoc mh : lsFind) {
            if (mh.getMamon().contains(find)) {
                
                lsFind.add(mh);
                
            }
        }
        return lsFind;
    
    
    }
}
