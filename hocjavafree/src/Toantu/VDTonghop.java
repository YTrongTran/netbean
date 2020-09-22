/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VDTonghop {
//  Viết chương trình tính thể tích và diện tích bề mặt của một hình cầu 
//với bán kính r nhập vào từ bàn phím (r > 0). 
//Kết quả chỉ cần lấy 2 chữ số thập phân. Công thức tính như sau:
//Thể tích = (4/3) * PI * r3.
//Diện tích bề mặt = 4 * PI * r2.+
    public static final float PI=3.14f;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat= new DecimalFormat("#.##");
        System.out.println("Nhập vào bán kính hình cầu (r>0)");
        float r =sc.nextFloat();
        //tính diện tích bề mặt
        float dientich = 4 * PI *r*r;
        System.out.println("Diện tích hình cầu = " + decimalFormat.format(dientich));
        float thetich = ((float)4/3) * PI * r*r*r;
        System.out.println("Thể tích hình cầu = " + decimalFormat.format(thetich));
    }
}
