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
public class bai1Swtichdongian {

    //nhập vào 1 số nguyên từ 1-12 tháng.
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng: ");
        thang = sc.nextInt();
        switch (thang) {
            case 1:
                System.out.println("tháng 1.");
                break;
            case 2:
                System.out.println("tháng 2. ");
                break;
            case 3:
                System.out.println("tháng 3. ");
                break;
            case 4:
                System.out.println("tháng 4. ");
                break;
            case 5:
                System.out.println("tháng 5. ");
                break;
            case 6:
                System.out.println("tháng 6. ");
                break;
            case 7:
                System.out.println("tháng 7. ");
                break;
            case 8:
                System.out.println("tháng 8. ");
                break;
            case 9:
                System.out.println("tháng 9. ");
                break;
            case 10:
                System.out.println("tháng 10. ");
                break;
            case 11:
                System.out.println("tháng 11. ");
                break;
            case 12:
                System.out.println("tháng 12. ");
                break;

            default:
                System.out.println("nhập vào tháng 1-12.");
               

        }

    }
}
