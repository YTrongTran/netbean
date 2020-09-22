/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class Luong {

    /*
 để nhập lương nhân viên, tính thuế thu nhập và lương ròng (số tiền lương thực sự mà nhân viên đó nhận được) 
 với các thông số đã cho.
Giả sử bạn là kế toán cho một công ty. Bạn cần viết một chương trình C++ để nhập lương nhân viên
 , tính thuế thu nhập và lương ròng (số tiền lương thực sự mà nhân viên đó nhận được).
 Với các thông số sau (mình chỉ đưa ra các con số này cho dễ tính toán):
30% thuế thu nhập nếu lương là 15 triệu
20% thuế thu nhập nếu lương từ 7 đến 15 triệu
10% thuế thu nhập nếu lương dưới 7 triệu
     */
    public static void main(String[] args) {
        float luong;
        double sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập lương  của các công nhân: ");
        luong = sc.nextFloat();
        if (luong < 7000) {
            sum = luong - (luong * 0.1);
            System.out.println("tổng tiền lương của các nhân viên sau khi trừ thuế: " + sum);
        } else if (luong > 7000 && luong < 15000) {
            sum = luong - (luong * 0.2);
            System.out.println("tổng tiền lương của các nhân viên sau khi trừ thuế: " + sum);
        } else if (luong >= 15000) {
            sum = luong - (luong * 0.3);
            System.out.println("tổng tiền lương của các nhân viên sau khi trừ thuế: " + sum);
        }

    }
}
