/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocjavafree;

import java.util.Scanner;
import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

/**
 *
 * @author Administrator
 */
public class Tong3sovuanhap {
    //Hiển thị tổng của 3 số vừa nhập (không sử dụng phép cộng hai số). 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 số:");
        int a,b,c;
        System.out.println("Nhập số a:");
        a=sc.nextInt();
        System.out.println("Nhập số b:");
        b=sc.nextInt();       
        System.out.println("Nhập số c:");
        c= sc.nextInt();
        int tempsum = Integer.sum(a, b);
        System.out.println("Tổng của 3 số vừa nhập là " + a + " , " + b + " và " + c + " kết quả = " + Integer.sum(tempsum, c) );
              
    }
}
