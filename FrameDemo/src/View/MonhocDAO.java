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
public class MonhocDAO {
    List<MonHoc> ls = new ArrayList<>();
    public int add(MonHoc mh){
    ls.add(mh);
    return 1;
    }
    public int findByID(String id){
    int pos =-1;
        for (int i = 0; i <ls.size(); i++) {
            if (ls.get(i).getMaMon().equalsIgnoreCase(id)) {
                pos = i;
            }
        }
        return pos;
    }
    public MonHoc findMonHocByID(String Id){
    MonHoc mh =null;
        for (MonHoc l : ls) {
            if (l.getMaMon().equalsIgnoreCase(Id)) {
                mh=l;
                break;
            }
        }
        return mh;
    
    }
        public int del(String id){
        int pos =findByID(id);
            if (pos>=0) {
                ls.remove(pos);
            }
            return pos;
        }
        
    public int count(){
    return ls.size();
    
    }
}
