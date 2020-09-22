/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TinhgiatriBieuThucQ {
    public static void main(String[] args) {
        int n;
        float sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào giá trị số nguyên: ");
        n=sc.nextInt();
        DecimalFormat dcf =new DecimalFormat("#.##");
        do {            
            if (n<1) {
                System.out.println("Yêu cầu nhập lại! ");break;
            } else {
                for (int i = 1; i <= n; i++) {
                   sum=sum + (float) 1/i;
                }
                System.out.println("kết quả: "+dcf.format(sum));
            }
        } while (n<1);
        
        
    }
    
}
