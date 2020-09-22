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
public class Bai01cuphapwhile {
    //while (){
//các lệnh
//}
    //lệnh
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
       
       
        while (sum<100) {   
             System.out.println("nhập các số nguyên: ");
              n =sc.nextInt();
            sum+=n;
            
        }
        System.out.println("kết quả " +sum);
    }
}
