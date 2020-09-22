/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class Iflong {

    //ax2 + bx +c =0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, delta, x1, x2;
        System.out.println("Nhập số a");
        a = sc.nextFloat();
        System.out.println("Nhập số b");
        b = sc.nextFloat();
        System.out.println("Nhập số c");
        c = sc.nextFloat();
        delta = b*b - 4*a*c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình bậc nhất là" + (Float)(-c / b));
            }
        }else{
            
            delta = b*b - 4*a*c;
            if (delta < 0) {
                // delta âm
                System.out.println("Phương trình vô nghiệm !");
            }else if(delta == 0 ){
                System.out.println("Phương có nghiệm kép"+(Float)(-b/(a*2)));
            }else if(delta > 0){
            System.out.println("phương trình có 2 nghiệm phân biệt");
            x1 =(float)(-b + Math.sqrt(delta))/(2*a);
                System.out.println("nghiệm x1 là: "+ x1);
            x2 =(float)(-b - Math.sqrt(delta))/(2*a);
            System.out.println("nghiệm x2 là: "+ x2);
            }
            
        }
    }
}
