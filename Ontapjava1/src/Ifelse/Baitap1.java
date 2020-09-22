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
public class Baitap1 {
    //nhập một số N bất kỳ từ bàn phím

    static float n;

    static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bất số N  ");
        n = sc.nextFloat();

    }
    //1. n có phải là số nguyên không?

    static boolean kiemtraSoNguyen() {
        if (n % 1 == 0) {
            return true;
        }
        return false;
    }
// 2. Kiểm tra  tính chẳn lẻ của N

    static void kiemtraChanLe() {
        if (kiemtraSoNguyen() == true) {
            if (n % 2 == 0) {
                System.out.println(n + "là số chẳn");
            } else {
                System.out.println(n + "là số lẻ");
            }
        } else {
            System.out.println(n + " Không chẳn và không lẻ");
        }

    }
    //3. N có phải là số chẳn dương không và n có phải là số lẻ âm không

    static void kiemtraChanDuong() {
        if (kiemtraSoNguyen() == true) {
            if (n > 0 && n % 2 == 0) {
                System.out.println(n + "là số chẵn dương ");
            } else {
                System.out.println(n + "không phải là số chẵn dương ");
            }
        } else {
            System.out.println(n + " không thỏa mãn điều kiện để xét tính chẳn dương");

        }

    }

    static void kiemtraLeAm() {
        if (kiemtraSoNguyen() == true) {
            if (n < 0 && n % 2 != 0) {
                System.out.println(n + " là số lẻ âm");
            } else {
                System.out.println(n + " không phải là số lẻ âm");
            }
        } else {
            System.out.println(n + " không thỏa mãn điều kiện để xét tính lẻ âm");
        }

    }

    static void kiemtrachinhPhuong() {

        if (n > 0 && Math.sqrt(n) % 1 == 0) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải là số chính phương");
        }

    }

    static void kiemtraDacBiet() {

        if (n > 0 && n < 1000 && kiemtraSoNguyen() == true) {
            int donVi = (int) n % 10;
            int chuc = (int) (n / 10) % 10;
            int tram = (int) (n / 100) % 10;
            if (Math.pow(donVi, 3) + Math.pow(chuc, 3) + Math.pow(tram, 3) == n) {
                System.out.println(n + " là số đặc biệt");
            } else {
                System.out.println(n + " không phải là số đặc biệt");
            }

        } else {
            System.out.println(n + "không xác định là số đặc biệt");
        }

    }

    public static void main(String[] args) {
        nhap();
        if (kiemtraSoNguyen() == true) {
            System.out.println(n + " là số nguyên");
        } else {
            System.out.println(n + "  không phải là số nguyên");
        }
        kiemtraChanLe();
        kiemtraChanDuong();
        kiemtraLeAm();
        kiemtrachinhPhuong();
        kiemtraDacBiet();
    }
}
