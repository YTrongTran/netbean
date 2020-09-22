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
public class bt1cham3 {

    public static void main(String[] args) {
        int n,temp = 1;
        long gt=1;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào 1 số nguyên:");
        n = sc.nextInt();
        while ((n<=0)||(n>10)) {            
            System.out.println("mời nhập lại n");
            n=sc.nextInt();
            
        }
        while (temp<=n) {
            gt=gt*temp;
            temp++;
//            (n=n-1)

        }
        System.out.println("n!= " + gt);
        
    }

}
