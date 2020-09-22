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
public class bt1max {
    //Hiển thị ra màn hình số lớn nhất trong 3 chữ số.
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 3 số: ");
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
        System.out.println("Số lớn nhất trong 3 số là "+max);
       
    }
   
}
