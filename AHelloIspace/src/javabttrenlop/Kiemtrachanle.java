/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabttrenlop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Kiemtrachanle {
    public static void main(String[] args) {
        int check;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 1 so:");
        check = sc.nextInt();
        if (check % 2==0) {
            System.out.println("là số chẵn");
            
        } else {
            System.out.println("là số lẻ");
        }
        
     //   cách 1""
//        if (check % 2==0){
//            System.out.println("so chan:");
//       }
//       if (check % 2 !=0) {
//            System.out.println("so le:");
//            
//        }
//                    
    }
}
