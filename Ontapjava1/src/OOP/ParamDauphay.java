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
public class ParamDauphay {
    //định nghĩa method
    public static int getIntegerSum(int a, int b){
    return a+b;
    }
    public static int multiplyInteger(int a, int b){
    return a*b;
    }
    
    public static void main(String[] args) {
        System.out.println("10+20 = " +getIntegerSum(10, 20));
        System.out.println("10 * 20 = " + multiplyInteger(10, 20));
    }
}
