/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhwhile;

/**
 *
 * @author Administrator
 */
public class wihledem3 {

    //tinh tong cac so le <100
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.println("=>" + i);
                sum = sum + i;
//            sum+=i;
            }
            i++;
        }
        System.out.println("sum"+sum);

    }
}
