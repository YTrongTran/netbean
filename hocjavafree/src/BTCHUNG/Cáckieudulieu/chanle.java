/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUNG.Cáckieudulieu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class chanle {

    public static void Sochan(){
        int n,sum=0;
    Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên");
        n=sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (n % 2==0) {
                System.out.println("=>"+i);
                sum+=i;
            }
            i++;
            
        }
        
        
       
    }
    public static void main(String[] args) {
        Sochan();
    }
}
