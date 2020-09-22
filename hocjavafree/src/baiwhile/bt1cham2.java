/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiwhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham2 {
    public static void main(String[] args) {
        int a,b,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên a và b:");
        a=sc.nextInt();
        b=sc.nextInt();
        k=a*b;
        while(b!=0){
            if (a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
        }
        System.out.println("Số ước chung lớn nhất: "+a);
        System.out.println("Số ước chung nhỏ nhất: "+k/a);
        
    }
}
