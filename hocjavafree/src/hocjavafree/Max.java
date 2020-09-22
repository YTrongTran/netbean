/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocjavafree;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Max {
    //hiển thị ra màn hình số lớn nhất trong 3 số đó
    public static void main(String[] args) {
        int a,b,c,max;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số nguyên:");
        System.out.println("a:");
        a=sc.nextInt();
        System.out.println("b:");
        b=sc.nextInt();
        System.out.println("c:");
        c=sc.nextInt();
        max=a;
        if (max<b) {
            max=b;
        } else {
            if (max<c) {
                max=c;
            }
        }
        System.out.println("kết quả số lớn nhất trong 3 số đó là " +max);
    }
}
