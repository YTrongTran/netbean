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
public class toantusosanh {

    public static void main(String[] args) {
        double number1, number2;
        double tong, hieu, thuong, chialaydu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ 1");
        number1 = sc.nextDouble();
        System.out.println("nhập số thứ 2: ");
        number2 = sc.nextDouble();
        tong = number1 + number2;
        hieu=number1-number2;
        thuong=number1/number2;
        chialaydu=number1%number2;

        System.out.println("tổng = " + tong + "-" + (number1==number2));
        System.out.println("hiệu = " + hieu );
        System.out.println("thuong = " + thuong );
        System.out.println("chia lấy dư = " + chialaydu);
      

    }
}
