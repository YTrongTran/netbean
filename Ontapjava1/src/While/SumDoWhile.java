/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package While;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class SumDoWhile {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int sum =0,i;
        do {            
            System.out.println("Nhập giá trị từ người dùng: ");
            i =sc.nextInt();
            sum += i;//sum = sum+i
            
        } while (i != 0);
        System.out.println("sum " + sum);
    }
}
