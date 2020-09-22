/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuoiString;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class Chuoinhapvaosonguyen {
    
    public static void main(String[] args) {
        int soNumber;
    String chuoi="Alarm";
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("ban can nhap 1 so nguyen bat ky : ");
        soNumber=sc.nextInt();    
        } while (soNumber<1);
        for (int i = 0; i < soNumber; i++) {
            System.out.println(chuoi);
        }
    }
    
    
}
