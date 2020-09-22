/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class baif5lenhSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bạn nhập grade:");
        String userInput ;
        userInput = sc.next();
        char grade = userInput.charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Execellent! "); break;
            case 'B':
                System.out.println("Great!");
            case 'C':
                
            case 'D':
                System.out.println("Well done !"); break;
            case 'F':
                System.out.println("Sorry, you failed."); break;
            default:
                System.out.println("Errol! Invalid grade.");
        
        }
    }
}
