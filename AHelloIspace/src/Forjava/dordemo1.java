/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forjava;

/**
 *
 * @author Administrator
 */
public class dordemo1 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                sum += i;
                count++;

            }

        }

        System.out.println("count" + count);
        System.out.println("count:" + sum);
        System.out.println("avg" + sum / count);
    }
}
