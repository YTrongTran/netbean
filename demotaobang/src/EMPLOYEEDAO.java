
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class EMPLOYEEDAO {
    public List<EMPLOYEE> ls = new ArrayList<>();
    public int add(EMPLOYEE ee){
    ls.add(ee);
    return 1;
    }
}
