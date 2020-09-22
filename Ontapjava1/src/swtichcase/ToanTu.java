/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtichcase;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class ToanTu {
    public static void main(String[] args) {
        double a,b,result;
        char op;
        Scanner sc = new Scanner(System.in);
        //yeu cau nguoi dung nhap toan tu
        System.out.println("nhap toan tu (either +,-,* or /):");
        op =sc.next().charAt(0);
        
        System.out.println("nhap so a");
        a =sc.nextDouble();
        System.out.println("nhap so b");
        b=sc.nextDouble();
        
        switch(op){
            case '+':
                result = a+b;
                System.out.println("result " + result);
                break;
            case '-':
                result = a-b;
                 System.out.println("result " + result);
                break;
            case '*':
                result = a*b;
                 System.out.println("result " + result);
                break;
                case '/':
                    result = a/b;
                     System.out.println("result " + result);
                break;
                default: 
                    result = 0;
                    break;
        }
        
    }
}
