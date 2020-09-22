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
public class ForNoKhoiTao {
    public static void main(String[] args) {
        // biến đếm num được khai báo và khởi tạo ở ngoài vòng lặp for
        int num =1;
        // biến boolen flag được khởi tạo là false;
        boolean flag = false;
        /*
        Vòng lặp for được thực thi với giá trị ban đầu của biến num là 1
        và vòng lặp trong khi giá trị của  biến flag là not true
        */
        
        for(; !flag; num++){
            System.out.println("giá trị của số " + num);
            if (num == 5) {
                flag = true;
            }
        }// kết thúc vòng lặp
    }
}
