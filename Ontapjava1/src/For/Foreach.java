/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class Foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str []= new String [5] ;
        System.out.println("nhập vào chuổi:");
        for (int i = 0; i < str.length; i++) {
            System.out.print("chuổi thứ " + (i+1) + " : ");
            str [i] =sc.nextLine();
        } 
        System.out.println("sau khi nhập vào ta có");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
