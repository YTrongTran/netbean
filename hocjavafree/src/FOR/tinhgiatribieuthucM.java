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
public class tinhgiatribieuthucM {
    public static void main(String[] args) {
        int n,count1=1,count2=0;
        float s=0;
        Scanner sc =new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("Nhập vào 1 số nguyên bất kì: ");
        n=sc.nextInt();
        do {            
            if (n<1) {
                System.out.println("Yêu cầu nhập lại!");break;
            } else {
                for (int i = 1; i <= n ; i++) {
                    count1 = count1*i;//tính giai thừa từ mẫu số.
                    
                    count2 = count2+i;
                    s= s+(float) count2/count1;
                }
                System.out.println("kết quả: "+dc.format(s));
            }
        } while (n<1);
    }
}
