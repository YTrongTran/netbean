/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiwhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham4 {
    public static void main(String[] args) {
        int n,i=1;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri so nguyen n la: ");
        n=sc.nextInt();
        while(i <= n ){
        sum+=i*i;//sum=sum+(i*i);
        i++;
        }
        System.out.println("=>"+sum);
    }
    
}
