/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabttrenlop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class sinhvien {

    public static void main(String[] args) {
        //nhap msv, tensv, toan, ly, hoa
        // tinh tong diem
        //diem trung binh
        //xep loai dtb>8 gioi
        //dtb>7 kha
        //dtb>5 tb
        ////dtb<5 yeu
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        int msc;
        msc = (int) sc.nextDouble();
        System.out.println("msc:" + msc);
        String tensv;
        tensv = sc.next();
        System.out.println("ho va ten:" + tensv);
        double toan =10, ly = 5, hoa = 10;
        double tongdiem = ((toan + ly + hoa));
        double dtb = (tongdiem) / 3;
        String xl = "";
        System.out.println("tong diem =" + tongdiem);
        System.out.println("diem trung binh = " + dtb);
        if (dtb > 8) {
            xl = "Gioi";

        } else {
            if (dtb > 7) {
                xl = "kha";
            } else {
                if (dtb > 5) {
                    xl = "trungbinh";

                } else {
                    xl = "yeu";
                }
            }
        }
        System.out.println("xep loai:" +xl);
    }

}
