/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import frthi.FrEmployeee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class FrEmployeeDAO {
    List<FrEmployeee> lsF = new ArrayList<>();
    public int add(FrEmployeee f){
        lsF.add(f);
        return 1;
            }
    public List<FrEmployeee> getALEmployees() {
    return lsF;
    }
    public int count(){
    return lsF.size();
    }
    public FrEmployeee findByID(String id){
        for (FrEmployeee f : lsF) {
            if (f.getID().equalsIgnoreCase(id)) {
                return f;
            }
        }
        return null;
        
    }
    public int dellByID(String id){
        for (FrEmployeee f : lsF) {
            if (f.getID().equalsIgnoreCase(id)) {
                lsF.remove(f);
                return 1;
            }
        }
        return -1;
    }
    public int edit(FrEmployeee er){
        for (FrEmployeee f : lsF) {
            if (f.getID().equalsIgnoreCase(er.getID())) {
                f.setName(er.getName());
                f.setGender(er.isGender());
                f.setBirthday(er.getBirthday());
                f.setSalary(er.getSalary());
                f.setDepartment(er.getDepartment());
                return 1;
            }
            
        }
        return -1;
    }
    
}
