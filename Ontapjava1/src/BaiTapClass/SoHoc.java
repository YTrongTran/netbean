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
public class SoHoc {

    //khai báo các thuộc tính
    private int number1;
    private int number2;

    //tạo hàm tạo không đối số
    public SoHoc() {
    }
    //hàm tạo đầy đủ

    public SoHoc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    //get và set

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số Number1: ");
        number1 = sc.nextInt();
        System.out.printf("Nhập số Number2: ");
        number2 = sc.nextInt();
    }

    public void printInfo() {
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        
    }

    public void additon() {
        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " +result);
    }

    public void subtract() {
        int result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " +result);
    }

    public void multi() {
        int result = number1 * number2;
       System.out.println(number1 + " * " + number2 + " = " +result);
    }

    public void division() {
        int result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " +result);
    }
    public static void main(String[] args) {
        SoHoc  sh  = new SoHoc();
        sh.inputInfo();
        sh.printInfo();
        sh.additon();
        sh.subtract();
        sh.multi();
        sh.division();
    }
}
