/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Break;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class SumBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, number;
        do {
            System.out.print("Người dùng nhập vào gía trị: ");
            number = sc.nextDouble();
            if (number < 0) {
                break;
            }else {
             sum += number;
            }
        } while (true);
        System.out.println("sum " + sum);
    }
}
