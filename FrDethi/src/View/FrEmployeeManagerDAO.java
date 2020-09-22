/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.frEmployeeManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class FrEmployeeManagerDAO {
    List<frEmployeeManager> lsM = new ArrayList<>();
    public int add(frEmployeeManager fr){
    lsM.add(fr);
    return 1;
    }
    public List<frEmployeeManager> getALEmployeeManagers(){
    return lsM;
    }
    public frEmployeeManager findByid(String id){
        for (frEmployeeManager ff : lsM) {
            if (ff.getId().equalsIgnoreCase(id)) {
                return ff;
            }
        }
    return null;
    }
    public int dell( String id){
    frEmployeeManager ff = findByid(id);
        if (ff != null) {
            lsM.remove(ff);
            return 1;
        }
        return -1;
    }
    public int editByID(frEmployeeManager f){
        for (frEmployeeManager ff : lsM) {
            if (ff.getId().equalsIgnoreCase(f.getId())) {
                ff.setName(f.getName());
                ff.setGender(f.isGender());
                ff.setBirthday(f.getBirthday());
                ff.setSalary(f.getSalary());
                ff.setDepartment(f.getDepartment());
                return -1;
            }
        }
        return 1;
    }
    
    
}
