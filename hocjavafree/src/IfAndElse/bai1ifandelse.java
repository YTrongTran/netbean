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
public class bai1ifandelse {
    // kiểm tra số vừa nhập chẳn hay lẻ.
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        n = sc.nextInt();
        if (n%2==0) {
            System.out.println("số chẳn.");
        } else {
            System.out.println("số lẻ.");
        }
    }
}
