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
public class HoaHongDaiLy {

    /*
Cửa hàng của bạn nhận gửi bán sản phẩm cho một công ty khác và sau mỗi tháng bạn cần tính toán số tiền hoa hồng bạn nhận được.
Với mức hoa hồng theo doanh số bán hàng như sau
5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
20 % nếu tổng doanh số là lớn hơn 300 triệu.
     */
    public static void main(String[] args) {
        double ds, hh;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập danh số: ");
        ds = sc.nextDouble();
        if (ds <= 100) {
            hh = ds * 0.05;
            System.out.println("Voi tong doanh so la : " + ds);
            System.out.println("hoa hồng nhận được là : " + hh);
        } else if (ds <= 300) {
            hh = ds * 0.1;
            System.out.println("Voi tong doanh so la : " + ds);
            System.out.println("hoa hồng nhận được là : " + hh);
        }else {
         hh = ds*0.2;
         System.out.println("Voi tong doanh so la : " + ds);
            System.out.println("hoa hồng nhận được là : " + hh);
        }
       
    }
}
