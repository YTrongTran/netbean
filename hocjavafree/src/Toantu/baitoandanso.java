/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class baitoandanso {

//    Cục điều tra dân số Hoa Kỳ dự báo dân số năm tiếp theo dựa trên giả định sau
//    : Cứ 7 giây là có 1 trẻ em được sinh ra , 13 giây là có 1 người qua đời và 
//    45 giây là có 1 người nhập cư.Hãy viết chương trình tính toán dân số
//    của Hoa Kỳ trong 5 năm tiếp theo và hiển thị số dân của từng
//    năm.Giả sử số dân hiện tại của Hoa Kỳ là 312,032,486
//   người và một năm có 365 ngày.Kết quả được làm tròn đến 2 chữ số thập phân

    
    public static void main(String[] args) {
        int sotresinhra =7;
        int nguoiquadoi = 13;
        int nguoinhapcu = 45;
        double songuoidanhientai = 312032486;
        //tính số gio trong 1 năm
        int sogio = 365*24*60*60;
        //tính số trẻ em sinh ra trong 1 năm
        double soluongtreemsinhra= (double) sogio / sotresinhra;
        //tính số người qua đời.
        double soluongnguoiquadoi= (double) sogio / nguoiquadoi;
        //tính số người nhập cư
        double songuoidannhapcu = (double) sogio / nguoinhapcu;
        
     //5 năm tới
        for (int i =1; i <= 5; i++) {
         songuoidanhientai +=soluongtreemsinhra+songuoidannhapcu-soluongnguoiquadoi;
            System.out.println("năm " + i + " số người dân hiện tại " +(int) songuoidanhientai);
        } 
        
        
        
        
    }
}
