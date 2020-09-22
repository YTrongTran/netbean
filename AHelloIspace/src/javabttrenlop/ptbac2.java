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
public class ptbac2 {
    //ax2+bx+c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input:");
        /*//c2*/
        double a,b,c;
        double denta,x1,x2;
        a=1;b=6;c=5;
        if (a==0) {
           double x;
            x = -c/b;
            System.out.println("x=" +x);
            
        } else {
            denta=b*b-4*c*a;
        System.out.println("denta:"+denta);
        if (denta>0) {
          x1= (-b + Math.sqrt(denta)) / (2*a);
        System.out.println("x1= "+x1);
            x2= (-b + Math.sqrt(denta)) / (2*a);
            System.out.println("x2=" +x2);
        } else {
            if (denta==0) {
                System.out.println("pt co 1 nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }
        }
        }
        
       
        
        //c1
//        int a,b,c;
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        double denta;
//        denta= b*b-4*a*c;
//        if (denta<0) {
//            System.out.println("pt vo nghiem:");
//        } 
//        else {
//         double d1=(-b+ Math.sqrt(denta))/2*a;
//        double  d2=(-b- Math.sqrt(denta))/2*a;
//        //in ra kết quả
//        System.out.println("denta" + Math.sqrt(denta));
//        System.out.println("x1: "+ d1);
//        System.out.println("x2: "+ d2);
           
//    }
    
    }

}

