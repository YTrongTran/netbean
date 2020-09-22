/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class vantocxemay {
// 1 người đi xe máy trên quãng đường dài 40km mất 1 giờ , 40 phút và 12 giây.
//Hãy tính vận tốc của người đó(m/s),
//biết rằng trong suốt quãng đường vận tốc của người đó là không đổi.
//Kết quả làm tròn đến 3 chữ số thập phân.
    public static void main(String[] args) {
        double vantoc  ;
        int quangduong=40;
        int gio =1,phut=40,giay=12;
        int sogio = gio*60*60+phut*60+giay;
        DecimalFormat dcf = new DecimalFormat("#.###");
        //đổi quãng đường từ km sang m
        int quangduongmet= quangduong*1000;
        vantoc = (double ) quangduongmet / sogio;
        System.out.println("vận tốc = " + dcf.format(vantoc) +"m/s");
       
    }
}

