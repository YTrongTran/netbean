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
public class bai1ifelseiff {
    //nhập vào 1 số bất kỳ từ bàn phím để ss vs số 10.
    public static void main(String[] args) {
        float number;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập vào số cần so sánh: ");
        number=sc.nextFloat();
        if (number<10) {
            System.out.println("số nhỏ hơn 10");
        } else {
            if (number==10) {
                System.out.println("số vừa nhập = nhau");
            } else {
                System.out.println("số vừa nhập lớn hơn 10");
            }
        }
    }
}
