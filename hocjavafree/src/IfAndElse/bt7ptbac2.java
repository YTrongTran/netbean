/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfAndElse;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt7ptbac2 {
    //ax2+bx+c=0
    public static void main(String[] args) {
        int a,b,c;
    int denta;
    Scanner sc = new Scanner(System.in);
        System.out.println("nhập số A: ");
        a=sc.nextInt();
        System.out.println("nhập số B: ");
        b=sc.nextInt();
        System.out.println("nhập số C");
        c=sc.nextInt();
        if (a==0) {
            int x;
            x=-c/b;
            System.out.println("phương trình có một nghiệm duy nhất: "+x);
        } else {
            if (a!=0) { 
                denta=b*b-4*a*c;
                if (denta>0) {      
             double x1,x2;
                x1=(-b+Math.sqrt(denta))/(2*a);
                x2=(-b-Math.sqrt(denta))/(2*a);
                System.out.println("kết quả x1 "+x1);
                System.out.println("kết quả x2 "+x2);
                    
                } else {
                    if (denta==0) {
                        int x;
                        x=-b/2*a;
                        System.out.println("phương trình có 1 nghiệm kép x1=x2= " +x);
                        
                    } else {
                        if (denta<0) {
                            System.out.println("phương trình vô nghiệm.");
                        }
                    }
                    
                }
            } 
        }
    }
    
    
}
