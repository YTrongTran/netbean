/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienTrongJava;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class Hienthirasomax {
    public static void main(String[] args) {
    int a, b, c, max=0;
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 3 số bất kì: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=a;
        if (max <= b) {
            max=b;
        }
        if (max <= c) {
            max = c;
            
        }
        System.out.println("giá trị số lớn nhất là "+max);
    }
    
    
            
            
    
}
