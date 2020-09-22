/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtichcase;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class NguyenAmPhuAm {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char n;
        System.out.println("nhập vào ký tự");
        n = (char) System.in.read();
        if ((n >= 'A' && n <= 'Z') || (n >= 'a' && n <= 'z')) {
            switch (n) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'o':
                case 'O':
                case 'i':
                case 'I':
                case 'u':
                case 'U':
                    System.out.println(n + " là những nguyên âm");
                    break;
                default:
                     System.out.println(n + " là những phụ âm");
                     
            }
        }else{
            System.out.println(n + " không phải là nguyên âm và phụ âm !");
        }
    }
}
