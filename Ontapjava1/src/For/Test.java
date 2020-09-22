/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author Tran Y
 */
public class Test {
    public static void main(String[] args) {
        char a = '*';
        for (char i = 0; i < 5; i++) {
            System.out.println(a);
            for (char j = i; j <= i; j--) {
                  System.out.print(a );
            }
        }
    }
}
