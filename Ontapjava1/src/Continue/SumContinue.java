/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Continue;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class SumContinue {
    public static void main(String[] args) {
        double number,sum=0.0;
        Scanner sc  = new Scanner(System.in);
        for(int i =1; i< 6;i++){
            System.out.println("Nhap gia tri: ");
            number=sc.nextDouble();
            if (number < 0.0) {
                continue;
            }else {
            sum += number;
            }
        }
        System.out.println("sum"+sum);
    }
    
    
}
