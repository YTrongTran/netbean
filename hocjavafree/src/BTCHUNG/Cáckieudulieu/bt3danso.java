/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUNG.Cáckieudulieu;

/**
 *
 * @author Administrator
 */
public class bt3danso {
    //sodan=sltreemsinhra+songuoinhapcu-songuoiquadoi.
    public static void main(String[] args) {
        int soGiay1treemsinhra = 7;
        int soGiay1nguoiquadoi =13;
        int soGiay1nguoinhapcu = 45;
        double soDanhientai=312032486;
        //tính số giây trong 1 năm 365 ngay
        int soGiay=365*24*60*60;
       double soLuongtreemsinhra = (double) soGiay/soGiay1treemsinhra;
       double soluongnguoinhapcu = (double) soGiay/soGiay1nguoinhapcu;
       double soNguoiquadoi = (double) soGiay/soGiay1nguoiquadoi;
        //5 năm
        for (int i = 0; i < 5; i++) {
            soDanhientai+= soLuongtreemsinhra + soluongnguoinhapcu -soNguoiquadoi;
            System.out.println("Kết quả: " +i + "-" + (int)soDanhientai);
        }
        
    }
            
}
