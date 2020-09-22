/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class chuyendo {

    public static void main(String[] args) {

//Viết chương trình nhập vào độ Celsius bất kỳ từ bàn phím. Sau đó đổi độ này 
// sang độ Fahrenheit và hiển thị kết quả ra màn hình.
//Hướng dẫn: Công thức chuyển đổi từ độ Celcius sang độ Fahrenheit như sau:
//Độ Fahrenheit = (9/5) * Độ Celsius + 32.
        double celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ Celsius");
        celsius = sc.nextDouble();
        double fahrenheit = (double) 9 / 5 * celsius + 32;
        System.out.println(celsius + " độ C = " + fahrenheit + "độ F ");
    }
}
