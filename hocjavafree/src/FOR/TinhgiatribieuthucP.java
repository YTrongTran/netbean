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
public class TinhgiatribieuthucP {

    public static void main(String[] args) {
        int n;
        long p = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên: ");
        n=sc.nextInt();
        do {            
            if (n<0) {
                System.out.println("Yêu cầu nhập lại!");break;
                
            } else{
                if (n>=0) {
                    
                    for (int i = 0; i <=n; i++) {
                        
                        p=p*(2*i+1);
                        
                    }
                    System.out.println("kết quả :"+p);
                }
            }
        } while (n<0);
        
    } 
}
