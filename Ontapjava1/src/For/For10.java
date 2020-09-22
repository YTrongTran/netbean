/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author Tran Y
 */
public class For10 {
    public static void main(String[] args) {
       int product;
       //vòng lặp for gồm 3 thành phần
        for (int num = 1; num <= 5; num++) {
            product = num *10;
            
            System.out.println(num + " * 10 = " + product);
        }// chuyển điều khiển quay lại vòng lặp for mỗi khi lặp xong
       
    }
}
