/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dowhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham2 {
    public static void main(String[] args) {
        int username =123,password=1234567;
        int user,pass;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("nhập username: ");
            user=sc.nextInt();
            System.out.println("nhập password: ");
            pass=sc.nextInt();
        } while ((username != user)|| (password != pass));
        System.out.println("welocome"+user);
    }
    
}
