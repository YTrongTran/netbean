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
public class KiemtraAmDuong {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp số a: ");
        a=sc.nextInt();
        System.out.println("nhâp số b: ");
        b=sc.nextInt();
        if (a >0 && b >0) {
            System.out.println("số dương");
        }else{
               System.out.println("số âm");
        }
 
       
    }
}
