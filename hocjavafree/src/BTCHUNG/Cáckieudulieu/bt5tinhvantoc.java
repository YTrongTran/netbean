package BTCHUNG.Cáckieudulieu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class bt5tinhvantoc {
    //s=40km/h mất 1 giờ,40p,12s.
    //v(m/s)
    public static void main(String[] args) {
        int Quangduong= 40 ;
        int time = 6012;
    double  vantoc;
    int quangduongmet =40*1000;
      vantoc =(double) quangduongmet/ time;
        System.out.println("vận tốc là "+vantoc +"m/s");
    }
}
