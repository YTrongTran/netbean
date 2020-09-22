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
public class bt3tinhnamnhuan {
    //nhap vao 1 nam bat ky co phai la nam nhuan hay ko
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 nam bat ky: ");
        n=sc.nextInt();
        if (n%4 ==0) {
            if (n%100==0) {
                if (n%400==0) {
                    System.out.println("đây là năm nhuận.");
                } else {
                    System.out.println("không phải là năm nhuận");
                }
            } else {
                System.out.println("Đây là năm nhuận");
            }
           
        } else {
            System.out.println("khong phai nam nhuan ");
        }
    }
}
