/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class Nhapvaothongtin {
    public static void main(String[] args) {
        String hovaten, diachi;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào thông tin: ");
        hovaten=sc.nextLine();
        year=sc.nextInt();
        diachi=sc.next();
        System.out.println("họ và tên: " + hovaten + " năm sinh " + year + " địa chỉ " + diachi );
    }
}
