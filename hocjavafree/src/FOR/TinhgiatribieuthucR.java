/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TinhgiatribieuthucR {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri: ");
        n = sc.nextInt();
        do {
            if (n < 1) {
                System.out.println("Yeu cau nhap lai! ");
                break;
            } else {
               
                for (int i = 1; i <= n; i++) {
                   int count =1; 
                    for (int j = 1; j <= i; j++) {
                        count=count*i;
                    }
                    sum=sum+count;

                }
                System.out.println("ket qua "+sum);             
            }
        } while (n < 1);
    }

}
