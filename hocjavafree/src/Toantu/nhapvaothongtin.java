/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class nhapvaothongtin {

    public static void main(String[] args) {
        String hovaten;
        int namsinh;
        String diachi;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("họ và tên: ");
        hovaten = sc.nextLine();
        System.out.println("năm sinh: ");
        namsinh = sc.nextInt();
        System.out.println("địa chỉ ");
        diachi = sc.next();
    }
    
}
