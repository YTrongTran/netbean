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
public class Min {
    //hiển thị ra màn hình số nhỏ nhất trong 3 số đó.
    public static void main(String[] args) {
        int a,b,c,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số nguyên:");
        System.out.println("a:");
        a= sc.nextInt();
        System.out.println("b:");
        b=sc.nextInt();
        System.out.println("c:");
        c=sc.nextInt();
        min=a;
        if (min>b) {
          min=b;
            
        } else {
            if (min>c) {
               min=c;
            }
        }
        System.out.println("kết quả giá trị nhỏ nhất là " +min);
    }
}
