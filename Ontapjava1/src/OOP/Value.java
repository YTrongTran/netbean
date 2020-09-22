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
public class Value {
    //nhận giá trị Square các số từ 1 đến 5
    public static int getSquare(int x){
    return x*x;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 5 ; i++){
            int resutl = getSquare(i);
            System.out.println("Bình phương của " + i + "of" + resutl);
        }
    }
}
