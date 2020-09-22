/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapIfelse;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class SoLonandSoNho {
    /*
     Viết chương trình C++ để nhập một số nguyên bất kỳ từ bàn phím và
    in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100.
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập vào số nguyên: ");
        n=sc.nextInt();
        if (n>100) {
            System.out.println(n + " > " + "100");
        }else{
        System.out.println(n + " < " + "100");
        }
    }
}
