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
public class TInhgiatribieuThucT {
    public static void main(String[] args) {
        int n,t=0;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        n=sc.nextInt();
        do {            
            if (n<1) {
                System.out.println("Yêu cầu nhập lại! "); break;
            } else {
                for (int i = 1; i <= n ; i++) {
               t=t+i*i;
                   
                }
                System.out.println("kết quả "+t);
            }
        } while (n<1);
    }
    
}
