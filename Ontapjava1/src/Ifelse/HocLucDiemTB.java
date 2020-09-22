/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class HocLucDiemTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float diemtrungbinh;
        System.out.println("Mời bạn nhập điểm trung bình");
        diemtrungbinh =sc.nextFloat();
        if (diemtrungbinh >= 9) {
            System.out.println("Xuất Sắc");
        }else if(diemtrungbinh >= 8){
        
        System.out.println("Giỏi");
        
        }else if(diemtrungbinh >= 6.5){
        
        System.out.println("Khá");
        }else if(diemtrungbinh >= 5){
        System.out.println("Trung bình");
        }else{
        // nếu tất cả điều kiện trên sai
            System.out.println("học lưc yếu");
        }
        
       
        
    }
}
