package BTCHUNG.Cáckieudulieu;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class bt1nhapvtt {
    public static void main(String[] args) {
        String hovaten,diachi;
        double year;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin sinh viên: ");
        hovaten= sc.next();
        year=sc.nextDouble();
        diachi=sc.next();
        System.out.println("=> " + hovaten +"-"+ year +"-"+ diachi);
    }
    
}
