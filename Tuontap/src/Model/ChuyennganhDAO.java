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
public class ChuyennganhDAO {
    List<Chuyennganh> lsCN=new ArrayList<>();

    public ChuyennganhDAO() {
        lsCN.add(new Chuyennganh("1", "JAVA"));
        lsCN.add(new Chuyennganh("2", "HTML"));
        lsCN.add(new Chuyennganh("3", "CSS"));
        lsCN.add(new Chuyennganh("4", "CS6"));
        lsCN.add(new Chuyennganh("5", "C++"));
        
    }
    public int add(Chuyennganh cn){
    lsCN.add(cn);
    return 1;
    
    }
    public List<Chuyennganh> getALLChuyennganh(){
    return lsCN;
    
    }
    
}
