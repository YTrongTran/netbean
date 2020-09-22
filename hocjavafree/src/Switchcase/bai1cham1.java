/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switchcase;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai1cham1 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên");
        number =sc.nextInt();
        switch(number){
            case 0:System.out.println("số 0");
            break;
                
            case 1:
            case 2:
                    System.out.println("số nhỏ");    
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println("số trung bình");
                break;
        default:         
                System.out.println("số lớn");
                
               
        }
    }
}
