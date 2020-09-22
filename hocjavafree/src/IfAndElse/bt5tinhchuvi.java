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
public class bt5tinhchuvi {
    public static void main(String[] args) {
       float a,b,c,chuvi;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 3 số a,b,c: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
     
        
        //trong một tam giác, tổng độ dài 2 cạnh bất kỳ bao giờ cũng
        //lớn hơn cạnh còn lại
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            
        chuvi=a+b+c;
            System.out.println("chu vi = "+chuvi);
        } else {
            System.out.println("không tồn tại tam giác");
        }
        
    }
}
