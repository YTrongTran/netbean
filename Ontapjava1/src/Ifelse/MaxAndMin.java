/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

/**
 *
 * @author Tran Y
 */
public class MaxAndMin {

    public static void main(String[] args) {
        int a = 3, b = 5, c = 2, d = 4, max,min;
        max = d;
        min =a;
        if (a > max) {
            max =a;
        } else if (b > max) {
           max =b;
        } else if (c > max) {
             max = c;
        }
        System.out.println("max " + max);
        
    if (b < min) {
            min = b;
        } else if (c < min) {
           min =c;
        } else if (d < min) {
            min = d;
        }
        System.out.println("min " + min);
        

    }
}
