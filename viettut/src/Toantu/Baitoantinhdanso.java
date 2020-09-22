/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

/**
 *
 * @author trany
 */
public class Baitoantinhdanso {
    public static void main(String[] args) {
        int soGiaytreemsinhra =7;
        int soGiaynguoiquadoi  =13;
        int soGiaynguoinhapcu = 45;
        double dansohientai=312032486;
                
        // tính sô giây 1 trong nă,
        int soGiay =365*24*60*60;
        //so luong tre em sinh ra trong 1 nam
        double soluongtreemsinhra= (double) soGiay / soGiaytreemsinhra;
        //so luong nguoi qua doi trong 1 nam qua
        double songuoiquadoi=(double) soGiay/soGiaynguoiquadoi;
        //so nguoi nhap cu trong 1 năm qua;
        double songuoinhapcu = (double)soGiay/soGiaynguoinhapcu;
        for (int i = 0; i < 5; i++) {
            dansohientai +=soluongtreemsinhra+songuoinhapcu-songuoiquadoi;
            System.out.println("số dân theo năm: "+dansohientai); 
                    
        }
        
    }
    
}
