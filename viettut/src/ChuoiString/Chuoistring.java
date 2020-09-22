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
public class Chuoistring {
    public static void main(String[] args) {
        String hovaten1;
    String hovaten2;
    int result;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
    hovaten1=sc.nextLine();
    hovaten2=sc.nextLine();
    result=hovaten1.compareToIgnoreCase(hovaten2);
        if (result==0) {
            System.out.println("chuoi " + hovaten1 + " = " + hovaten2);
        } else {
            if (result<0) {
                System.out.println("chuoi " + hovaten1 + " < " + hovaten2);
            } else {
                
                    System.out.println("chuoi " + hovaten1 + " > " + hovaten2);
                
                
            }
            
        }
        System.out.println("=>"+result);
    }
    
    
}
