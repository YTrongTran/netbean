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
public class bt1cham3 {

    public static void main(String[] args) {
        char ketqua, con='y';
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn đáp án: ");
        System.out.println("a. int number =123");
        System.out.println("b. int number =\"123\" ;");
        System.out.println("c. int number = \'1\';");
        System.out.println("d. boolean number = 1");
        System.out.println("bạn chọn 1 trong 4.");
        do {
            ketqua = sc.next().charAt(0);
            if (ketqua=='a') {
                System.out.println("kết quả đúng");break;
                
            } else {if (ketqua=='q') {
                    System.out.println("thì thoát chương trình");
                } else {if (ketqua=='b'||ketqua=='c'||ketqua=='d') {
                    System.out.println("kết quả sai.");break;
                } else {
                    System.out.println("câu trả lời bạn nằm ngoài chương trình");
                            
                }
                System.out.println("bạn đoán lại nhập lại q tiếp tục ấn y");
                con=sc.next().charAt(0);
                if (con=='q') {
                    System.out.println("thoát chương trình");
                }
                }
            }
        } while (con=='y');
    }
}
