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
public class chiahet {
    public static void main(String[] args) {
        //n % d
        int n,d;
       n=5;d=5;
        if (n%d==0) {
            System.out.println("chi hết");
        } else {
            if (n%d!=0) {
                System.out.println("số dư");
            }
        }
        
    }
    
}
