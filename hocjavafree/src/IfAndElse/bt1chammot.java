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
public class bt1chammot {
    // nhập 1 số n từ bàn phím, sau đó kt rằng số đó lớn 5 in ra và nhỏ 5 in ra
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen tu keysboard: ");
        n=sc.nextInt();
        if (n>5) {
            System.out.println("so vua nhap la so " + n + " lon hon 5.");
        } else {
            System.out.println("so vua nhap la so " + n + " nho hon 5.");
        }
    }
}
