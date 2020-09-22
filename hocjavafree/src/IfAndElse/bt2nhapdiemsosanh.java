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
public class bt2nhapdiemsosanh {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap  diem java lap trinh: ");
        a=sc.nextInt();
        System.out.println("nhap diem java web: ");
        b=sc.nextInt();
        if (a>b) {
            System.out.println( a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }
                
    }
}
