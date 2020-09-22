/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabttrenlop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class maxABC {
    //nhập vào 3 số abc in ra số Lớn nhất
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 3 so:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       max=a;
       
        if (max<b) {
            max=b;
        }
        if (max< c) {
           max=c;
            
        }
         //in ra
         System.out.println("max la:" +max);
            
        
        
    }
    
}
