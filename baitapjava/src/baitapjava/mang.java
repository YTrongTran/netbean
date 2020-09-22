/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class mang {

    static int a[] = new int[100];
    static int index = 0;

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int tt = 1;
        do {
            System.out.println("nhập mảng:");
            a[index] = sc.nextInt();
            index++;
            System.out.println("hoàn tất? (0/1)");
            tt = sc.nextInt();
        } while (tt == 1);
    }
}
