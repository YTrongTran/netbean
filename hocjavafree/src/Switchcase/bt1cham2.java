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
public class bt1cham2 {
    public static void main(String[] args) {
        char kt;
    Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 ký tự vào ");
    kt =sc.next().charAt(0);
    switch(kt){
        case 'a':
        case 'o':
        case 'e':
        case 'u':
        case 'y':
        case 'i':
            System.out.println("day la ky tu nguyen am");
            break;
        default:
            System.out.println("khong phai nguyen am");
        
            
    
    }
    
    }
   
    
}
