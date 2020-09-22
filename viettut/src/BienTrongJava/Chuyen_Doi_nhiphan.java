/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienTrongJava;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class Chuyen_Doi_nhiphan {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 3 số: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        /*
        chuyển đổi hệ thập phân sang nhị phân
        */
         System.out.println("------------------------");
        System.out.println("chuyển đổi hệ thập phân sang nhị phân là ");
        System.out.println("nhị phân a: "+Integer.toBinaryString(a));
        System.out.println("nhị phân b: "+Integer.toBinaryString(b));
        System.out.println("nhị phân c: "+Integer.toBinaryString(c));
        /*
        chuyển đổi hệ thập phân sang thập lục phân
        */
        System.out.println("------------------------");
        System.out.println("chuyển đổi hệ thập phân sang thập lục phân");
        System.out.println("lục phân a: "+Integer.toHexString(a));
        System.out.println("lục phân b: "+Integer.toHexString(b));
        System.out.println("lục phân c: "+Integer.toHexString(c));
        /*
        chuyển đổi hệ thập phân sang bát phân
        */
         System.out.println("------------------------");
        System.out.println("chuyển đổi hệ thập phân sang bát phân");
        System.out.println("bát phân a: "+Integer.toOctalString(a));
        System.out.println("bát phân b: "+Integer.toOctalString(b));
        System.out.println("bát phân c: "+Integer.toOctalString(c));
    }
}
