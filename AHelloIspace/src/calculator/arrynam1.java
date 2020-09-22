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
public class arrynam1 {

    static String a[] = new String[100];
    static int index = 0;

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        String tt= "y";
        do {
            System.out.println("input name:");
            a [index] = sc.nextLine();
            index++;
            System.out.println("continue?(0/1)");
            tt = sc.nextLine();
        } while (tt.equalsIgnoreCase("y") && index < 100);

    }

    public static void output() {
        for (int i = 0; i < index; i++) {
            System.out.println("=>" + a[i]);
        }

    }}
