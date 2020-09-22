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
public class bt1cham5 {

    public static void main(String[] args) {
        int  month;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng");
        month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày");
            case 2:
               int year;
                System.out.println("mời bạn nhập năm");
                 year=sc.nextInt();
                if ((year %4 == 0 && year %100 != 0)||(year % 400==0) ) {
                    System.out.println("tháng có 29 ngày");
                } else {
                    System.out.println("tháng có 28 ngày");
                }
                break;
            default:
                System.out.println("không hiện thông báo.");

        }
    }
}
