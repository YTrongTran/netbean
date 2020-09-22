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
public class bt4tong3so {
    // hiển thị tổng của 3 số vừa nhập( ko sử dụng phép cộng hai số).
    public static void main(String[] args) {
        int a,b,c,total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 số nguyên: ");
        a= sc.nextInt();
        b= sc. nextInt();
        c= sc. nextInt();
        total = Integer.sum(a, b);
        System.out.println("Tổng của 3 số là " + a + "," + b + " và " + c + " kết quả là " 
        + Integer.sum(total, c));
    }
}
