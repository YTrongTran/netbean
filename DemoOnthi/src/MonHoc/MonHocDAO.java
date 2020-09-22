/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonHoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MonHocDAO {
    public static List<Monhoc> ls = new ArrayList<>();
    public MonHocDAO(){}
    public int add(){
        Monhoc nh = new Monhoc();
    ls.add(nh);
    return 1;
    }
    public List<Monhoc> getAllMonhoc(){
    return ls;
    }
    public int dell(int id){
        for (Monhoc l : ls) {
            if (id == l.getMaMonHoc()) {
                ls.remove(l);
                return 1;
            }
        }
        return -1;
    }
   
}
