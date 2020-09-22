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
public class bt8Xacdinhtuoi {
    public static void main(String[] args) {
       String name;
       int year,tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        name=sc.nextLine();
        System.out.println("nhập tuổi: ");
        year=sc.nextInt();
         tuoi=2019-year;
        if (tuoi<16) {
            System.out.println("Bạn " + name + " độ tuổi vị thành niên là " + year + " tuổi ");
        } else { 
            if (tuoi>=16 && tuoi<18) {
                System.out.println("Bạn " + name + " độ tuổi trưởng thành là " + year + " tuổi ");
            } else {
                if (tuoi>=18) {
                    System.out.println("Bạn " + name + " tuổi đã già là " + year + " tuổi ");
                }
            }
        }
    }
    
}
