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
public class Test {

    // tháng có 31 ngày 135781012
    // tháng có 30 46911
    //đk 1 : n/4 ko chia hết cho 100 và chia hết 400=> nêú n là năm nhuận thì có 29 ngày ngược lại 28 ngày
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tháng bất kì : ");
        number = sc.nextInt();
          
             switch (number) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày trong 1 năm");
                break;
            case 2:
                int n;
                System.out.print("Nhập năm bất kì vào đây: ");
                n=sc.nextInt();
                if (n%4 ==0 && n%100 !=0 || n%400 == 0) {
                    System.out.println("Đầy là năm nhuận thì tháng có 29 ngày");
                }else{
                System.out.println("Đây không phải là năm nhuận thì tháng có 28 ngày");
                }
                break;       
            default:
                System.out.println("tháng có 31 ngày trong 1 năm");
                break;
        }

        
       
    }

}
