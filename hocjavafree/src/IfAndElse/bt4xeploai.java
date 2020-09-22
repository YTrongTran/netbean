/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfAndElse;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt4xeploai {
    public static void main(String[] args) {
        double diemchuyencan,diemkiemtra,diemthihocky,diemtrungbinh;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhập điểm chuyên cần: ");
        diemchuyencan=sc.nextDouble();
        System.out.println("nhập điểm kiểm tra: ");
        diemkiemtra=sc.nextDouble();
        System.out.println("nhập điểm thi học kỳ: ");
        diemthihocky=sc.nextDouble();
        diemtrungbinh=(diemchuyencan+diemthihocky+diemkiemtra)/3;
        if (diemtrungbinh>=8.5) {
            System.out.println("Xếp loại A.");
        } else {
            if (diemtrungbinh>=7 && diemtrungbinh<8.5) {
                System.out.println("Xếp loại B");
            } else {
                if (diemtrungbinh>=5.5 && diemtrungbinh<7) {
                    System.out.println("Xếp loại C");
                } else {
                    if (diemtrungbinh>=4 && diemtrungbinh<5.5) {
                        System.out.println("Xếp loại D");
                    } else {
                        System.out.println("Xếp loại F");
                    }
                }
            }
        }
    }
}
