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
public class TinhgiatricuabieuthucS {
    public static void main(String[] args) {
        int n;
        long s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên bất kì:");
        n=sc.nextInt();
        do {            
            if (n<0) {
                System.out.println("Yêu cầu nhập lại!");break;
            } else {
                if (n>=0) {
                    for (int i = 0; i <= n; i++) {
                        s=s+(2*i+1);
                    }
                   System.out.println("kết quả: "+s);
                }
                 
            }
        } while (n<0);
    }
    
}
