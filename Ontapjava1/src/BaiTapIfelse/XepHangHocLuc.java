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
public class XepHangHocLuc {

    /*
Viết chương trình C++ xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ.
Viết chương trình C++ xếp hạng học lực của học sinh. 
Chương trình nhập 3 điểm là điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ và xác định học lực dựa trên nguyên tắc:

Điểm trung bình >= 9.0 là hạng A.
    
Điểm trung bình >=7.0 và < 9.0 là hạng B

Điểm trung bình >=5.0 và < 7.0 là hạng C

Điểm trung bình <5.0 là hạng F
    
     */
    public static void main(String[] args) {
        double baiKT, baiGK, baiCK, dTB;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm bài kiểm tra: ");
        baiKT = sc.nextDouble();
        System.out.print("Nhập điểm bài Giữa kỳ: ");
        baiGK = sc.nextDouble();
        System.out.print("Nhập điểm bài Cuối kỳ: ");
        baiCK = sc.nextDouble();
        dTB = (baiKT + baiGK + baiCK) / 3;
        System.out.println("Điểm trung bình" + dTB);
        if (dTB >= 9.0) {
            System.out.println("là hạng A.");
        } else if (dTB >= 7.0 && dTB < 9.0) {
            System.out.println("là hạng B.");
        } else if (dTB >= 5.0 && dTB < 7.0) {
            System.out.println("là hạng C.");
        } else if (dTB < 5.0) {
            System.out.println("là hạng F.");
        }

    }
}
