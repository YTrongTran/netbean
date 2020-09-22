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
public class InsoTuoi {

    public static void main(String[] args) {
        /*
         * Viết chương trình để nhập tuổi và in ra kết quả nếu tuổi học sinh
         * đó không đủ điều kiện vào học lớp 10. Giả sử bạn là một nhân viên
         * chịu trách nhiệm nhập tên danh sách báo danh của các học sinh đến độ
         * tuổi vào lớp 10. Bạn cần viết chương trình  để nhập tuổi và in ra
         * kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
         */
        Scanner sc =new Scanner(System.in);
        String name;
        Integer age;
        System.out.print("Nhap ho va ten:");
        name =sc.nextLine();
        System.out.print("Nhap tuoi:");
        age =sc.nextInt();            
           if (age >= 15) {
            System.out.println("đủ điều kiện vào học lớp 10");
           
        }else{
            System.out.println("không đủ điều kiện vào học lớp 10");
           
        }
    
    }
}
