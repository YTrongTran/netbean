/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class mangbt11 {

    static int a[] = new int[100];
    static int index = 0;

    public static void main(String[] args) {
        input();
        ouput();

    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int N;
        int c = 0;//chan

        int d = 0; // le
        do {
            System.out.println("nhập mảng:");
            a[index] = sc.nextInt();
            index++;
            System.out.println("chọn ? (0/1)");
            N = sc.nextInt();
        } while (!(N > 0 && N < 100));

    }

    public static void ouput() {
        for (int i = 0; i < index; i++) {
            System.out.println("=>" + a[i]);

        }

    }

}
