/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapClass;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class SoNguyenTo {

    private int a;

    public SoNguyenTo() {
        a = 0;
    }

    public SoNguyenTo(int x) {
        if (isSoNguyenTo(x) == true) {
            this.a = x;
            System.out.printf("%d là số nguyên tố được lưu trữ: " , x);
            System.out.println("Số nguyên tố tiếp theo là: " +SoNguyenToTiepTheo());
        }else{
            System.out.printf("%d không phải là số nguyên tố, không được lưu trữ." , x);
        }

    }

    public boolean isSoNguyenTo(int x) {
        boolean nt = true;
        if (x < 2) {
            nt = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    nt = false;
                    break;
                }
            }
        }
        return nt;
    }

    public int SoNguyenToTiepTheo() {
        int nguyentotieptheo;
        int i = 0;
        while (true) {
                if (isSoNguyenTo(this.a + ++i) == true) {
                return this.a+i;
            }
        }
    }
    public static void main(String[] args) {
        int x ;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời bạn nhập 1 số: ");
        x =sc.nextInt();
        SoNguyenTo nt = new SoNguyenTo(x);
    }
}
