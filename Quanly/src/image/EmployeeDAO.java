/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class EmployeeDAO {
    List<Emplyoee> lsee = new ArrayList<>();
    public int add(Emplyoee ee){
    lsee.add(ee);
    return 1;
    }
    public List<Emplyoee> getAll(){
    return lsee;
    }
    public int edit (Emplyoee ep){
        for (Emplyoee ee : lsee) {
    }
        return 1;
}
  

}
