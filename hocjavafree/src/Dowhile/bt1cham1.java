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
public class bt1cham1 {
    public static void main(String[] args) {
        int n,i=0;
        Scanner sc = new Scanner(System.in);
        long sum=0;
        do {     
            System.out.println("nhập vào số nguyên: ");
            n=sc.nextInt();
            sum+=i++;
        } while (i<=n);
        System.out.println("=>"+n+"-"+sum);
    }
    
}
