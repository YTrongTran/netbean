/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtichcase;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class Tinhthangnam {

    //phân tích
    /**
     * Tháng ở đây là tháng theo lịch dương(Lịch Tây). Những tháng sau có 31
     * ngày :1,3,5,7,8,10,12. Những tháng sau có 30 ngày : 4,6,9 ,11 Riêng tháng
     * 2 : nếu là năm nhuận thì có 29 ngày, năm thường có 28 ngày Năm nhuận là
     * năm thỏa mản một trong 2 điều kiện: Điều 1: Năm đó chia hết cho 4 nhưng
     * không chia hết cho 100 Điều 2: Năm đó chia hết 400 Chẳng hạn, năm 2000 là
     * năm nhuận vì mặc dù nó không thỏa mãn đk 1 nhưng nó thỏa mãn đk 2 là chia
     * hết cho 400; năm 2016 là năm nhuận vì 2016 chia hết cho 4 nhưng không
     * chia hết cho 100
     *
     */
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n: ");
        n = sc.nextInt();

        switch (n) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + n + " là tháng có 30 ngày");
                break;
                
            case 2:
                System.out.println("Nhập năm vào để xác định tháng 29 hay 28 ngày vì: ");
                m=sc.nextInt();
                
                if ((m % 4 == 0 )&& (m % 100 != 0 )||(m % 400 == 0 )) {
                    System.out.println("Đây là năm nhuận");
                    System.out.println("tháng " + n +" là tháng có 29 ngày");
                    
                }else{
                    System.out.println("Đây là năm thường");
                System.out.println("tháng " + n + " là tháng có 28 ngày");
                }
                break;
            default:
                 System.out.println("tháng " + n + " là tháng có 31 ngày");
                break;
           
                
        }
    }
}
