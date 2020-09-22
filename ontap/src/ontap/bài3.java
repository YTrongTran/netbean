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
public class bài3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diem;
        System.out.println("nhập điểm: ");
        diem=sc.nextDouble();
        if (diem>=8.0) {
            System.out.println("anh học sinh giỏi");
        } else {
            if (diem>=7.5) {
                System.out.println("anh học sinh khá");
            } else {
                if (diem>=5) {
                    System.out.println("anh học sinh trung bình");
                } else {
                    System.out.println("anh học yếu");
                }
            }
        }
    }
}
