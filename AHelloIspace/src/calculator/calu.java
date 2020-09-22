/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.nio.file.Files;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class calu {

    public static void main(String[] args) {
        
        while (true) {            
               double numberA, numberB, result;
        String pheptinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A,B");
        numberA = sc.nextDouble();
        numberB = sc.nextDouble();
        System.out.println("phep tinh(+-*/)");
        pheptinh = sc.next();
        if (pheptinh.equals("+")) {
            result = numberA + numberB;
            System.out.println(numberA+"+"+numberB + "=" + result);
            
            
        }
        else{
            if (pheptinh.equals("+")) {
               
                
            } 
            else{
                System.exit(0);
            }
        }
        

}
              
    }}


