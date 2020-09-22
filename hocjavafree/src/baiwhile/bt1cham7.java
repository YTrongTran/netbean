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
public class bt1cham7 {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên bất kỳ: " );
        n=sc.nextInt();
        while (n<=0){
            System.out.println("đề nghị nhập lại n: ");
            n=sc.nextInt();
        }
        while(n>0){
            n=n/10;
            count++ ; //tăng lên 1 đvị
        
        }
        System.out.println("kết quả "+count);
            
        
    }
    
}
