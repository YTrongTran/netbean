/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai07fFor {
    public static void main(String[] args) {
        float sum=0;
        int subjects =5;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập " + subjects + " subjects: ");
        for (int i = 0; i < subjects; i++) {
            float mark;
            mark=sc.nextFloat();
            if (mark<0)break; {
                sum+=mark;
            }
        
            if (i>= subjects) {
                System.out.println("avg mark =" +sum/subjects);
            } else {
                System.out.println("Error: Invalid mark!");
            }
        }
        
    }
}
