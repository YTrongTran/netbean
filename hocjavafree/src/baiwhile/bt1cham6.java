/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiwhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham6 {
    public static void main(String[] args) {
        int n,sodu,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên:");
        n=sc.nextInt();
        while(n>0){   
               sodu=n%10;
               sum+=sodu;
            n=n/10;

        }
        System.out.println("kết quả "+sum);
    }
}
