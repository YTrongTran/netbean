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
public class TinhbieuthucK {
    public static void main(String[] args) {
        int n,count=1;
        float s=0;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("nhập vào 1 số nguyên: ");
        n=sc.nextInt();
        do {            
            if (n<1) {
                System.out.println("yêu cầu nhập lại! "); break;
            } else {
                for (int i = 1; i <= n; i++) {
                    count=count*i;
                     s=s+(float) 1/count;
                 
                }
                System.out.println("kết quả "+s);
            }
        } while (n<1);
        
        
        
    }
}
