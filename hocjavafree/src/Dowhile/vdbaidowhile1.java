/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dowhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class vdbaidowhile1 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("nhập vào 1 số nguyên: ");
            n = sc.nextInt();
            sum = sum + n;
        } while (sum < 100);
        System.out.println("kết quả " + sum);
    }
}
