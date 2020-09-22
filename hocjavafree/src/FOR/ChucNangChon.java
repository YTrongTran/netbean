/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChucNangChon {

    public static void main(String[] args) {
        int suluachon;
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("1. nhập");
            System.out.println("2. xem");
            System.out.println("3. thoát");
             do {            
            System.out.println("bấm số lựa chọn từ 1 đến 3");
            suluachon=sc.nextInt();
        } while ((suluachon < 1)||(suluachon >3));
             switch(suluachon){
                 case 1:
                     System.out.println("Bạn chọn chức năng nhâp!");
             break;
                 case 2:
                     System.out.println("Bạn chọn chức năng xem");
                             break;
                 case 3:
                     System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                     System.exit(0);break;
                 
                    
                     
             }
        }
       

    }

}
