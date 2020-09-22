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
public class Ifelse {
    //if không có else
    //if -else

    public static void main(String[] args) {
        Double n ;
//        if (n%2 == 0 ) {
//            System.out.printf("%d là số chẳn  ", n);
//        }
//        if (n % 2 == 0) {
//            System.out.printf("%d là số chẳn",n);
//        } else {
//            System.out.printf("%d là số lẻ",n);
//        }
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập N số nguyên bất kì");
        n=sc.nextDouble();
        
        if (n % 1 == 0) {
            System.out.println(n+" là số nguyên");
        }else{
        System.out.println(n+" không phải số nguyên");
        }
    }
}
