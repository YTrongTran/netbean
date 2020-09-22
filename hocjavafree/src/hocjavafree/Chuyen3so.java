/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocjavafree;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Chuyen3so {
    // chuyển đổi 3 số đó thành số nhị phân, thập lục phân, bát phân,hiển thị ra màn hình  
    public static void main(String[] args) {
      int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        a=sc.nextInt();
        System.out.println("input b:");
        b=sc.nextInt();
        System.out.println("input c:");
        c=sc.nextInt();
       //chuyển đổi thành hệ cơ số nhị phân
        System.out.println("\n");
        System.out.println("Hệ cơ số nhị phân của " + a +"="+ Integer.toBinaryString(a));
        System.out.println("Hệ cơ số nhị phân của " + b +"="+ Integer.toBinaryString(b));
        System.out.println("Hệ cơ số nhị phân của " + c +"="+ Integer.toBinaryString(c));
        System.out.println("===============================");
        System.out.println("\n");
        System.out.println("Hệ sơ số thập lục phân của " + a + "=" + Integer.toHexString(a));
        System.out.println("Hệ sơ số thập lục phân của " + b + "=" + Integer.toHexString(b));
        System.out.println("Hệ sơ số thập lục phân của " + c+ "=" + Integer.toHexString(c));
        //chuyển đổi thành hệ cơ số bát phân
        System.out.println("===============================");
        System.out.println("\n");
        System.out.println("Hệ cơ số bát phân của " + a + "=" + Integer.toOctalString(a));
        System.out.println("Hệ cơ số bát phân của " + b + "=" + Integer.toOctalString(b));
        System.out.println("Hệ cơ số bát phân của " + c + "=" + Integer.toOctalString(c));
        
    }
    
}
