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
public class bt2min {
    //hiển thị ra màn hình số nhỏ nhất trong 3 chữ số.
    public static void main(String[] args) {
        int a , b, c, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 chữ số: ");
        a= sc.nextInt();
        b = sc.nextInt();
        c= sc.nextInt();
        min=a;
        
        if (min>b) {
            min=b;
            
        }
        if (min>c) {
            min=c;
        }
        System.out.println("Số nhỏ nhất trong 3 chữ số là "+min);
    }
}
