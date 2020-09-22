/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Tran Y
 */
public class ParamDoiso {
    public static void main(String[] args) {
        int  result ,n;
        n = 3;
        result = square(n);
        System.out.println("bình phương của 3 là " + result);
        n = 4;
        result = square(n);
        System.out.println("bình phương của 4 là " + result);
        
    }

    private static int square(int i) {
       return i*i;
    }
}
