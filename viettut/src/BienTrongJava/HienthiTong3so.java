/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienTrongJava;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class HienthiTong3so {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yeu cau nhap vao 3 so");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Integer.sum(a, b);
        System.out.println("tong 3 so la "+Integer.sum((Integer.sum(a, b)), c));
    }
}
