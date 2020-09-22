/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class trycatchdemo {
    public static void main(String[] args) {
        
      
        try {
            //doan code nghi ngờ
            //phát sinh ra lỗi
            Scanner sc = new Scanner(System.in);
            System.out.println("input a,b");
         int numberA, numberB;
        numberA=sc.nextInt();
        numberB=sc.nextInt();
      
        System.out.println("kết quả:+result");
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
            
        }
         
    }
    
    
}
