/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUNG.Cáckieudulieu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt4tinhtong {

    public static void main(String[] args) {
        int n, sodu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá số nguyên:");
        n = sc.nextInt();

        while (n > 0) {
            sodu = n % 10;
            n = n / 10;
            tong = tong + sodu;

        }
        System.out.println("kết quả là " + tong);
    }
}
