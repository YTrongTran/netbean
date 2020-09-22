/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static calculator.cult2.numberA;

/**
 *
 * @author Administrator
 */
public class culto3 {

    public static void main(String[] args) {
        addAB(4, 5);
        subAB(9, 5);
        nhanAB(10, 5);
        chiaAB(10, 2);
    }

    public static void addAB(int numberA, int numberB) {
        int result = numberA + numberB;
        System.out.println("kết quả: " + result);
    }

    public static void subAB(int numberA, int numberB) {
        int result = numberA - numberB;
        System.out.println("kết quả:" + result);
    }

    public static void nhanAB(int numberA, int numberB) {
        int result = numberA * numberB;
        System.out.println("kết quả:" + result);
    }

    public static void chiaAB(int numberA, int numberB) {
        int result = numberA / numberB;
        System.out.println("kết quả: " + result);
    }
}
