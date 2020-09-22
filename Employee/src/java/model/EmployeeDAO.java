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
 * @author Administrator
 */
public class EmployeeDAO {
    public static List<Emplyoee> ls = new ArrayList<>();
    public int add(Emplyoee ee){
    ls.add(ee);
    return 1;
    }
    public List<Emplyoee> getALL(){
    return ls;
    }
    public Emplyoee getByID(String id){
        for (Emplyoee e : ls) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
    public Emplyoee edit(Emplyoee eeNew){
        for (Emplyoee ee : ls) {
            if (ee.getId().equals(eeNew.getId())) {
                ee.setName(eeNew.getName());
                ee.setGender(eeNew.isGender());
                return ee;
            }
        }
        return null;
    }
}
