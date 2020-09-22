/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switchcase;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham6 {
    public static void main(String[] args) {
        char ketqua;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cách nào cho phép người dùng khai báo 1 giá trị boolean trong 4 đáp án sau? ");
        System.out.println("a . boolean lool3 = \"1\";");
        System.out.println("b . boolean lool2 = \"true\";");
        System.out.println("c . boolean lool1 = true");
        System.out.println("d . boolean lool4 = 1");
        System.out.println("bạn chọn: ");
        ketqua=sc.next().charAt(0);
        switch(ketqua){
            case 'a':
            case 'b':
            case 'd':
                System.out.println("kết quả không đúng.");
                break;
            case 'c':
                System.out.println("kết quả đúng");
                break;
            default:
                System.out.println("câu trả lời nằm ngoài kết quả");
                
        }
    }
}
