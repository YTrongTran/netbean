/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author Tran Y
 */
public class Calcualte {
    static int cube(int x){
    return x*x;
    }
    public static void main(String[] args) {
        int result = Calcualte.cube(5);
        System.out.println(result);
    }
}
