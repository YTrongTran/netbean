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
public class PTB2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
     double a,b,c;
     //ax*2 + bx + c=0
        // nhập a b c
     double denta,x1,x2;
        a=1; b=4; c=6;
        denta=b*b-4*a*c;
        System.out.println("denta:" +denta);
        
        
        if (a==0) {
            //thì phương trình có bậc nhất
            //y=-c/b
            double x;
            x=-c/b;
            System.out.println("x= "+x);
            System.out.println("phương trình bậc nhất");
            
        } else {
            if (denta>0) {
            //pt có 2 nghiệm pb:
            x1= (-b+Math.sqrt(denta))/(2*a);
            x2= (-b-Math.sqrt(denta))/(2*a);
            System.out.println("x1=" +x1);
            System.out.println("x2= "+x2);
            
        } else {
            if (denta==0) {
                double x;
              x=-b/(2*a);
                System.out.println("x=" +x);
                System.out.println("phương trình có 1 nghiệm kép");
                
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
            
        }
        
        
        
        
     
    }
}
