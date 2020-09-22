/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoHomeWord;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class GiaiPtBac2 {

    public static void main(String[] args) {
        //ax2+bx
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a:");
        a = sc.nextDouble();
        System.out.print("nhập số b:");
        b = sc.nextDouble();
        System.out.print("nhập số c:");
        c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình Vô nghiệm");
                } else {
                    System.out.println("Phương trình Vô số nghiệm");
                }
            } else {
                System.out.println("phương trình có 1 nghiệm: X= " + (-c / b));
            }
        } else {
        delta = b*b - 4*a*c;
        x1 =(-b+Math.sqrt(delta))/(2*a);
        x2 =(-b-Math.sqrt(delta))/(2*a);
            if (delta <0) {
                System.out.println("delta vô nghiệm");
            }else{
                if (delta == 0 ) {
                    System.out.println("delta có 1 nghiệm kép X= " + (-b/(2*a)));
                }else{
                    System.out.println("phương trình có 2 nghiệm");
                    System.out.println("x1 = " + x1 );
                    System.out.println("x2 = " + x2);
                }
                    
            }
        }

    }
}
