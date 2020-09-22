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
public class TinhTienDienThoai {

    /*
Viết chương trình C++ để tính cước điện thoại bàn cho một hộ gia đình với các thông số như sau:
Phí thuê bao bắt buộc là 25 nghìn.
600 đồng cho mỗi phút gọi của 50 phút đầu tiên.
400 đồng cho mỗi phút gọi của 150 phút tiếp theo.
200 đồng cho bất kỳ mỗi phút nào sau 200 phút đầu tiên.
     */
    public static void main(String[] args) {
        double requiredvoted = 25000;
        double phut, phi = 0, tongtien;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cước điện thoại của mỗi hộ gia đình");
        phut = sc.nextDouble();
        if (phut > 200) {
            phi = (phut - 200) * 200 + 400 * 150 + 600 * 50;
        } else {
            if (phut > 50) {
                phi = (phut - 50) * 400 + 600 * 50;
            } else {
                phi = phut * 600;
            }
        }
        tongtien = phi + requiredvoted;
        System.out.println("tổng tiền: " + tongtien);
    }
}
