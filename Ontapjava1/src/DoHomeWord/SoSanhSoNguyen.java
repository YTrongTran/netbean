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
public class SoSanhSoNguyen {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri a:");
        a = sc.nextInt();
        System.out.print("Nhap gia tri b: ");
        b = sc.nextInt();
        System.out.println("");
                
        if(a>b){
            System.out.println(a  + " > " + b);
        }else {
            System.out.println(b + " > " + a);
        }
    }
}
