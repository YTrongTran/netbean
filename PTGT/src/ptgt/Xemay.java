/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptgt;

/**
 *
 * @author ADMIN
 */
//tạo lớp xe máy kế thừa PTGT
public class Xemay extends PTGT{
    private double congsuat;
    //tạo hàm khởi tạo
public Xemay(){}

    public Xemay(double congsuat, String hangsanxuat, String mau, int namsanxuat, double giaban) {
        super(hangsanxuat, mau, namsanxuat, giaban);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
   
    
}
