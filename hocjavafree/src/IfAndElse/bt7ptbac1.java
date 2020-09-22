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
public class bt7ptbac1 {
    //Viết chương trình giải phương trình bậc một ax + b = 0 

   //(với a, b là 2 số nguyên nhập từ bàn phím).
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a: ");
        a=sc.nextInt();
        System.out.println("nhập số b: ");
        b=sc.nextInt();
        if (a==0) {
            System.out.println("phương trình vô nghiệm.");
        } else {
            if (a!=0) {
                int x;
                x=-b/a;
                System.out.println("phương trình có nghiệm: "+x);
            }
        }
    }
}
