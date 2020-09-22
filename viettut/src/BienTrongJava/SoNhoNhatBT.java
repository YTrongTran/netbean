/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienTrongJava;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class SoNhoNhatBT {

    public static void main(String[] args) {
        int a, b, c, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yêu cầu nhập 3 số trên: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min =a;
        if (min>=b) {
            min=b;
            
        }
        if (min >=c) {
            min =c;
        }
        System.out.println("kết quả "+min);
    }

}
