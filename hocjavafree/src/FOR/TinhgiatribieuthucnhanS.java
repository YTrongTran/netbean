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
public class TinhgiatribieuthucnhanS {

    public static void main(String[] args) {
        int n, sum = 0,count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên: ");
        n = sc.nextInt();
        do {
            if (n < 0) {
                System.out.println("Yêu cầu nhập lại! ");
                break;
            } else {
                for (int i = 1; i <= n; i++) {
                    count=count*i;
                    sum=sum+count;
                    
                    
                }
                System.out.println("kết quả "+sum);
            }

        } while (n<1);

    }

}
