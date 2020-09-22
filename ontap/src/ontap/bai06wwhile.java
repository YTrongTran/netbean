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
public class bai06wwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count,number;
        System.out.println("nhập 1 số:");
        number = sc.nextInt();
        count =1;
        while (count <= number) {            
            System.out.println(count + ",");
            count++;
        }
        System.out.println("BOOM!");
    }
}
