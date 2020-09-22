/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahelloispace;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HelloName {
    public static void main(String[] args) {
        //Scan
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name:");
        
        String name =sc.nextLine();
        System.out.println("Hello "+ name);
        
        System.out.println("Input age");
        int age = sc.nextInt();
        System.out.println("age:"+age);
        
        System.out.println("Input mark");
        
        float mark= sc.nextFloat();
        System.out.println("Mark:"+mark);
       
    }
    
}

