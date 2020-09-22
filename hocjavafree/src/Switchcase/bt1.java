/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switchcase;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1 {

    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ngày từ thứ 2 đến thứ 7 ");
        ngay = sc.nextInt();
        switch (ngay) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            default:
                System.out.println("nhập số không hợp lệ.");

        }
    }
}
