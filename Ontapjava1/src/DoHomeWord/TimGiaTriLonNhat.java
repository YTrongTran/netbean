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
public class TimGiaTriLonNhat {

    public static void main(String[] args) {
        //cách 1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số a:");
//        a=sc.nextInt();
//        System.out.println("nhập số b:");
//        b=sc.nextInt();
//        System.out.println("nhập số c:");
//        c=sc.nextInt();
//        max =c;
//        if (a > max) {
//            max =a;
//                   }
//        if (b > max) {
//            max =b;
//           
//        }
//        System.out.println("max = " + max);
//cách 2
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a:");
        a = sc.nextInt();
        System.out.println("nhập số b:");
        b = sc.nextInt();
        System.out.println("nhập số c:");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("số lớn nhất " + a);
        } else if(b>a && b>c){
              System.out.println("số lớn nhất " + b);
        }else if(c>a && c>b){
        System.out.println("số lớn nhất " + c);
        }
    }
}
