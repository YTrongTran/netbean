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
public class baitapvenha {

    static int a[] = new int[100];
    static int index = 0;

    public static void main(String[] args) {
        input();
        ouput();
        chan();
        le();
        tongtb();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int tt = 1;
        do {
            System.out.println("nhập mảng:");
            a[index] = sc.nextInt();
            index++;
            System.out.println("coution(1/0)");
            tt = sc.nextInt();
        } while (tt == 1);
    }

    public static void ouput() {
        for (int i = 0; i < index; i++) {
            System.out.println("=>" + a[i]);
        }
    }

    //in ra phan tử chẵn có trong mang
    public static void chan() {
        System.out.println("số chẵn là");
        for (int i = 0; i < index; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("=>" + a[i]);
            }
        }

    }

    //tính tong phan tử le trong mang
    public static void le() {
        int sum = 0;
        System.out.println("số lẻ là:");
        for (int i = 0; i < index; i++) {
            if (a[i] % 2 != 0) {

                System.out.println("=>" + a[i]);
                sum += a[i];

            }

        }
        System.out.println("tổng phần tử số lẻ = " + sum);
    }

    //. tinh tbc so chia het cho 3 avg
    public static void tongtb() {
    
        int sum = 0;
        for (int i = 0; i < index; i++) {
            if (a[i] % 3 == 0) {

                sum += a[i];
                System.out.println("=>" + a[i]);

            }
            

        }
        System.out.println("sum" +sum);
        System.out.println("avg: " + sum/3);

    }

}
