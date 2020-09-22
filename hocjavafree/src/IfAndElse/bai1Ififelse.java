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
public class bai1Ififelse {
    //yêu cầu nhập vào 3 từ bàn phím hiển thị ra số lớn nhất\
    public static void main(String[] args) {
        int a,b,c,max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 3 số từ bàn phím: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=a;
        if (max<b) {
            max=b;
        }
        if (max<c) {
            max=c;
        }
        System.out.println("kết quả số lớn nhất trong 3 chữ số: " +max);
    }
}
