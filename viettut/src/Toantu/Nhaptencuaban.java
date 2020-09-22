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
public class Nhaptencuaban {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên của bạn.");
        name=sc.next();
        System.out.println("họ và tên là "+name);
    }
}
