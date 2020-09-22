/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoHomeWord;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class KiemTraChanLe {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n:");
        n=sc.nextInt();
        if (n%2 ==0 ) {
            System.out.println("số chẵn");
        }else {
            System.out.println("số lẻ");
        }
    }
}
