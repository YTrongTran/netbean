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
public class bt1cham4toan {

    public static void main(String[] args) {
        int a, b;
        char kt;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 2 số nguyên a và b");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("nhập ký tự từ bàn phím +,-,*,/");
        kt = sc.next().charAt(0);
        switch (kt) {
            case '+':
                
                System.out.println("ket qua " + a + " + " + b + " = " + (a+b));
                break;
            case '-':
                 System.out.println("ket qua " + a + " - " + b + " = " + (a-b));
                break;
            case '*':
                 System.out.println("ket qua " + a + " * " + b + " = " + (a*b));
                break;
            case '/':
                if (b==0) {
                    System.out.println("không có giá trị. Số bị chia phải khác 0");
                } else {
                    System.out.println("kết quả " + a + " / " + b + " = " + (float) a/b);
                    break;
                }
            default:
                System.out.println("không có kết quả");
        }
    }
}
