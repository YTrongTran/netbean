/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienvaHangSo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt3chuyendoi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner  sc = new Scanner(System.in);
        System.out.println("nhập 3 chữ số: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("chuyển đổi từ nhịn phân " + a + " - " + b + " - " 
                + c + " = " + Integer.toBinaryString(a) +
                " - " + Integer.toBinaryString(b) + " - " + Integer.toBinaryString(c));
        System.out.println("chuyển đổi từ thập lục phân " + a + " - "+ b + " - "+ c + " = "
                + Integer.toHexString(a) + " - "+ Integer.toHexString(b) + " - "
        + Integer.toHexString(c));
        System.out.println("chuyển đổi từ bát phân " + a + "-" + b + "-" + c + "="
        + Integer.toOctalString(a) + "-" +Integer.toOctalString(b) + "-" + Integer.toOctalString(c));
        
    }
}
