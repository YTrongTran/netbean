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
public class bai08Contine {
    public static void main(String[] args) {
       float sum =0;
               
       int i=0, subjects =3;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập the mark for " + subjects + " subjects: ");
        while (i < subjects) {            
            System.out.println("#" + (i+1) + " : ");
            float mark =sc.nextFloat();
            if (mark<0) {
                System.out.println(mark+ "ignred");
                continue;
            }
            sum+=mark;
            i++;
        }
               System.out.println("avg = "+sum/subjects);
    }
}
