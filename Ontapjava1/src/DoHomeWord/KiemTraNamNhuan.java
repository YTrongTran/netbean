/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoHomeWord;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class KiemTraNamNhuan {
    //năm nhuận năm chia hết 400 và 100  và chia hết cho 4
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm vào : ");
        year = sc.nextInt();
        
        if (year%400 == 0 || (year%100 != 0)&&(year%4 == 0) ) {
            System.out.println("là năm nhuận");
        }else {
        System.out.println("ko phải là năm nhuận");
        }
    }
}
