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
public class TraveMotMethod {
    public static void main(String[] args) {
        int result;
        //gọi phương thức và giá trị trả về
        result = square();
        System.out.println("Square value of 10 là " + result);
    }

    private static int square() {
        return 10*10;
    }
}
