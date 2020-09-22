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
public class bt1for {
    public static void main(String[] args) {
        int n,number,sum=0;
        double avgNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vầy số nguyên.");
        n=sc.nextInt();
        for (int count = 1; count <= n; count++) {
            System.out.println("nhập vào số thứ " +count+":");
            number=sc.nextInt();
            sum+=number;
        }
        avgNumber= (double) sum/n;
        System.out.println("kết quả "+avgNumber);
       
    }
}
