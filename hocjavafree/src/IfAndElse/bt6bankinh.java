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
public class bt6bankinh {

    public static void main(String[] args) {
        int tungdoM, hanhdoM, tungdoO, hanhdoO, Bankinh,r;
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("nhập vào hành độ O: ");
        hanhdoO = sc.nextInt();
        System.out.println("nhập vào tung độ O: ");
        tungdoO = sc.nextInt();
         System.out.println("nhập vào hành độ M: ");
        hanhdoM = sc.nextInt();
        System.out.println("nhập vào tung độ M: ");
        tungdoM = sc.nextInt();
        System.out.println("nhập vào bán kính: ");
        Bankinh = sc.nextInt();

        int OM = (hanhdoM-hanhdoO)*(hanhdoM-hanhdoO)+((tungdoM-tungdoO)*(tungdoM-tungdoO));
       r=Bankinh*Bankinh;
        if (OM>r) {
            System.out.println("M nằm ngoài đường tròn");
        } else {
            if (OM==r) {
                System.out.println("M nằm trên đường tròn");
            } else {
                System.out.println("M nằm trong đường tròn");
            }
        }
    }
}
