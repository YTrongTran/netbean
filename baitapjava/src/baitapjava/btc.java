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
public class btc {

    public static void main(String[] args) {
        //in ra giá trị nhỏ nhất trong 4 số 
        int a, b, c, d, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 4 số:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        min = a;
        if (min>b) {
            min=b;
        } 
        if (min>c) {
            min=c;
        }
        if (min>d) {
            min=d;
        }
        
        System.out.println("số nhỏ nhất:"+min);
    }
}
