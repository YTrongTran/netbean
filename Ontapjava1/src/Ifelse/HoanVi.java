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
public class HoanVi {

    static void hoanViGanGiaTri() {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;//a=10
        b = temp;//b=5
        // System.out.printf( "\na = %d, b =%d ", a,b);
        System.out.println("a = " + a + " và " + " b = " + b);

    }

    static void hoanViNhapVao() {
        int c, d, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên c :");
        c = sc.nextInt();
        System.out.println("nhập vào số nguyên d :");
        d = sc.nextInt();
        /*giả sử c = 2 ; d =4 
        result = c; r =2
        c =d-> c= 4
        d = result; --> d =2
        */
        result =  c;
        c = d; 
        d = result;
        System.out.printf("\n c = %d , d = %d " , c,d);
        
    }

    public static void main(String[] args) {
        hoanViGanGiaTri();
        hoanViNhapVao();
    }
}
